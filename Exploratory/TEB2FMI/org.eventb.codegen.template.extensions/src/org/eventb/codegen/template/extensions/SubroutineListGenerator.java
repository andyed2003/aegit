package org.eventb.codegen.template.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.InParameter;
import org.eventb.codegen.il1.OutParameter;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.il1.translator.c.CTranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractIL1TranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractSubroutineIL1Translator;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;
import org.eventb.core.ast.ITypeEnvironment;
import org.eventb.core.ast.Type;
import org.eventb.core.basis.MachineRoot;

import ac.soton.fmusim.codegen.FMUTranslator;

public class SubroutineListGenerator extends AbstractSubroutineIL1Translator
		implements IGenerator {

	private Protected protectedSource = null;
	private IL1TranslationManager translationManager = null;
	private TargetLanguage targetLanguage = null;
	private ClassHeaderInformation headerInfo = null;

	@Override
	public List<String> generate(IGeneratorData data)
			throws IL1TranslationUnhandledTypeException,
			IL1TranslationException {
		List<String> outCode = new ArrayList<String>();
		List<Object> dataList = data.getDataList();
		for (Object obj : dataList) {
			if (obj instanceof Protected) {
				protectedSource = (Protected) obj;
			} else {
				if (obj instanceof IL1TranslationManager) {
					translationManager = (IL1TranslationManager) obj;
					targetLanguage = translationManager
							.getCurrentTranslationTarget();
				}
			}
		}
		// These subroutines all belong to one shared machine/object, so they
		// have a common c source file, and also header file. Lets get/create a header, and store
		// the generated subroutines after processing.
		ArrayList<ClassHeaderInformation> headerList = translationManager.getClassHeaderInformation();
		// look for an existing header for the class
		boolean found = false;
		for(ClassHeaderInformation classHeader: headerList){
			String className = classHeader.getClassName();
			if(className.equals(protectedSource.getName())){
				headerInfo = classHeader;
				// save the headers, this will be used later on
				found = true;
				break;
			}
		}
		
		// if the header did not exist create a new one
		if(!found){
			headerInfo = new ClassHeaderInformation();
			headerInfo.setClassName(protectedSource.getName());
			translationManager.addClassHeaderInformation(headerInfo);
		}
		// now process the subroutines
		processSubroutines(outCode);
		
		return outCode;
	}

	private void processSubroutines(List<String> outCode)
			throws IL1TranslationException,
			IL1TranslationUnhandledTypeException {
		EList<Subroutine> subroutines = protectedSource.getSubroutines();
		for (Subroutine subroutine : subroutines) {
			ArrayList<String> translate = translate(subroutine,
					translationManager, targetLanguage);
			outCode.addAll(translate);
		}
	}

	private String getFMITypeName(String projectName, String machineName,
			String variableName, IL1TranslationManager translationManager) {
		String fmiTypeName;
		MachineRoot root = (MachineRoot) translationManager.getSourceRoot(
				projectName, machineName);
		// get the FMI type from the type environment
		ITypeEnvironment typeEnv = translationManager.getTypeEnvironment(root);
		Type type = typeEnv.getType(variableName);
		// We hard Code the translation of the parameter Type String here

		fmiTypeName = FMUTranslator.getFMITypeString(type);
		return fmiTypeName;
	}

	@Override
	protected ArrayList<String> generateFunction(String name,
			ArrayList<String> parameterDefinitions,
			ArrayList<ArrayList<String>> localVariables, String guardList,
			ArrayList<String> body, boolean isProtected, boolean isEnviron,
			String machineName, Subroutine actualSource,
			IL1TranslationManager translationManager)
			throws IL1TranslationException {
		ArrayList<String> outCode = new ArrayList<String>();

		// For an FMU we know that subroutines are either:
		// 1 - communicating with the master - i.e. an fmiGetXXX, or fmiSetXXX;
		// or
		// 2 - the fmiDoStep subroutine.
		// This should help us to determine the parameters that we need for the
		// subroutine.

		// Signature for Getters 1:
		// fmiStatus fmiGetXXX(fmiComponent c, const fmiValueReference vr[],
		// size_t nvr, fmiInteger value[]);

		// Signature for Setters 1:
		// fmiStatus fmiSetXXX(fmiComponent c, const fmiValueReference vr[],
		// size_t nvr, const fmiInteger value[]);

		// Signature for 2:
		// fmiStatus fmiDoStep(fmiComponent c, fmiReal
		// currentCommunicationPoint,
		// fmiReal communicationStepSize, fmiBoolean
		// noSetFMUStatePriorToCurrentPoint)

		// So - what are we getting? Ints, reals, bools? Let's assume we can
		// tell from the parameters,
		// which are typed, and all the same type - because we enforce that
		// restriction.
		EList<Parameter> formalParams = actualSource.getFormalParameters();
		String fmiTypeName = null;
		String communicationDirection = null;

		// >>>>> // if this has parameter(s) then it must be a getXXX or SetXXX
		// for the master
		if (formalParams.size() > 0) {
			// Get any of the subroutine parameters, they should all be either
			// incoming, or outgoing
			Parameter subroutineParam = formalParams.get(0);
			// we also need the original event parameter to see if it incoming
			// or outgoing
			// FMU Out = master GET
			// ... the setter passes a const array.
			String settersArrayModifier = "";
			if (subroutineParam instanceof OutParameter) {
				communicationDirection = "Get";
			}
			// FMU In = master Set
			else if (subroutineParam instanceof InParameter) {
				communicationDirection = "Set";
				settersArrayModifier = "const ";
			}
			String exampleParamName = subroutineParam.getIdentifier();
			String projectName = actualSource.getProjectName();
			fmiTypeName = getFMITypeName(projectName, machineName,
					exampleParamName, translationManager);

			// Format the parameters
			String fmiAPIparameters = "fmiComponent c, const fmiValueReference vr[], "
					+ "size_t nvr, "
					+ settersArrayModifier // this has been set to 'const' for a setter 
					+ "fmiInteger value[]";

			// Uniquely identify each event name using the machine name
			outCode.add("");
			String inOutSignature = "fmiStatus fmi"
					+ communicationDirection + fmiTypeName + "("
					+ fmiAPIparameters + ")";
			outCode.add(inOutSignature);
			outCode.add("{"); // open function

			// This is where we store the function Declaration that goes into
			// the
			// header for the current C file.
			headerInfo.getHeaderEntries().add(
					inOutSignature + ";");

			// Guards
			if (!guardList.equals("")) {
				outCode.add("// Check to see if guard is met");
				outCode.add("if (" + guardList + ")");
				outCode.add("{"); // open guarded
			}
			// Local variables
			for (ArrayList<String> lVars : localVariables) {
				outCode.addAll(lVars);
			}
			List<String> newBody = new ArrayList<String>();
			// if we have getXXX the create a getter
			if (communicationDirection.equals("Get")) {
				newBody = createXXXGetStatements(fmiTypeName,
						translationManager);
			}
			// else create a setter
			else {
				newBody = createXXXSetStatements(fmiTypeName,
						translationManager);
			}
			outCode.add("// Translated code");
			outCode.addAll(newBody);

			if (!guardList.equals("")) {
				if (isProtected || isEnviron) {
					outCode.add("");
				}
				outCode.add("}"); // close guarded
			}
			outCode.add("return fmiOK;"); // return OK upon successful
											// completion
			outCode.add("}"); // close function
		}
		// >>>>> // else it must be an fmiDOStep subroutine
		else {
			outCode.add("");
			// Format the parameters
			String fmiAPIparameters = "fmiComponent c, fmiReal currentCommunicationPoint,"
					+ " fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint";

			// Uniquely identify each event name using the machine name
			String doStepSignature = "fmiStatus fmiDoStep(" + fmiAPIparameters
					+ ")";
			// This is where we store the function Declaration that goes into
			// the header for the current C file.
			headerInfo.getHeaderEntries().add(doStepSignature + ";");
			outCode.add(doStepSignature);
			outCode.add("{"); // open function

			// Guards
			if (!guardList.equals("")) {
				outCode.add("// Check to see if guard is met");
				outCode.add("if (" + guardList + ")");
				outCode.add("{"); // open guarded
			}

			// Local variables
			for (ArrayList<String> lVars : localVariables) {
				outCode.addAll(lVars);
			}

			List<String> newBody = substituteVariableRefs(body, actualSource,
					translationManager);
			// Body code
			outCode.add("fmi_Component* mc = c;");
			outCode.add("// Translated code");
			outCode.addAll(newBody);

			if (!guardList.equals("")) {
				if (isProtected || isEnviron) {
					outCode.add("");
				}
				outCode.add("}"); // close guarded
			}
			outCode.add("return fmiOK;"); // return OK upon successful
											// completion
			outCode.add("}"); // close function
		}
		return outCode;
	}

	@Override
	protected String generateParameterDefinition(String type,
			String identifier, ParameterType parameterType) {
		String paramDefn = "";

		// Out parameters (to the calling subroutine) will be using the Pointer
		// class.
		switch (parameterType) {
		case OUT:
			paramDefn = type + " *" + identifier;
			break;
		case IN:
		default:
			paramDefn = type + " " + identifier;
			break;
		}

		return paramDefn;
	}

	@Override
	protected AbstractIL1TranslatorUtils getTranslatorUtils() {
		return new CTranslatorUtils();
	}

	private List<String> createXXXGetStatements(String fmiTypeName,
			IL1TranslationManager translationManager)
			throws IL1TranslationException {
		String variableArrayRef = FMUTranslator
				.getVariableRefArrayName(fmiTypeName);
		List<String> newCode = new ArrayList<String>();
		newCode.add("int idx = 0;");
		newCode.add("fmi_Component* mc = c;");
		newCode.add("for(; idx < nvr; idx = idx + 1){");
		newCode.add("value[ vr[idx] ] = mc->" + variableArrayRef
				+ " [ vr[idx] ];");
		newCode.add("}");
		return newCode;
	}

	private List<String> createXXXSetStatements(String fmiTypeName,
			IL1TranslationManager translationManager)
			throws IL1TranslationException {
		String variableArrayRef = FMUTranslator
				.getVariableRefArrayName(fmiTypeName);
		List<String> newCode = new ArrayList<String>();
		newCode.add("int idx = 0;");
		newCode.add("fmi_Component* mc = c;");
		newCode.add("for(; idx < nvr; idx = idx + 1){");
		newCode.add("mc->" + variableArrayRef + " [ vr[idx] ] = "
				+ "value[ vr[idx] ];");
		newCode.add("}");
		return newCode;
	}

	private List<String> substituteVariableRefs(ArrayList<String> body,
			Subroutine actualSource, IL1TranslationManager translationManager)
			throws IL1TranslationException {
		// The body code needs to be converted to use the variable
		// references.
		// get the variable declarations
		EList<Declaration> decls = translationManager.getParentProtected(
				actualSource).getDecls();
		// iterate through each line in the subroutine body
		// to create a new body with substitutions if necessary
		List<String> newBody = new ArrayList<String>();
		for (String line : body) {
			// copy the line to work on
			String modifiedCode = line;
			// for each declaration
			for (Declaration d : decls) {
				// modify the statement where we find the declared variable
				modifiedCode = FMUTranslator.updateFieldVariableName(modifiedCode,
						d, translationManager);
			}
			// if the line has been changed
			if (!line.equals(modifiedCode)) {
				newBody.add(modifiedCode);
			}
			// else add the original line
			else {
				newBody.add(line);
			}
		}
		return newBody;
	}

}
