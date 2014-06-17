package org.eventb.codegen.scheduler.extensions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationUnhandledTypeException;
import org.eventb.core.basis.MachineRoot;
import org.rodinp.core.RodinDBException;

public class TranslateToEventB_JScheduler implements IObjectActionDelegate {

	private IStructuredSelection selection;

	@Override
	public void run(IAction arg0) {
		JScheduleTranslator jScheduler = new JScheduleTranslator();
		try {
			jScheduler.translate(selection);
		} catch (TaskingTranslationUnhandledTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RodinDBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TaskingTranslationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IL1TranslationUnhandledTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void selectionChanged(IAction arg0, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

	@Override
	public void setActivePart(IAction arg0, IWorkbenchPart arg1) {

	}
}
