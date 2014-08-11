/*
 * generated by Xtext
 */
package ac.soton.xtext.machine.dsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import ac.soton.xtext.machine.dsl.ui.internal.MachineDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MachineDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MachineDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MachineDslActivator.getInstance().getInjector(MachineDslActivator.AC_SOTON_XTEXT_MACHINE_DSL_MACHINEDSL);
	}
	
}
