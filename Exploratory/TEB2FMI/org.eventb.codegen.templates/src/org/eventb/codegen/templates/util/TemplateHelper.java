package org.eventb.codegen.templates.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.templates.TemplatesPlugin;

public class TemplateHelper {

	// The extension ID
	private static final String TEMPLATE_GEN_ID = "org.eventb.codegen.templates.generator";
	// The singleton of this Helper
	private static TemplateHelper templateHelper;
	// Map of (keywords X generator classes)
	private Map<String, String> generatorTagMap = null;

	public static TemplateHelper getDefault() {
		// if the singleton is not created..
		if (templateHelper == null) {
			// then create and initialise it.
			templateHelper = new TemplateHelper();
			templateHelper.initialise();
			return templateHelper;
		} else
			return templateHelper;
	}

	private void initialise() {
		
		generatorTagMap = new HashMap<String, String>();
		for (final IExtension extension : Platform.getExtensionRegistry()
				.getExtensionPoint(TEMPLATE_GEN_ID).getExtensions()) {
			List<IConfigurationElement> ceList = Arrays.asList(extension
					.getConfigurationElements());
			IConfigurationElement generatorInfo = null;
			String[] attributeNames = null;
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
			
			for (int idx = 0; idx < attributeNames.length; idx = idx + 2) {
				generatorTagMap.put(
						generatorInfo.getAttribute(attributeNames[idx + 1]),
						generatorInfo.getAttribute(attributeNames[idx]));
			}
		}
	}
}
