/*
* generated by Xtext
*/
package ac.soton.xtext.iumlb;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DslUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return ac.soton.xtext.iumlb.ui.internal.DslActivator.getInstance().getInjector("ac.soton.xtext.iumlb.Dsl");
	}
	
}
