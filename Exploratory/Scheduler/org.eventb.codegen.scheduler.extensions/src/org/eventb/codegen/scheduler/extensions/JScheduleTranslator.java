package org.eventb.codegen.scheduler.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eventb.codegen.il1.Command;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.If;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.MainEntry;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.Seq;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.Task;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.tasking.RMLDataStruct;
import org.eventb.codegen.tasking.RelevantMachineLoader;
import org.eventb.codegen.tasking.RodinToEMFConverter;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.eventb.core.IEvent;
import org.eventb.core.basis.EventBElement;
import org.eventb.core.basis.MachineRoot;
import org.eventb.emf.core.machine.Event;
import org.eventb.emf.core.machine.impl.MachineImpl;
import org.rodinp.core.RodinDBException;

public class JScheduleTranslator {
	
	public void translate(IStructuredSelection s) throws RodinDBException,
			TaskingTranslationException, IL1TranslationUnhandledTypeException {
		Object[] list = s.toArray();
// Set up the target language, and load in the machine
		TargetLanguage targetLanguage = new TargetLanguage("Java");
		MachineRoot firstMachine = (MachineRoot) list[0];
		MachineImpl mch = RodinToEMFConverter.loadMachine(firstMachine);
// Get the events
		EList<Event> eventList = mch.getEvents();		
// Set up the translation managers	
		Il1Factory factory = Il1Factory.eINSTANCE;
		TaskingTranslationManager taskingTranslationManager = new TaskingTranslationManager(factory);
		IL1TranslationManager il1TranslationManager = new IL1TranslationManager();
// Each event should map to branch - put the events in a 'DUMMY' Task and Body
		Task dummyTask = Il1Factory.eINSTANCE.createTask();
		Command dummyCode = dummyTask.getBody();
		boolean firstStatement = true;
// The task is used under the covers by the code generator - but not reproduced.
		dummyTask.setMachineName(firstMachine.getElementName());
		dummyTask.setProjectName(firstMachine.getEventBProject().getRodinProject().getElementName());
		List<If> branchList = new ArrayList<If>();
// iterate through the events		
		for(Event evt: eventList){
			Subroutine subroutine = (Subroutine) taskingTranslationManager.translate(evt);
			if(subroutine != null){
				// create a new branch and add guards and statements
				If newBranch = Il1Factory.eINSTANCE.createIf();
				EList<String> branchConditions = newBranch.getCondition();
				//?? WE HAVE TO MARK THE CONTAINER SOMEWHERE
				// SO IT IS PICKED UP LATER >>> OR SET MACHINE AND PROJECT NAME
				// OF EACH ELEMENT.
				branchConditions.addAll(subroutine.getGuards());
				newBranch.setBody(subroutine.getBody());
				newBranch.setParentEventName(evt.getName());
				Seq newSeq = Il1Factory.eINSTANCE.createSeq();
				Seq previousSeq = newSeq;
				if(firstStatement){
					// add the branch to the dummy task body
					firstStatement = false;
					newSeq.setLeftBranch(newBranch);
					dummyCode = newBranch;
				}
				else{
					// add branch to the rhs of the last seq
					newSeq.setLeftBranch(newBranch);
					previousSeq.setRightBranch(newSeq);
				}
				branchList.add(newBranch);
			}
		}
		
		
		ArrayList<String> outcode = new ArrayList<String>();
		for(If branch: branchList){
			ArrayList<String> code = il1TranslationManager.translateIL1ElementToCode(branch, targetLanguage);
			outcode.addAll(code);
		}
		System.out.println();
	}

}
