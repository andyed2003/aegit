package ac.soton.fmusim.codegen.translator.il1tofmuc;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.il1.translator.core.AbstractProtectedIL1Translator;
import org.eventb.codegen.templates.util.TemplateException;
import org.eventb.codegen.templates.util.TemplateProcessor;

import ac.soton.fmusim.codegen.FMUTranslator;
import ac.soton.fmusim.codegen.FMUTranslatorHelper;
import ac.soton.fmusim.codegen.FMUTranslatorPlugin;

public class FMUCProtectedTranslator extends AbstractProtectedIL1Translator {

	private Protected actualSource = null;
	private ArrayList<ArrayList<String>> subList = null;
	private IL1TranslationManager translationManager = null;

	@Override
	public ArrayList<String> generateProtectedCode(
			ArrayList<ArrayList<String>> declList,
			ArrayList<ArrayList<String>> subList_, String name,
			Protected actualSource_, IL1TranslationManager translationManager_,
			TargetLanguage targetLanguage) {
		// Set a private static field to be used by the 'current' translation
		actualSource = actualSource_;
		subList = subList_;
		translationManager = translationManager_;

		try {
			useTemplates();
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: CoreException :"
							+ TemplateException.extractFullExceptionMessage(e),
					e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IOException :"
							+ TemplateException.extractFullExceptionMessage(e),
					e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (TemplateException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: TemplateException :", e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IL1TranslationException e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IL1TranslationException :"
							+ TemplateException.extractFullExceptionMessage(e),
					e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (Exception e) {
			Status status = new Status(IStatus.ERROR,
					FMUTranslatorPlugin.PLUGIN_ID,
					"Failed Translation: IL1TranslationException :"
							+ TemplateException.extractFullExceptionMessage(e),
					e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		}
		ArrayList<String> outCode = new ArrayList<String>();
		// If any subroutines have been generated during the template instantiation 
		// we can add the subroutine signatures to the header here.
		outCode.add("");
		if (subList.size() > 0) {
			ClassHeaderInformation headerInfo = new ClassHeaderInformation();
			headerInfo.setClassName(actualSource.getName());
			for (ArrayList<String> sub : subList) {
				// The first line will contain the information to be placed in
				// the header file for this environ machine object
				for (String s : sub) {
					headerInfo.getHeaderEntries().add(s + ";");
					outCode.add("");
				}
			}
			translationManager.addClassHeaderInformation(headerInfo);
		}
		return outCode;
	}

	private void useTemplates() throws Exception {
		// where do we want to write to?
		String targetFileName = actualSource.getName() + ".c";
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
		// Initialise the template processor with the source
		// directory, and TARGET information.
		templateProcessor.initialise(FMUTranslator.sourceRodinProject,
				FMUTranslator.TEMPLATES_SRC_FOLDER, bufferedWriter);
		// Get the processor to instantiate the 'Top-Level' template.
		// Templates contained 'within' are handled by the processor
		// and TemplateHelper. We can pass a data object to assist with the
		// translation, so we pass the actual source object, we could make this
		// more complex if necessary (and add constraints)

		GeneratorData generatorData = new GeneratorData();
		List<Object> generatorDataList = generatorData.getDataList();
		generatorDataList.add(actualSource);
		generatorDataList.add(translationManager);
		templateProcessor.instantiateTemplate("fmuTemplate.c", generatorData);
		bufferedWriter.close();
	}
}
