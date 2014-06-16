package org.eventb.codegen.scheduler.extensions;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eventb.codegen.tasking.RMLDataStruct;
import org.eventb.codegen.tasking.RelevantMachineLoader;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.rodinp.core.RodinDBException;

public class JScheduleTranslator {
	
	public void translate(IStructuredSelection s) throws TaskingTranslationUnhandledTypeException, RodinDBException{
		Object[] list = s.toArray();
		RMLDataStruct relevantMachines = RelevantMachineLoader
				.getAllRelevantMachines(list);
		System.out.println();
	}

}
