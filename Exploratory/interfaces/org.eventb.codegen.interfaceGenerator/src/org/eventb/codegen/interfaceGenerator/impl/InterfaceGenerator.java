package org.eventb.codegen.interfaceGenerator.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eventb.codegen.il1.EnvironTask;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.tasking.CodeGenTasking;
import org.eventb.codegen.tasking.TaskingTranslationManager;

public class InterfaceGenerator {
	
	private static InterfaceGenerator interfaceGenerator = new InterfaceGenerator();
	
	public static InterfaceGenerator getDefault(){
		return interfaceGenerator;
	}
	
	public void makeInterfaces(Program program){
		IPreferenceStore prefererenceStore = CodeGenTasking.getDefault()
				.getPreferenceStore();

		boolean requiresInterface = prefererenceStore
				.getBoolean(TaskingTranslationManager.getPrefJavaInterface());
		List<String> outCode = new ArrayList<String>();
	
		if (requiresInterface) {
			EList<Protected> protectedList = program.getProtected();
			for(Protected prot: protectedList){
				String name = prot.getName();
				EList<Subroutine> subroutineList = prot.getSubroutines();
				makeInterface(outCode, name, subroutineList);
			}
			EList<EnvironTask> environList = program.getEnvironMachines();
			for(EnvironTask environTask: environList){
				String name = environTask.getName();
				EList<Subroutine> subroutineList = environTask.getSubroutines();
				makeInterface(outCode, name, subroutineList);
			}
		}
	}

	private void makeInterface(List<String> outCode, String name,
			EList<Subroutine> subroutineList) {
		outCode.add("public interface " + name + "{"); 
		for(Subroutine subroutine: subroutineList){
			EList<Parameter> paramList = subroutine.getFormalParameters();
			boolean first = true;
			String s = "public void " + subroutine.getName()
					+"(" ;
			for(Parameter param: paramList){
				if(first){ s = s + param.getType() + " " + param.getIdentifier(); first = false;}
				else{s = s + ", " + param.getType() + " " + param.getIdentifier();}
				
			}
			s = s + ");";
			outCode.add(s);
		}
		
		outCode.add("}");
		
	}
}
