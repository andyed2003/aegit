/*
 * generated by Xtext
 */
package ac.soton.xtext.context.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import ac.soton.xtext.context.dsl.ui.internal.ContextDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ContextDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ContextDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ContextDslActivator.getInstance().getInjector(ContextDslActivator.AC_SOTON_XTEXT_CONTEXT_DSL_CONTEXTDSL);
	}
	
}
