package org.eventb.codegen.templates.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;
import org.eventb.codegen.templates.TemplatesPlugin;

public class TemplateHelper {

	// The extension ID
	private static final String TEMPLATE_GEN_ID = "org.eventb.codegen.templates.generator";
	// Map of (keywords X generatorClasses)
	private static Map<String, IGenerator> generatorTagMap = null;
	private HashMap<String, File> templateFolderContentMap = null;
	// a data object that can be used in the executable generator
	private IGeneratorData data = null;

	// we only need to set up the generatorMap once, since we
	// make it a class variables.
	static {
		try {
			initialise();
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public TemplateHelper(IGeneratorData data_) throws CoreException {
		// set the data element
		data = data_;
	}

	private static void initialise() throws CoreException {
		// create a new store
		generatorTagMap = new HashMap<String, IGenerator>();
		// find the generator extension
		IExtension[] extensions = Platform.getExtensionRegistry()
				.getExtensionPoint(TEMPLATE_GEN_ID).getExtensions();
		for (final IExtension extension : extensions) {
			List<IConfigurationElement> ceList = Arrays.asList(extension
					.getConfigurationElements());
			// look through the configuration elements - there will be exactly
			// one valid configurator, for the template generator,
			// so we break after processing it.
			for (IConfigurationElement configurationElement : ceList) {
				// Process the configurator if it is valid
				if (configurationElement.isValid()) {
					String[] attributeNames = configurationElement.getAttributeNames();
					// We store (keyword X generatorClass) pairs.
					for (int idx = 0; idx < attributeNames.length; idx = idx + 2) {
						IGenerator exeExt = (IGenerator) configurationElement
								.createExecutableExtension(attributeNames[idx]);
						generatorTagMap.put(configurationElement
								.getAttribute(attributeNames[idx + 1]), exeExt);
						System.out.println("tag: "
								+ configurationElement
										.getAttribute(attributeNames[idx + 1]));
						System.out.println("generator: " + exeExt);
					}
		
				} else {
					// else the configurator was not valid
					try {
						throw new TemplateException("");
					} catch (TemplateException e) {
						Status status = new Status(IStatus.ERROR,
								TemplatesPlugin.PLUGIN_ID,
								"Failed Translation: TemplateException:", e);
						StatusManager.getManager().handle(status,
								StatusManager.SHOW);
					}
				}
			}
		}
	}

	public List<String> generate(String keyword) throws Exception {
		List<String> newLines = new ArrayList<String>();
		File childTemplateFile = templateFolderContentMap.get(keyword);
		// if we have a child template then translate it.
		if (childTemplateFile != null) {
			// We have found a template, in a template. Process it.
			// Create a bufferedReader, and use the default templateReader
			// to instantiate it ....
			FileReader reader = new FileReader(childTemplateFile);
			BufferedReader bufferedReader = new BufferedReader(reader);
			TemplateProcessor templateProcessor = TemplateProcessor
					.getDefault();
			newLines = templateProcessor.internalInstantiateTemplate(
					bufferedReader, templateFolderContentMap);

		} else {
			// else get the generator from the generator target map using the
			// keyword
			IGenerator generator = generatorTagMap.get(keyword);
			if (generator != null) {
				newLines = generator.generate(data);
			}
		}
		// return the new lines
		return newLines;
	}

	public void setChildTemplateMap(HashMap<String, File> childTemplateMap_) {
		templateFolderContentMap = childTemplateMap_;
	}

}
