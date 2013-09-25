package ac.soton.fmusim.codegen.translator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.tasking.AbstractTaskingTranslator;
import org.eventb.codegen.tasking.CodeGenTasking;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.eventb.emf.core.AbstractExtension;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;

import compositeControl.CompositeControl;

import tasking.FMU_Machine;

public class FMUMachineTaskingTranslator extends AbstractTaskingTranslator {

	@Override
	public IL1Element translate(EventBElement source, IL1Element target,
			TaskingTranslationManager translationManager)
			throws TaskingTranslationUnhandledTypeException {

		MachineImpl containingMachine = (MachineImpl) source.eContainer();
		// This is where we create protected object from the FMU
		Protected protectedObj = Il1Factory.eINSTANCE.createProtected();
		;
		// Translate the FMU as a shared machine
		// Get the events
		EList<Event> events = containingMachine.getEvents();
		// Get the previous translations
		Map<String, IL1Element> storedElements = translationManager
				.getStoredElements();

		// This is where we stash the previously translated subroutines
		// they will have been created during processing of the event wrappers
		List<Subroutine> subRoutineList = new ArrayList<Subroutine>();

		Iterator<String> keysIterator = storedElements.keySet().iterator();
		while (keysIterator.hasNext()) {
			String nxt = keysIterator.next();
			// for each of the events look for the corresponding translation.
			// and add it to the list.
			for (Event evt : events) {
				// find the event/subroutine & machine names in the key of
				// stored element.
				if (nxt.contains(evt.getName())
						&& nxt.contains(containingMachine.getName())) {
					IL1Element value = storedElements.get(nxt);
					// make sure we have a subroutine
					if (value instanceof Subroutine) {
						Subroutine subRoutine = (Subroutine) value;
						// Now check that the value is a subroutine with the
						// correct name and machine name.
						if (subRoutine.getMachineName().equalsIgnoreCase(
								containingMachine.getName())
								&& subRoutine.getName().equals(evt.getName())) {
							// if a corresponding translation then add it to the
							// list
							// of subroutines to be added to the protected
							subRoutineList.add(subRoutine);
						}
					}
				}
			}
		}

		// now add data to the protected object
		if (subRoutineList.size() > 0) {
			protectedObj.setMachineName(containingMachine.getName());
			protectedObj.setName(containingMachine.getName());
			protectedObj.setProjectName(TaskingTranslationManager.getProject()
					.getName());
			protectedObj.getSubroutines().addAll(subRoutineList);
		}
		// An FMU with no subroutines is useless
		else {
			throw new TaskingTranslationUnhandledTypeException(source);
		}

		// Get, what is at the moment, the task body. Hopefully we can rename it
		// to
		// FMI DO STEP BODY or some such name, for FMUs.
		EList<AbstractExtension> extensionList = containingMachine
				.getExtensions();
		for (AbstractExtension ext : extensionList) {
			if (ext instanceof FMU_Machine) {
				FMU_Machine fmuMch = (FMU_Machine) ext;
				CompositeControl taskBody = fmuMch.getTaskBody();
				Command b = null;
				try {
					b = (Command) translationManager.translate(taskBody);
				} catch (TaskingTranslationException e) {
					Status status = new Status(IStatus.ERROR,
							CodeGenTasking.PLUGIN_ID,
							"Failed Translation: TaskingTranslationException:"
									+ e.getMessage(), e);
					StatusManager.getManager().handle(status,
							StatusManager.SHOW);
				}
				Subroutine fmiDoStep = Il1Factory.eINSTANCE.createSubroutine();
				// Add machine names etc......
				fmiDoStep.setBody(b);
				fmiDoStep.setName("fmiDoStep");
				fmiDoStep.setMachineName(containingMachine.getName());
				fmiDoStep.setProjectName(TaskingTranslationManager.getProject().getName());
				fmiDoStep.setTemporary(false);

				protectedObj.getSubroutines().add(fmiDoStep);
			}
		}
		return protectedObj;
	}
}
