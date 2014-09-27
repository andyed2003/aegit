package testaccessemf.popup.actions;

import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eventb.emf.core.machine.Machine;
import org.eventb.emf.persistence.EMFRodinDB;


public class Work extends AbstractEMFOperation {

	private URI machineURI;

	public Work(URI machineURI) {
		super(TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(EMFRodinDB.INSTANCE.getResourceSet()), "Add Statemachine");
		this.machineURI = machineURI;
	}

	@Override
	protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
		monitor.beginTask("Creating statemachine", IProgressMonitor.UNKNOWN);
		
		TransactionalEditingDomain editingDomain = getEditingDomain();
		
		try {
			Resource resource = editingDomain.getResourceSet().getResource(machineURI, true);
			
			if (resource != null && resource.isLoaded()) {
				Machine machine = (Machine) resource.getContents().get(0);
				// Do Something Here !!!
				
				
				// End Do something !!!
				resource.save(Collections.emptyMap());
			}
		} catch (Exception e) {
			return new Status(Status.ERROR,"Failed to work", e.getLocalizedMessage());
		} finally {
			monitor.done();
		}
		return Status.OK_STATUS;
	}

}