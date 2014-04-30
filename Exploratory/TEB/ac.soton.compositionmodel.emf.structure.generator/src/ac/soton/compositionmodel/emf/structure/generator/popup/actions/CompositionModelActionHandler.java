package ac.soton.compositionmodel.emf.structure.generator.popup.actions;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

import ac.soton.composition.core.basis.ComposedMachineRoot;
import ac.soton.compositionmodel.emf.structure.generator.CompositionModelGenerator;

import compositionStructure.CompositionStructure;
import compositionStructure.LeafComposedEvent;
import compositionStructure.LeafEvent;

@SuppressWarnings("restriction")
public class CompositionModelActionHandler implements IObjectActionDelegate {

	private Shell shell;
	private ComposedMachineRoot composedMachine;
	private String path;
	private IWorkspaceRoot root;
	
	
	/**
	 * Constructor for Action1.
	 */
	public CompositionModelActionHandler() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		try {
			shell = targetPart.getSite().getShell();
			IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
			IStructuredSelection selection = (IStructuredSelection) window.getSelectionService().getSelection();
			composedMachine = (ComposedMachineRoot)selection.getFirstElement();
				

			path = composedMachine.getEventBProject().getRodinProject().getProject().getLocation().toString() + "/" + composedMachine.getElementName();
		}catch(Exception e){
			e.printStackTrace();
		}
	
	}
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {

		try {
			
//			System.out.println("Number of Events --> " + composedMachine.getComposesEventClauses().length);
			CompositionModelGenerator gen = new CompositionModelGenerator(composedMachine);
			CompositionStructure compositionStructure = gen.generateCompositionStructure();
			
//			for (LeafComposedEvent leafCmpEv : compositionStructure.getLeafComposedEvents()){
//				for(LeafEvent leafEv :  leafCmpEv.getComposedLeafEvents()){
//					System.out.println(leafEv.getEventName());
//					break;
//				}
//			}	
			
			
			URI uri = URI.createFileURI(path +".compositionmodel");
			Resource outResource = new XMLResourceFactoryImpl().createResource(uri);
			outResource.getContents().add( compositionStructure);
			//TODO fix saving the model
			//			outResource.save(null); 
			MessageDialog.openInformation(
					shell,
					"Generator",
					"Generated!");		
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}

}
