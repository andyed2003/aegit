package testaccessemf.popup.actions;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.xtext.internal.ResourceServiceProviderDescriptor;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.IResourceServiceProvider.Registry;
import org.eventb.emf.core.CorePackage;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.Invariant;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.core.machine.MachinePackage;
import org.eventb.emf.core.machine.impl.MachineImpl;


public class NewAction implements IObjectActionDelegate {
	@SuppressWarnings("unused")
	private Shell shell;
	private IStructuredSelection selection;

	/**
	 * Constructor for Action1.
	 */
	public NewAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		
		IFile file = (IFile) selection.getFirstElement();
		String path = file.getFullPath().toOSString();
		
		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createPlatformResourceURI(path, true);
		Resource r = rs.getResource(uri, true);
		
		List<EObject> contentOfYourFile = r.getContents();
		for(EObject eo: contentOfYourFile){
			Class<? extends EObject> clazz = eo.getClass();
			if(clazz.equals(MachineImpl.class) ){
				Machine m = (Machine) eo;
				EList<Invariant> invariants = m.getInvariants();
				EList<Event> events = m.getEvents();
				 EList<EObject> iter = m.eContents();
				
				
				System.out.println("We found the EMF model of Machine: "+ m.getName());
			}
		}
		
		
		
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
