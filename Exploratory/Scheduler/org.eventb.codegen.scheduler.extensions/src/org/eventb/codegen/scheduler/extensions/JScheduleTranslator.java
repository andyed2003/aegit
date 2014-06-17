package org.eventb.codegen.scheduler.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eventb.codegen.il1.IL1Element;
import org.eventb.codegen.il1.Il1Factory;
import org.eventb.codegen.il1.Subroutine;
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
//		RMLDataStruct relevantMachines = RelevantMachineLoader
//				.getAllRelevantMachines(list);
		TargetLanguage targetLanguage = new TargetLanguage("Java");
		MachineRoot firstMachine = (MachineRoot) list[0];
		MachineImpl mch = RodinToEMFConverter.loadMachine(firstMachine);
		EList<Event> eventList = mch.getEvents();		
		
		Il1Factory factory = Il1Factory.eINSTANCE;
		TaskingTranslationManager taskingTranslationManager = new TaskingTranslationManager(factory);
		IL1TranslationManager il1TranslationManager = new IL1TranslationManager();
		
		List<Subroutine> subroutineList = new ArrayList<Subroutine>();
		for(Event evt: eventList){
			Subroutine subroutine = (Subroutine) taskingTranslationManager.translate(evt);
			subroutineList.add(subroutine);
		}
		
		
		ArrayList<String> outcode = new ArrayList<String>();
		for(Subroutine subroutine: subroutineList){
			ArrayList<String> code = il1TranslationManager.translateIL1ElementToCode(subroutine, targetLanguage);
			outcode.addAll(code);
		}
		System.out.println();
	}

}
