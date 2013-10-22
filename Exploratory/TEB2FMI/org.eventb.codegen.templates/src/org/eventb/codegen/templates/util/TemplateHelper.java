package org.eventb.codegen.templates.util;

import java.net.MalformedURLException;
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
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.TemplatesPlugin;

public class TemplateHelper {

	// The extension ID
	private static final String TEMPLATE_GEN_ID = "org.eventb.codegen.templates.generator";
	// The singleton of this Helper
	private static TemplateHelper templateHelper;
	// Map of (keywords X generatorClasses)
	private Map<String, IGenerator> generatorTagMap = null;

	public static TemplateHelper getDefault() throws CoreException {
		// if the singleton is not created..
		if (templateHelper == null) {
			// then create and initialise it.
			templateHelper = new TemplateHelper();
			templateHelper.initialise();
			return templateHelper;
		} else
			return templateHelper;
	}

	private void initialise() throws CoreException {
		// create a new store
		generatorTagMap = new HashMap<String, IGenerator>();
		// find the generator extension
		for (final IExtension extension : Platform.getExtensionRegistry()
				.getExtensionPoint(TEMPLATE_GEN_ID).getExtensions()) {
			List<IConfigurationElement> ceList = Arrays.asList(extension
					.getConfigurationElements());
			IConfigurationElement generatorInfo = null;
			String[] attributeNames = null;
			// look through the configuration elements - there will be exactly
			// one valid configurator so we can break once we have found it.
			for (IConfigurationElement configurationElement : ceList) {
				if (configurationElement.isValid()) {
					generatorInfo = configurationElement;
					attributeNames = configurationElement.getAttributeNames();
					break;
				} else
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
			// now we have the configurator we can store the
			// (keyword X generatorClass) pair.
			for (int idx = 0; idx < attributeNames.length; idx = idx + 2) {
				IGenerator exeExt = (IGenerator) generatorInfo
						.createExecutableExtension(attributeNames[idx]);
				generatorTagMap.put(
						generatorInfo.getAttribute(attributeNames[idx + 1]),
						exeExt);
			}
		}
	}

	public List<String> generate(String keyword) throws CoreException,
			MalformedURLException {
		List<String> newLines = new ArrayList<String>();
		IGenerator generator = generatorTagMap.get(keyword);
		if (generator != null) {
			newLines = generator.generate();
		}
		return newLines;
	}

}
