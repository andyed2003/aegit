package ac.soton.fmusim.codegen;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.cdt.core.model.CModelException;
import org.eclipse.cdt.core.model.CoreModel;
import org.eclipse.cdt.core.model.ICProject;
import org.eclipse.cdt.core.model.IPathEntry;
import org.eclipse.cdt.core.model.ISourceEntry;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.ui.PlatformUI;
import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.TranslatedDecl;
import org.eventb.codegen.il1.VariableDecl;
import org.eventb.codegen.il1.impl.Il1PackageImpl;
import org.eventb.codegen.il1.translator.AbstractTranslateEventBToTarget;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.il1.translator.provider.ITranslationRule;
import org.eventb.codegen.il1.translator.utils.IL1CodeFiler;
import org.eventb.codegen.tasking.RMLDataStruct;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;
import org.eventb.codegen.templates.util.TemplateException;
import org.eventb.core.IEventBProject;
import org.eventb.core.IMachineRoot;
import org.eventb.core.ast.ITypeEnvironment;
import org.eventb.core.ast.Type;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.Variable;
import org.eventb.emf.persistence.factory.RodinResource;
import org.osgi.service.prefs.BackingStoreException;
import org.rodinp.core.IRodinDB;
import org.rodinp.core.IRodinFile;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

import FmiModel.BooleanType;
import FmiModel.CausalityType;
import FmiModel.CoSimulationType;
import FmiModel.DocumentRoot;
import FmiModel.FmiModelDescriptionType;
import FmiModel.FmiModelFactory;
import FmiModel.FmiScalarVariable;
import FmiModel.InitialType;
import FmiModel.InputType;
import FmiModel.InputsType;
import FmiModel.IntegerType;
import FmiModel.ModelStructureType;
import FmiModel.ModelVariablesType;
import FmiModel.OutputType;
import FmiModel.OutputsType;
import FmiModel.RealType1;
import FmiModel.StringType;
import FmiModel.util.FmiModelResourceImpl;
import ac.soton.fmusim.components.EventBComponent;
import ac.soton.fmusim.components.Port;
import ac.soton.fmusim.components.diagram.edit.parts.EventBComponentEditPart;

// This class is the entry point for the translation proper. 
// UNLIKE the existing C code generator, it does not extend AbstractProgramIL1Translator.
// It is not related to the extensibility mechanism implemented by Chris, i.e. does not
// use an extension point. However, protected objects, and those nested within, do use it.

public class FMUTranslator extends AbstractTranslateEventBToTarget {
	// The target source folder for the translation - it is static
	// to enable the IL1 C translator to reference it.
	public static final String EXTERNAL_SOURCE_FOLDER = "external";
	public static final String GENERATED_SRC_FOLDER = "src";
	public static final String TEMPLATES_SRC_FOLDER = "templates";
	// The name of the generated header file
	public static final String COMMON_HEADER_PARTIAL = "common";
	public static final String COMMON_HEADER_FULL = COMMON_HEADER_PARTIAL
			+ ".h";
	// Declaration of Types handled by the translator.
	public static final String REAL = "Real";
	public static final String STRING = "String";
	public static final String BOOLEAN = "Boolean";
	public static final String INTEGER = "Integer";
	private static final String VARIABLE_REF_INTEGER = "i";
	private static final String VARIABLE_REF_BOOLEAN = "b";
	private static final String VARIABLE_REF_REAL = "r";
	private static final String VARIABLE_REF_STRING = "s";
	// The source rodin project.
	public static IRodinProject sourceRodinProject = null;
	// The workhorse
	private static TaskingTranslationManager taskingTranslationManager = null;
	// The target project for the new C source code.
	public static IProject targetProject = null;
	// The target folder for generated source code.
	private IFolder generatedSourceFolder = null;
	public final static TargetLanguage targetLanguage = new TargetLanguage(
			"FMI_C");
	// The modelDescription file, as an emf model.
	private ModelDescriptionManager modelDescriptionsManager = new ModelDescriptionManager();
	// Keep a local count here value references of variable arrays.
	// This is reset to zero for each machine.
	private int realVariableCount = 0;
	private int stringVariableCount = 0;
	private int integerVariableCount = 0;
	private int boolVariableCount = 0;
	private static IL1TranslationManager il1TranslationManager;
	private static EventBComponent eventBComponent;
	private List<String> inputPortNames;
	private List<String> outputPortNames;

	// Translate the selected Composed Machine/Event-B Machine to FMU(s)
	public void translateToFMU(IStructuredSelection s)
			throws BackingStoreException, CoreException, IOException,
			URISyntaxException, IL1TranslationUnhandledTypeException,
			TemplateException, IL1TranslationException,
			TaskingTranslationException, FMUTranslatorException {
		// check to see that the user has selected a machine
		// for translation
		EventBComponentEditPart selectedEditPart = null;
		if (!(s.getFirstElement() instanceof EventBComponentEditPart)) {
			throw new FMUTranslatorException(
					"Only a component edit part can be selected for translation to an FMU");
		} else {
			System.out.println("Translating to FMU C from the diagram");
			selectedEditPart = (EventBComponentEditPart) s.getFirstElement();
		}

		// The existing translator is set up to use the machineRoot so we should
		// get this.
		IStructuredSelection newSelection = new StructuredSelection();
		eventBComponent = (EventBComponent) selectedEditPart.getNotationView()
				.getElement();
		Machine emfMachine = eventBComponent.getMachine();
		if (emfMachine == null) {
			throw new FMUTranslatorException(
					"Only a machine can be translated to an FMU");
		}

		Resource resource = emfMachine.eResource();
		if (resource instanceof RodinResource) {
			RodinResource rodinResource = (RodinResource) resource;
			IRodinProject rodinProject = rodinResource.getRodinFile()
					.getRodinProject();
			IEventBProject eventBProject = (IEventBProject) rodinProject
					.getAdapter(IEventBProject.class);
			IMachineRoot machineRoot = eventBProject.getMachineRoot(emfMachine
					.getName());
			newSelection = new StructuredSelection(machineRoot);
		}
		super.setSelection(newSelection);
		doTranslateToFMU(newSelection);
	}

	private void doTranslateToFMU(IStructuredSelection s)
			throws TaskingTranslationException, BackingStoreException,
			CoreException, IOException, URISyntaxException,
			FMUTranslatorException, CModelException, TemplateException,
			IL1TranslationException, IL1TranslationUnhandledTypeException,
			RodinDBException, TaskingTranslationUnhandledTypeException {
		// Initialisations
		MachineRoot machineRoot = (MachineRoot) s.getFirstElement();
		modelDescriptionsManager = ModelDescriptionManager.getDefault();
		// Initialise the tasking translation manager
		Il1PackageImpl.init();
		Il1Factory factory = Il1Factory.eINSTANCE;
		taskingTranslationManager = new TaskingTranslationManager(factory);
		// Generate an IL1 program using existing stage 1 code generator.
		Program program = translateEventBToIL1(machineRoot);
		// Get the rodin project and set the field
		IRodinDB rodinDB = RodinCore.getRodinDB();
		sourceRodinProject = rodinDB.getRodinProject(program.getProjectName());
		// Create a target Directory
		if (getTargetProject(taskingTranslationManager) == false) {
			return;
		}
		// From the program, we can create the modelDescription file
		createModelDescriptionFile(program);
		// copy the external (pre-defined) files across
		ExternalFileHandler fHandler = new ExternalFileHandler();
		fHandler.handleExternalFiles();
		// we can generate the FMU from the IL1program.
		translateIL1ToFMU(program, taskingTranslationManager);
		// reflect the changes in the model, back to the workspace.
		updateResources();
	}

	// DESIGN NOTE !!!
	// How do we prevent the communication events from being translated? Since
	// the master
	// takes care of the communications, we need to ignore synchronizing events.
	// The problem is that when initiating translation from the diagram we have
	// no idea
	// which composed machine describes the synchronizations. There could be a
	// number of
	// composed machines in a single project, involving the machine to be
	// translated.
	// We use the following solution: we preclude the use of shared machines!!!
	// Then we can select events to ignore when they have parameters (since this
	// indicates
	// that they are communicating, because we don't use local variables in
	// events).

	// This method translates Event-B models into an IL1 program
	private static Program translateEventBToIL1(MachineRoot machineRoot)
			throws TaskingTranslationException, BackingStoreException,
			CoreException, IOException, URISyntaxException,
			FMUTranslatorException {
		// indicate to the tasking translation manager that we are undertaking
		// an FMU translation.
		// We need this since the FMU translation type is optional and may well
		// be removed.;
		taskingTranslationManager.setFMUTranslation(true);
		// load the EMF components
		RMLDataStruct loadedEMFComponents = EMFLoader
				.loadEMFMachinesContexts(machineRoot);
		// insert the machineRoot into an array to send to the translator
		List<Object> componentList = new ArrayList<Object>();
		componentList.add(machineRoot);
		Object[] componentArrays = componentList.toArray();

		IFile target = null;
		// Get target's location from the list which is derived from the
		// structured selection.
		target = machineRoot.getResource();
		storeProject(target.getProject(), taskingTranslationManager);

		Program program = taskingTranslationManager.translateToIL1Entry(
				componentArrays, null, null, null, loadedEMFComponents);

		// We delete the temporary subroutines
		EList<Protected> protectedList = program.getProtected();
		for (Protected prot : protectedList) {
			EList<Subroutine> subroutineList = prot.getSubroutines();
			List<Subroutine> tmpSubroutine = new ArrayList<Subroutine>();
			for (Subroutine subroutine : subroutineList) {
				if (!subroutine.isTemporary()) {
					tmpSubroutine.add(subroutine);
				}
			}
			if (tmpSubroutine.size() != subroutineList.size()) {
				subroutineList.clear();
				subroutineList.addAll(tmpSubroutine);
			}
		}
		saveBaseProgram(program, targetFile(target));
		// We reset this flag, since we have finished.
		taskingTranslationManager.setFMUTranslation(false);
		return program;
	}

	// This method is equivalent to CProgramIL1Translator, tailored for
	// use with FMI translation.
	// It translates protected objects (from FMU Machines) to FMU
	// implementations.
	private void translateIL1ToFMU(Program program,
			TaskingTranslationManager taskingTranslationManager)
			throws IL1TranslationUnhandledTypeException, RodinDBException,
			TaskingTranslationUnhandledTypeException {
		il1TranslationManager = new IL1TranslationManager();
		il1TranslationManager.getCommunicatingSubroutines().addAll(
				taskingTranslationManager.getCommunicatingSubroutines());
		// /////////////////////////////////il1TranslationManager.currentTargetLanguage
		// = ;
		// These are FMU specific headers. The first is for configuration
		il1TranslationManager.addIncludeStatement("#include \"config.h\"");
		il1TranslationManager
				.addIncludeStatement("#include \"fmiFunctions.h\"");
		// This is for my FMI Declarations. It contains a
		// description of my FMI component, for instance.
		il1TranslationManager.addIncludeStatement("#include \"myFMIDecls.h\"");
		ArrayList<String> code = null;
		// Translation Rules
		Map<IProject, List<ITranslationRule>> translationRules = loadTranslatorRules();
		il1TranslationManager.setTranslatorRules(translationRules);
		// Types Rules
		Map<IProject, List<ITranslationRule>> translationTypeRules = loadTranslatorTypeRules();
		il1TranslationManager.setTranslatorTypeRules(translationTypeRules);
		String parentDirectoryPath = getFilePathFromSelected();
		if (parentDirectoryPath != null) {
			ArrayList<ClassHeaderInformation> headerInfo = il1TranslationManager
					.getClassHeaderInformation();
			ArrayList<String> globalDecls = translatedGlobalDecls(program);
			// make the file system ready.
			String newDirectoryPath = generatedSourceFolder.getRawLocation()
					.toString() + File.separatorChar;
			EList<Protected> protectedList = program.getProtected();
			// TRANSLATE EACH protected object
			for (Protected p : protectedList) {
				code = il1TranslationManager.translateIL1ElementToCode(p,
						getTargetLanguage());
				code.add(0, "#include \"" + COMMON_HEADER_FULL + "\"");
				code.add("// EndProtected");
				// Generate the header files.
				// Each protected file just includes "common.h" which includes
				// the other
				// files. Get the global decls to pass to the header.
				generateFMUHeaders(headerInfo, newDirectoryPath,
						il1TranslationManager, globalDecls);
			}
			generateGlobalHeader(headerInfo, newDirectoryPath,
					il1TranslationManager, globalDecls);
		}
	}

	private boolean getTargetProject(
			TaskingTranslationManager taskingTranslationManager)
			throws CoreException, TaskingTranslationException,
			FMUTranslatorException {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot root = workspace.getRoot();
		shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		DirectoryDialog dialog = new DirectoryDialog(shell);
		String string = dialog.open();
		if (string == null) {
			return false;
		}
		IPath path = new Path(string);
		List<String> segments = Arrays.asList(path.segments());
		targetProject = root.getProject(segments.get(segments.size() - 1));
		// add the new project the list of things to be updated in the UI
		resourceUpdateList.add(targetProject);
		// create C source folder in the project called "src" for generated
		// source
		// and external for inherited code
		generatedSourceFolder = createCSourceFolder(targetProject,
				GENERATED_SRC_FOLDER);
		createCSourceFolder(targetProject, EXTERNAL_SOURCE_FOLDER);
		return true;
	}

	private IFolder createCSourceFolder(IProject targetProject,
			String newDirectoryName) throws CoreException, CModelException,
			FMUTranslatorException {
		// obtain a model,project and folder
		CoreModel cModel = CoreModel.getDefault();
		ICProject cProject = cModel.create(targetProject);
		// This is where this 'important' target source directory is created!!!
		IFolder targetSourceFolder = targetProject.getFolder(newDirectoryName);
		targetSourceFolder.create(true, true, null);
		// create a new sourceEntry (i.e. identifies this folder as a C source
		// folder)
		ISourceEntry newSourceEntry = CoreModel
				.newSourceEntry(targetSourceFolder.getFullPath());
		// now add it to the cProject info, by creating a new list of entries.
		if (!cProject.exists()) {
			throw new FMUTranslatorException(
					"Aborting: the target project does not have a C nature");
		}
		IPathEntry[] existingPathEntries = cProject.getRawPathEntries();

		List<IPathEntry> newEntries = new ArrayList<IPathEntry>(
				existingPathEntries.length);
		// add existingPathEntries to newEntries
		newEntries.addAll(Arrays.asList(existingPathEntries));
		// add the new sourceEntry
		newEntries.add(newSourceEntry);
		// set the pathEntry values in the project
		cProject.setRawPathEntries(
				newEntries.toArray(new IPathEntry[newEntries.size()]), null);
		return targetSourceFolder;
	}

	private void createModelDescriptionFile(Program program)
			throws IOException, TaskingTranslationException, CModelException,
			CoreException {
		// retrieve the (one and only) fmuMachine being translated
		Machine machine = taskingTranslationManager.getFMUMachineList().get(0);

		// Reset the value reference array indices for each machine.
		realVariableCount = 0;
		stringVariableCount = 0;
		integerVariableCount = 0;
		boolVariableCount = 0;
		// Each fmuMachine will have its own DocumentRoot
		DocumentRoot docRoot = FmiModelFactory.eINSTANCE.createDocumentRoot();
		// add this machine documentroot to the list
		modelDescriptionsManager.getDocumentRoot().add(docRoot);
		// set various values
		FmiModelDescriptionType descriptionType = FmiModelFactory.eINSTANCE
				.createFmiModelDescriptionType();
		// Add the modlStructure Attribute
		ModelStructureType modelStructureType = FmiModelFactory.eINSTANCE.createModelStructureType();
		descriptionType.setModelStructure(modelStructureType);
		
		docRoot.setFmiModelDescription(descriptionType);
		descriptionType.setFmiVersion("2.0");
		descriptionType.setGenerationTool("EB2FMU");
		descriptionType.setAuthor("University of Southampton");
		XMLGregorianCalendar xmlGC = makeDate();
		descriptionType.setGenerationDateAndTime(xmlGC);
		descriptionType.setGuid("GUID_" + machine.getName() + "_"
				+ xmlGC.toXMLFormat());
		descriptionType.setModelName(machine.getName());
		descriptionType.setNumberOfEventIndicators(0);
		// This is a co-simulation
		CoSimulationType coSimType = FmiModelFactory.eINSTANCE
				.createCoSimulationType();
		descriptionType.getCoSimulation().add(coSimType);
		coSimType.setModelIdentifier(machine.getName());
		// This is where we store the FMI scalar variables
		ModelVariablesType modelVarsType = FmiModelFactory.eINSTANCE
				.createModelVariablesType();
		descriptionType.setModelVariables(modelVarsType);
		// Get the info to obtain the type environment
		IRodinFile mchFile = sourceRodinProject.getRodinFile(machine.getName()
				+ ".bum");
		MachineRoot root = (MachineRoot) mchFile.getRoot();
		EList<Variable> variableList = machine.getVariables();
		// get the FMI type from the type environment
		ITypeEnvironment typeEnv = taskingTranslationManager
				.getTypeEnvironment(root);
		// extract a list of input/output port names
		setupInputOutputPortNames();
		// Iterate through the machine's variables and generate FMIScalar
		// values
		TreeIterator<EObject> contents = program.eAllContents();
		// variable decl list is used to translate variables to scalars
		ArrayList<VariableDecl> variableDeclList = createVariableDeclList(contents);

		for (Variable var : variableList) {
			variableToFMIScalar(modelVarsType, typeEnv, var, variableDeclList, descriptionType);
		}
		
		// END OF BUILD modelDescription.xml
		
		// Now deal with persisting it.
		// Create a descriptions folder.
		String fileName = machine.getName()
				+ "."
				+ FmiModelFactory.eINSTANCE.getEPackage().getName()
						.toLowerCase();
		File newFile = createNewFile(fileName, "descriptions");
		String netUri = newFile.toURI().toString();
		URI emfURI = URI.createURI(netUri);
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(emfURI);
		if (resource instanceof FmiModelResourceImpl) {
			FmiModelResourceImpl fmiModelRes = (FmiModelResourceImpl) resource;
			fmiModelRes.setEncoding("UTF-8");
		}
		resource.getContents().add(docRoot);
		resource.save(Collections.EMPTY_MAP);
	}// end of createModelDescriptionFile(...);

	// create a new file, with fileName, in the named subFolder of 'the'
	// targetProject.
	private File createNewFile(String fileName, String subFolderName)
			throws CoreException, IOException {
		IFolder newFolder = targetProject.getFolder(subFolderName);
		if (!newFolder.exists()) {
			newFolder.create(true, true, null);
		}

		// construct the new fileName for the model description
		String directoryPath = newFolder.getRawLocation().toString()
				+ File.separatorChar;
		// construct the new fileName path for the model description
		String fPathName = directoryPath + fileName;
		File newFile = new File(fPathName);
		boolean success = newFile.createNewFile();
		// force creation of a new file
		if (!success) {
			newFile.delete();
			newFile.createNewFile();
		}
		return newFile;
	}

	// The method populates the ModelVariables segment with scalar
	// variables, generated from the variable's type etc.
	private void variableToFMIScalar(ModelVariablesType modelVarsType,
			ITypeEnvironment typeEnv, Variable var,
			ArrayList<VariableDecl> variableDeclList, FmiModelDescriptionType descriptionType) {
		Type type = typeEnv.getType(var.getName());
		// Create and set an fmiScalar value for each variable
		FmiScalarVariable scalar = FmiModelFactory.eINSTANCE
				.createFmiScalarVariable();

		modelVarsType.getScalarVariable().add(scalar);
		scalar.setName(var.getName());
		String typeString = getFMITypeString(type);

		if (inputPortNames.contains(var.getName())) {
			// set the causality in the scalar
			scalar.setCausality(CausalityType.INPUT);
			scalar.setInitial(InitialType.EXACT);
			// set the input name in the modelStructureType
			createModelStructureInput(var, descriptionType);
			
		} else if (outputPortNames.contains(var.getName())) {
			// set the causality in the scalar
			scalar.setCausality(CausalityType.OUTPUT);
			// set the output name in the modelStructureType
			createModelStructureOutput(var, descriptionType);
		}
		// Add a type if it is an integer
		if (typeString.equals(INTEGER)) {
			scalar.setValueReference(integerVariableCount);
			integerVariableCount++;
			IntegerType integerType = FmiModelFactory.eINSTANCE
					.createIntegerType();
			scalar.setInteger(integerType);
			if (scalar.getCausality() == CausalityType.INPUT) {
				// input causality requires an initial 'start' value
				for (VariableDecl varDecl : variableDeclList) {
					if (varDecl.getIdentifier().equals(var.getName())) {
						integerType.setStart(Integer.parseInt(varDecl
								.getInitialValue()));
						break;
					}
				}
			}
		}
		// else if it is a real
		else if (typeString.equals(REAL)) {
			scalar.setValueReference(realVariableCount);
			realVariableCount++;
			RealType1 realType = FmiModelFactory.eINSTANCE.createRealType1();
			scalar.setReal(realType);
			if (scalar.getCausality() == CausalityType.INPUT) {
				// input causality requires an initial 'start' value
				for (VariableDecl varDecl : variableDeclList) {
					if (varDecl.getIdentifier().equals(var.getName())) {
						realType.setStart(Double.parseDouble(varDecl
								.getInitialValue()));
						break;
					}
				}
			}
		}
		// elseif it is a string
		else if (typeString.equals(STRING)) {
			scalar.setValueReference(stringVariableCount);
			stringVariableCount++;
			StringType stringType = FmiModelFactory.eINSTANCE
					.createStringType();
			scalar.setString(stringType);
			if (scalar.getCausality() == CausalityType.INPUT) {
				// input causality requires an initial 'start' value
				for (VariableDecl varDecl : variableDeclList) {
					if (varDecl.getIdentifier().equals(var.getName())) {
						stringType.setStart(varDecl.getInitialValue());
						break;
					}
				}
			}
		}
		// elsif it is a boolean
		else if (typeString.equals(BOOLEAN)) {
			scalar.setValueReference(boolVariableCount);
			boolVariableCount++;
			BooleanType boolType = FmiModelFactory.eINSTANCE
					.createBooleanType();
			scalar.setBoolean(boolType);
			if (scalar.getCausality() == CausalityType.INPUT) {
				// input causality requires an initial 'start' value
				for (VariableDecl varDecl : variableDeclList) {
					if (varDecl.getIdentifier().equals(var.getName())) {
						boolType.setStart(Boolean.parseBoolean(varDecl
								.getInitialValue()));
						break;
					}
				}
			}
		}
	}

	private void createModelStructureInput(Variable var, FmiModelDescriptionType descriptionType) {
		ModelStructureType modelStructure = descriptionType.getModelStructure();
		if(modelStructure.getInputs() == null){
			InputsType inputsType = FmiModelFactory.eINSTANCE.createInputsType();
			modelStructure.setInputs(inputsType);
		}
		InputType input = FmiModelFactory.eINSTANCE.createInputType();
		input.setName(var.getName());
		modelStructure.getInputs().getInput().add(input);
		System.out.println();
	}

	private void createModelStructureOutput(Variable var, FmiModelDescriptionType descriptionType) {
		ModelStructureType modelStructure = descriptionType.getModelStructure();
		if(modelStructure.getOutputs() == null){
			OutputsType outputsType = FmiModelFactory.eINSTANCE.createOutputsType();
			modelStructure.setOutputs(outputsType);
		}
		OutputType output = FmiModelFactory.eINSTANCE.createOutputType();
		output.setName(var.getName());
		modelStructure.getOutputs().getOutput().add(output);
	}

	private ArrayList<VariableDecl> createVariableDeclList(
			TreeIterator<EObject> contents) {
		ArrayList<VariableDecl> variableDeclList = new ArrayList<VariableDecl>();
		while (contents.hasNext()) {
			EObject obj = contents.next();
			if (obj instanceof VariableDecl) {
				variableDeclList.add((VariableDecl) obj);
			}
		}
		return variableDeclList;
	}

	private void setupInputOutputPortNames() {
		// used to define fmiGets and fmiSets functions
		EList<Port> inputPorts = eventBComponent.getInputs();
		EList<Port> outputPorts = eventBComponent.getOutputs();
		// used to find causality
		inputPortNames = new ArrayList<String>();
		outputPortNames = new ArrayList<String>();
		for (Port p : inputPorts) {
			inputPortNames.add(p.getName());
		}
		for (Port p : outputPorts) {
			outputPortNames.add(p.getName());
		}
	}

	private XMLGregorianCalendar makeDate() {
		DatatypeFactory df = null;
		Date date = new Date();
		try {
			df = DatatypeFactory.newInstance();
		} catch (DatatypeConfigurationException dce) {
			throw new IllegalStateException(
					"Exception while obtaining DatatypeFactory instance", dce);
		}
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(date.getTime());
		XMLGregorianCalendar xmlGC = df.newXMLGregorianCalendar(gc);
		return xmlGC;
	}

	// This code generates a common header
	private void generateGlobalHeader(
			ArrayList<ClassHeaderInformation> headerInformation,
			String directoryName, IL1TranslationManager translationManager,
			ArrayList<String> globalDecls) {
		// Now sort out header files
		// For common header
		ClassHeaderInformation commonHeader = new ClassHeaderInformation();
		commonHeader.setClassName(COMMON_HEADER_PARTIAL);

		// Add headers manually, then add common
		// class for compiler specific code
		commonHeader.getHeaderEntries().addAll(
				translationManager.getIncludeStatements());

		translationManager.addIncludeStatement("#include <stdlib.h>");
		// If the C translator (legacy code) has inserted a stdio include
		// then we will remove it from the common code

		// Add the header files to include in the initial data
		for (ClassHeaderInformation c : headerInformation) {
			String headerName = c.getClassName() + ".h";
			if (!headerName.equalsIgnoreCase("common.h")) {
				commonHeader.getHeaderEntries().add(
						"#include \"" + headerName + "\"");
			}
		}
		// Add any global declarations
		commonHeader.getHeaderEntries().addAll(globalDecls);

		headerInformation.add(commonHeader);

		if (translationManager.getCompilerDependentExecutableCodeBlock().size() > 0) {
			ArrayList<String> commonCode = new ArrayList<String>();
			// commonCode.add(codeGenerateTimestamp);
			commonCode.add("#include \"" + COMMON_HEADER_FULL + "\"");
			commonCode.addAll(formatCode(translationManager
					.getCompilerDependentExecutableCodeBlock(),
					translationManager));
			IL1CodeFiler.getDefault().save(commonCode, directoryName,
					"common.c", il1TranslationManager);
		}

		// Save the common header files for this FMU
		for (ClassHeaderInformation c : headerInformation) {
			String headerName = c.getClassName();
			String headerPreBlock = c.getClassName().toUpperCase() + "_H";

			ArrayList<String> headerCode = new ArrayList<String>();
			// headerCode.add(codeGenerateTimestamp);
			headerCode.add("#ifndef " + headerPreBlock);
			headerCode.add("#define " + headerPreBlock);

			for (String i : c.getHeaderEntries()) {
				headerCode.add(i);
			}

			headerCode.add("#endif");
			headerCode.add(""); // blank line

			IL1CodeFiler.getDefault().save(headerCode, directoryName,
					headerName + ".h", il1TranslationManager);
		}

	}

	// Create the file associated with the output
	// The sourceRes is the container of the MainClass
	// element that we want to transform
	protected static String targetFile(IFile source) throws URISyntaxException {
		java.net.URI location = source.getLocationURI();
		IPath p = new Path(location.getPath());
		IPath newPath = p.removeFileExtension();
		String path = newPath + ".il1";
		return path;
	}

	protected static void saveBaseProgram(Program program, String filename)
			throws IOException {
		URI uri = URI.createFileURI(filename);
		Resource outResource = new XMLResourceFactoryImpl().createResource(uri);
		outResource.getContents().add(program);
		outResource.save(null);
	}

	private static void storeProject(IProject project,
			TaskingTranslationManager translationManager) {
		translationManager.setProject(project);
	}

	@Override
	protected TargetLanguage getTargetLanguage() {
		return targetLanguage;
	}

	// formatCode is unused ???? But we have it because we do make use
	// of other Abstract methods etc.
	@Override
	protected ArrayList<String> formatCode(ArrayList<String> code,
			IL1TranslationManager translationManager) {
		return null;
	}

	// We do not use this part of the interface.
	@Override
	protected void saveToFile(ArrayList<String> codeToSave,
			ArrayList<ClassHeaderInformation> headerInformation,
			Program program, String directoryName,
			IL1TranslationManager translationManager) {
		// Intentionally blank
	}

	private ArrayList<String> translatedGlobalDecls(Program program) {
		ArrayList<String> globalDecls = new ArrayList<String>();
		// get and translate the global declarations
		EList<Declaration> globalDeclList = program.getDecls();
		for (Declaration decl : globalDeclList) {
			ArrayList<String> translatedDeclList = null;
			try {
				translatedDeclList = il1TranslationManager
						.translateIL1ElementToCode(decl, targetLanguage);
			} catch (IL1TranslationUnhandledTypeException e) {
				e.printStackTrace();
			}
			if (translatedDeclList != null) {
				globalDecls.addAll(translatedDeclList);
			}
		}
		return globalDecls;
	}

	// Generate the headers for this FMU
	private void generateFMUHeaders(
			ArrayList<ClassHeaderInformation> headerInformation,
			String directoryName, IL1TranslationManager translationManager,
			ArrayList<String> globalDecls) {

		if (translationManager.getCompilerDependentExecutableCodeBlock().size() > 0) {
			ArrayList<String> commonCode = new ArrayList<String>();
			// commonCode.add(codeGenerateTimestamp);
			commonCode.add("#include \"" + COMMON_HEADER_FULL + "\"");
			commonCode.addAll(formatCode(translationManager
					.getCompilerDependentExecutableCodeBlock(),
					translationManager));
			IL1CodeFiler.getDefault().save(commonCode, directoryName,
					"common.c", il1TranslationManager);
		}

		// Save the header files for this FMU
		for (ClassHeaderInformation c : headerInformation) {
			String headerName = c.getClassName();
			String headerPreBlock = c.getClassName().toUpperCase() + "_H";

			ArrayList<String> headerCode = new ArrayList<String>();
			// headerCode.add(codeGenerateTimestamp);
			headerCode.add("#ifndef " + headerPreBlock);
			headerCode.add("#define " + headerPreBlock);

			for (String i : c.getHeaderEntries()) {
				headerCode.add(i);
			}

			headerCode.add("#endif");
			headerCode.add(""); // blank line

			IL1CodeFiler.getDefault().save(headerCode, directoryName,
					headerName + ".h", il1TranslationManager);
		}
	}

	protected int getCodeBlock(ArrayList<String> codeIn, int startIdx,
			String endStatement, ArrayList<String> codeOut) {
		int endIdx = startIdx;
		for (int i = startIdx; i < codeIn.size()
				&& !codeIn.get(i).equals(endStatement); i++, endIdx++) {
			codeOut.add(codeIn.get(i));
		}
		return endIdx;
	}

	protected String getName(ArrayList<String> codeIn, String lhs) {
		// Find first occurence of the lhs string
		// As the first lines may be include / import statements
		for (String s : codeIn) {
			if (s.startsWith(lhs)) {
				return s.split(lhs)[1].trim();
			}
		}
		return ""; // something went wrong
	}

	public static String updatePointerVariableName(String action,
			Declaration d, IL1TranslationManager translationManager)
			throws IL1TranslationException {
		action = translationManager.tokenizeVariablesOperators(action);
		String[] actions = action.split(" ");
		String newAction = "";
		String varName = d.getIdentifier() + "_" + d.getComponentName();

		String varType = FMUTranslator.getVariableRefArrayName(d);

		for (String a : actions) {
			if (a.equals(varName)) {
				String replacement = "c -> " + varType + " [" + varName + "_]";
				newAction = newAction + replacement + " ";
			} else {
				newAction = newAction + a + " ";
			}
		}
		return newAction;
	}

	public static String updateFieldVariableName(String action, Declaration d,
			IL1TranslationManager translationManager)
			throws IL1TranslationException {
		action = translationManager.tokenizeVariablesOperators(action);
		String[] actions = action.split(" ");
		String newAction = "";
		String varName = d.getIdentifier() + "_" + d.getComponentName();

		String varType = FMUTranslator.getVariableRefArrayName(d);

		for (String a : actions) {
			if (a.equals(varName)) {
				String replacement = "mc->" + varType + " [" + varName + "_]";
				newAction = newAction + replacement + " ";
			} else {
				newAction = newAction + a + " ";
			}
		}
		return newAction;
	}

	// Given an eventB type, return its FMI equivalent
	public static String getFMITypeString(Type eventBType) {
		String fmiTypeString = null;
		String eventBTypeString = eventBType.toString();
		if (eventBTypeString.equals(CodeGenTaskingUtils.INT_SYMBOL)) {
			fmiTypeString = INTEGER;
		} else if (eventBTypeString.equals(CodeGenTaskingUtils.BOOL_SYMBOL)) {
			fmiTypeString = BOOLEAN;
		} else if (eventBTypeString.equals(STRING)) {
			fmiTypeString = STRING;
		} else if (eventBTypeString.equals(REAL)) {
			fmiTypeString = REAL;
		}
		return fmiTypeString;
	}

	// Given an IL1 declaration, return its C Type name from the type
	// environment
	public static String getVariableCTypeName(Declaration d) {
		TranslatedDecl translatedDecl = il1TranslationManager
				.translateDeclaration(d, targetLanguage);
		return translatedDecl.getType();
	}

	// Given an IL1 declaration, return its variable reference array name
	public static String getVariableRefArrayName(Declaration d)
			throws IL1TranslationException {
		String declarationType = d.getType();
		if (declarationType.equals(CodeGenTaskingUtils.INT_SYMBOL)) {
			return VARIABLE_REF_INTEGER;
		} else if (declarationType.equals(CodeGenTaskingUtils.BOOL_SYMBOL)) {
			return VARIABLE_REF_BOOLEAN;
		} else if (declarationType.equals(STRING)) {
			return VARIABLE_REF_STRING;
		} else if (declarationType.equals(REAL)) {
			return VARIABLE_REF_REAL;
		} else
			throw new IL1TranslationException("Type not found: "
					+ declarationType);
	}

	// given the fmiTypeString return the variableRefArrayName
	public static String getVariableRefArrayName(String fmiTypeString)
			throws IL1TranslationException {
		if (fmiTypeString.equals(INTEGER)) {
			return VARIABLE_REF_INTEGER;
		} else if (fmiTypeString.equals(BOOLEAN)) {
			return VARIABLE_REF_BOOLEAN;
		} else if (fmiTypeString.equals(STRING)) {
			return VARIABLE_REF_STRING;
		} else if (fmiTypeString.equals(REAL)) {
			return VARIABLE_REF_REAL;
		} else
			throw new IL1TranslationException("Type not found: "
					+ fmiTypeString);
	}
}