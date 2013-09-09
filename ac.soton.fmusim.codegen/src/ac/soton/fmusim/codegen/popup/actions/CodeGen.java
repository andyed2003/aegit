package ac.soton.fmusim.codegen.popup.actions;

import java.io.IOException;
import java.net.URISyntaxException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.impl.Il1PackageImpl;
import org.eventb.codegen.tasking.RMLDataStruct;
import org.eventb.codegen.tasking.RelevantMachineLoader;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.osgi.service.prefs.BackingStoreException;
import org.rodinp.core.RodinDBException;

import ac.soton.fmusim.codegen.Activator;
import ac.soton.fmusim.codegen.translator.FMUTranslator;

public class CodeGen implements IObjectActionDelegate {

	private IStructuredSelection selection;

	/**
	 * Constructor for Action1.
	 */
	public CodeGen() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			// This method invokes the translation from Event-B to the FMU
			translateTaskingEventBToFMU(selection);
			// catch all the things that may go wrong
		} catch (RodinDBException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed Translation: RodinDBException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (TaskingTranslationUnhandledTypeException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed Translation: TaskingTranslationUnhandledTypeException:"
							+ e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (TaskingTranslationException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed Translation: TaskingTranslationException:"
							+ e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (BackingStoreException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed Translation: BackingStoreException:"
							+ e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed Translation: CoreException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed Translation: IOException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		} catch (URISyntaxException e) {
			Status status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
					"Failed Translation: URISyntaxException:" + e.getMessage(), e);
			StatusManager.getManager().handle(status, StatusManager.SHOW);
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	// This method invokes the translator to IL1 and then from IL1 to code.
	public static void translateTaskingEventBToFMU(IStructuredSelection s)
			throws TaskingTranslationException, BackingStoreException,
			CoreException, IOException, URISyntaxException {

		Program program = FMUTranslator.translateEventBToIL1(s);
		
		
		System.out.println();
	}
}
