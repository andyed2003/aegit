package ac.soton.fmusim.codegen.translator.il1tofmuc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.il1.translator.core.AbstractProtectedIL1Translator;
import org.eventb.codegen.templates.util.TemplateException;
import org.eventb.codegen.templates.util.TemplateProcessor;

import FmiModel.BooleanType;
import FmiModel.DocumentRoot;
import FmiModel.FmiScalarVariable;
import FmiModel.IntegerType;
import FmiModel.RealType1;
import FmiModel.StringType;
import ac.soton.fmusim.codegen.FMUTranslator;
import ac.soton.fmusim.codegen.FMUTranslatorHelper;
import ac.soton.fmusim.codegen.FMUTranslatorPlugin;
import ac.soton.fmusim.codegen.ModelDescriptionManager;

public class FMUCProtectedTranslator extends AbstractProtectedIL1Translator {

	@Override
	public ArrayList<String> generateProtectedCode(
			ArrayList<ArrayList<String>> declList,
			ArrayList<ArrayList<String>> subList, String name,
			Protected actualSource, IL1TranslationManager translationManager,
			TargetLanguage targetLanguage) {

		ClassHeaderInformation headerInfo = new ClassHeaderInformation();
		headerInfo.className = actualSource.getName();

		try {
			tryTemplate(actualSource);
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: CoreException :"
					+ TemplateException.extractFullExceptionMessage(e), e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IOException :"
					+ TemplateException.extractFullExceptionMessage(e), e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
		} catch (TemplateException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: TemplateException :", e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
		} catch (IL1TranslationException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IL1TranslationException :"
					+ TemplateException.extractFullExceptionMessage(e), e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
		}

		ArrayList<String> outCode = new ArrayList<String>();
		outCode.add("// FMU: " + name);
		outCode.add("");
		outCode.add("fmiComponent *modelInstances[MaxFMUInstances]; // initialise an empty array of components");
		outCode.add("int conInstanceCount = 0;");
		// Add the instance variable references
		outCode.add("// Variables and constants");
		// we need to add declarations, like "int i[integerArraySize];" for each
		// fmi array type
		String machineName = actualSource.getMachineName();
		List<DocumentRoot> docs = ModelDescriptionManager.getDefault()
				.getDocumentRoot();
		// find the document root for this IL1 protected
		RealType1 r = null;
		IntegerType i = null;
		BooleanType b = null;
		StringType s = null;
		for (DocumentRoot docRoot : docs) {
			if (docRoot.getFmiModelDescription().getModelName()
					.equals(machineName)) {
				// we have found the related modelDescription file, get the
				// scalars
				EList<FmiScalarVariable> scalars = docRoot
						.getFmiModelDescription().getModelVariables()
						.getScalarVariable();
				// for each of the scalars get set to a non-null value to output
				// an an FMI array declaration;
				for (FmiScalarVariable scalar : scalars) {
					if (r == null)
						r = scalar.getReal();
					if (i == null)
						i = scalar.getInteger();
					if (b == null)
						b = scalar.getBoolean();
					if (s == null)
						s = scalar.getString();
					// get the variable name and value reference into a
					// declaration.
					outCode.add("fmiValueReference " + scalar.getName() + "_"
							+ machineName + "_ = " + scalar.getValueReference()
							+ ";");
				}
				// when we are done iterating through the scalars we can quit
				// the search
				break;
			}
		}

		if (r != null)
			outCode.add("fmiReal i[realArraySize];");
		if (b != null)
			outCode.add("fmiBoolean b[booleanArraySize];");
		if (i != null)
			outCode.add("fmiInteger i[integerArraySize];");
		if (s != null)
			outCode.add("fmiString s[stringArraySize];");

		outCode.add("");

		// Add the subroutines
		outCode.add("");
		outCode.add("// Subroutines");
		for (ArrayList<String> sub : subList) {
			// The first line will contain the information to be placed in the
			// header file for this environ machine object
			String firstLine = sub.get(0);
			headerInfo.functionDeclarations.add(firstLine + ";");

			outCode.addAll(sub);
			outCode.add("");
		}

		translationManager.addClassHeaderInformation(headerInfo);

		return outCode;
	}

	private void tryTemplate(Protected actualSource) throws CoreException,
			IOException, TemplateException, IL1TranslationException {
		// where do we want to write to?
		String targetFileName = actualSource.getName() + "_instantiated.c";
		FMUTranslatorHelper translatorHelper = FMUTranslatorHelper.getDefault();
		// Create the Template Processor
		TemplateProcessor templateProcessor = TemplateProcessor.getDefault();
		// Get the target folder from this utility method
		IFolder targetFolder = templateProcessor
				.getTargetFolder(FMUTranslator.targetProject,
						FMUTranslator.GENERATED_SRC_FOLDER);
		// Create a buffered writer
		BufferedWriter bufferedWriter = translatorHelper.createBufferedWriter(
				targetFolder, targetFileName);
		// Initialise the template processor with the TARGET INFORMATION
		templateProcessor.initialise(FMUTranslator.sourceRodinProject,
				FMUTranslator.TEMPLATES_SRC_FOLDER, bufferedWriter);
		// Get the processor to instantiate the 'Top-Level' template.
		// Templates contained 'within' are handled by the processor
		// and TemplateHelper.
		templateProcessor.instantiateTemplate("fmuTemplate.c");
		bufferedWriter.close();
	}
}
