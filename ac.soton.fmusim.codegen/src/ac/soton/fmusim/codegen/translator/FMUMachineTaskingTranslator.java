package ac.soton.fmusim.codegen.translator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.tasking.AbstractTaskingTranslator;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.eventb.emf.core.EventBElement;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;

import tasking.FMU_Machine;

public class FMUMachineTaskingTranslator extends AbstractTaskingTranslator {

	@Override
	public IL1Element translate(EventBElement source, IL1Element target,
			TaskingTranslationManager translationManager)
			throws TaskingTranslationUnhandledTypeException {

		MachineImpl containingMachine = (MachineImpl) source.eContainer();
		// This is where we create protected object from the FMU
		Protected protectedObj = Il1Factory.eINSTANCE.createProtected();;
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
				// find the event/subroutine & machine names in the key of stored element.
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
							// if a corresponding translation then add it to the list
							// of subroutines to be added to the protected
							subRoutineList.add(subRoutine);
						}
					}
				}
			}
		}

		// now add data to the protected object
		if (subRoutineList.size()>0) {
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
		return protectedObj;
	}

}
