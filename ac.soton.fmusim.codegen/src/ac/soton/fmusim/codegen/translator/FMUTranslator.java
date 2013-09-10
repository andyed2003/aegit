package ac.soton.fmusim.codegen.translator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.impl.Il1PackageImpl;
import org.eventb.codegen.tasking.RMLDataStruct;
import org.eventb.codegen.tasking.RelevantMachineLoader;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.core.basis.ContextRoot;
import org.eventb.core.basis.MachineRoot;
import org.osgi.service.prefs.BackingStoreException;

import ac.soton.composition.core.basis.ComposedMachineRoot;
import ac.soton.compositionmodel.core.compositionmodel.ComposedMachine;

@SuppressWarnings("restriction")
public class FMUTranslator {
		
	public static void translateToFMU(IStructuredSelection s) throws TaskingTranslationException, BackingStoreException, CoreException, IOException, URISyntaxException{
		// Generate an IL1 program using existing stage 1 code generator.
		Program program = translateEventBToIL1(s);
		// we now have an IL1 program.
		// We assume we have modelled the FMU's as shared machines. This 
		// means that we can discard the master. The subroutines are then implemented
		// as the FMI interface, fmiGetXXX and fmiDoStep etc.
		
		// Here's an idea. How about a translation from Event-B to an FMI Model.
		// Synchronized getters between controller and environment will need to
		// mapped through a master.
		// Polling-controller/and corresponding environ "tasks" map to fmiGetXXX ; fmiSetXXX
		// where both controller and environ are converted to shared machines and have a master task.

		
		
	}
	
	
	// This method translates Event-B models into an IL1 program
	public static Program translateEventBToIL1(IStructuredSelection s) throws TaskingTranslationException, BackingStoreException, CoreException, IOException, URISyntaxException
	{
		Object[] list = s.toArray();
		// load all the machines into a pre-prepared structure.
		RMLDataStruct relevantMachines = RelevantMachineLoader
				.getAllRelevantMachines(list);

		list = relevantMachines.machines;
		ArrayList<ComposedMachine> composedMachines = relevantMachines.composedMachines;
		Map<String, String> composedEvents = relevantMachines.composedEvents;
		ArrayList<String> composedMachineNames = relevantMachines.composedMachineNames;
		Il1PackageImpl.init();
		Il1Factory factory = Il1Factory.eINSTANCE;
		
		// use the previously developed tasking translation manager to manage the translation.
		TaskingTranslationManager translationManager = new TaskingTranslationManager(
				factory);

		Program program = translationManager.translateToIL1Entry(list,
				composedMachines, composedEvents, composedMachineNames,
				relevantMachines);

		// Now we have a program we need to save it somewhere
		
		IFile target = null;
		// Get target's location from the list which is derived from the structured selection.
		for (Object obj : list) {
			if (obj instanceof MachineRoot) {
				target = ((MachineRoot) obj).getResource();
				break;
			} else if (obj instanceof ContextRoot) {
				target = ((ContextRoot) obj).getResource();
				break;
			} else if (obj instanceof ComposedMachineRoot) {
				target = ((ComposedMachineRoot) obj).getResource();
				break;
			}
		}

		// If the target is not null then save it, else throw exception.
		if (target != null) {
			saveBaseProgram(program, targetFile(target));
			storeProject(target.getProject(), translationManager);
		} else {
			throw new TaskingTranslationException("TranslateToIL1: Unknown target location");
		}

		return program;
	}
	
	// Create the file associated with the output
	// The sourceRes is the container of the MainClass
	// element that we want to transform
	protected static String targetFile(IFile source) throws URISyntaxException {
		
		java.net.URI location = source.getLocationURI();
		IPath p =  new Path(location.getPath());
		
		IPath newPath = p.removeFileExtension();
		String path = newPath + ".il1";
		
		return path;
	}
	
	protected static void saveBaseProgram(Program program, String filename)
			throws IOException {
		URI uri = URI.createFileURI(filename);
		Resource outResource = new XMLResourceFactoryImpl().createResource(uri);
		outResource.getContents().add(program);
		outResource.save(null);
	}
	
	private static void storeProject(IProject project, TaskingTranslationManager translationManager) {
		translationManager.setProject(project);
	}

}
