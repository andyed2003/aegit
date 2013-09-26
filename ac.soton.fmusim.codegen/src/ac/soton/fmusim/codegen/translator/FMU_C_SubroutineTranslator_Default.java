package ac.soton.fmusim.codegen.translator;

import java.util.ArrayList;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.VariableDecl;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.c.CTranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractIL1TranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractSubroutineIL1Translator;
import org.eventb.codegen.tasking.CodeGenTasking;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.codegen.tasking.TaskingTranslationManager;
import org.eventb.codegen.tasking.utils.CodeGenTaskingUtils;
import org.eventb.core.IEvent;
import org.eventb.core.IEventBRoot;
import org.eventb.core.IMachineRoot;
import org.eventb.core.IParameter;
import org.eventb.core.ast.ITypeEnvironment;
import org.eventb.core.ast.Type;
import org.rodinp.core.IAttributeType;
import org.rodinp.core.IRodinElement;
import org.rodinp.core.RodinCore;
import org.rodinp.core.RodinDBException;

public class FMU_C_SubroutineTranslator_Default extends
		AbstractSubroutineIL1Translator {

	@Override
	protected ArrayList<String> generateFunction(String name,
			ArrayList<String> parameterDefinitions,
			ArrayList<ArrayList<String>> localVariables, String guardList,
			ArrayList<String> body, boolean isProtected, boolean isEnviron,
			String machineName, Subroutine actualSource,
			IL1TranslationManager translationManager) {

		ArrayList<String> outCode = new ArrayList<String>();

		// For an FMU we know that subroutines are either:
		// 1 - communicating with the master - i.e. an fmiGetXXX, or fmiSetXXX; or
		// 2 - the fmiDoStep subroutine.
		// This should help us to determine the parameters that we need for the subroutine.
		
		// Signature for Getters 1:
		// fmiStatus fmiGetXXX(fmiComponent c, const fmiValueReference vr[], 
		//		size_t nvr, fmiInteger value[]);
		
		// Signature for Setters 1:
		// fmiStatus fmiSetXXX(fmiComponent c, const fmiValueReference vr[], 
		//		size_t nvr,	const fmiInteger value[]);				
		
		// Signature for 2:
		// fmiStatus fmiDoStep(fmiComponent c, fmiReal currentCommunicationPoint,
		//		fmiReal	communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint)
		
		// So - what are we getting? Ints, reals, bools? Let's assume we can tell from the parameters,
		// which are typed, and all the same type - because we enforce that restriction.
		EList<Parameter> formalParams = actualSource.getFormalParameters();
		String fmiTypeName = null;
		String communicationDirection = null;

		// if this has parameter(s) then it must be a getXXX or SetXXX for the master
		if(formalParams.size()>0){
			// Get any of the subroutine parameters, they should all be either incoming, or outgoing
			Parameter subroutineParam = formalParams.get(0);
			// we also need the original event parameter to see if it incoming or outgoing
			IMachineRoot root = (IMachineRoot) translationManager.getSourceRoot(actualSource.getProjectName(), machineName);

			// DOES NOT WORK !!!!
			
			IEvent event = root.getEvent(actualSource.getName());
			IParameter eventParam = event.getParameter(subroutineParam.getIdentifier());
			
			boolean hasDirectionAttribute = false;
			// check to see if it has a direction attribute

			try {
				hasDirectionAttribute = eventParam.hasAttribute(CodeGenTasking.PARAM_DIR_ATTRIBUTE);
				if(!hasDirectionAttribute) throw new TaskingTranslationException("No direction attribute on event: " + event.getElementName());
			} catch (RodinDBException e) {
				Status status = new Status(IStatus.ERROR,
						CodeGenTasking.PLUGIN_ID,
						"Failed Translation: RodinDBException:"
						+ e.getMessage(), e);
					StatusManager.getManager().handle(status,
						StatusManager.SHOW);
			} catch (TaskingTranslationException e) {
				Status status = new Status(IStatus.ERROR,
						CodeGenTasking.PLUGIN_ID,
						"Failed Translation: TaskingTranslationException:"
						+ e.getMessage(), e);
					StatusManager.getManager().handle(status,
						StatusManager.SHOW);
			}

			String exampleParamName = subroutineParam.getIdentifier();
			// get the FMI type from the type environment
			ITypeEnvironment typeEnv = translationManager.getTypeEnvironment(root);
			Type type = typeEnv.getType(exampleParamName);
			// We hard Code the translation of the Type String here
			String typeAsString = type.toString();
			if(typeAsString.equalsIgnoreCase(CodeGenTaskingUtils.INT_SYMBOL)){
				fmiTypeName = "Integer";
			}else if(typeAsString.equalsIgnoreCase(CodeGenTaskingUtils.BOOL_SYMBOL)){
				fmiTypeName = "Boolean";
			}
			else if(typeAsString.equalsIgnoreCase("String")){
				fmiTypeName = "String";
			}
			else if(typeAsString.equalsIgnoreCase("Real")){
				fmiTypeName = "Real";
			}
			
		}
		// else it must be an fmiDOStep subroutine and will be marked as temporary, and removed
		else{
			
		}

		
		
		
		// Format the parameters
		String fmiAPIparameters = "fmiComponent c, const fmiValueReference vr[], "
				+ "size_t nvr, fmiInteger value[]";

		
		// Uniquely identify each event name using the machine name
		outCode.add("fmiStatus " + machineName + "_" + communicationDirection + fmiTypeName + "(" + fmiAPIparameters + ")");
		outCode.add("{"); // open function

		if (isProtected || isEnviron) {
			// Output OpenMP blocking
			translationManager.addIncludeStatement("typedef int BOOL;");
			translationManager.addIncludeStatement("#define TRUE 1");
			translationManager.addIncludeStatement("#define FALSE 0");
		}

		// Guards
		if (!guardList.equals("")) {
			outCode.add("// Check to see if guard is met");
			outCode.add("if (" + guardList + ")");
			outCode.add("{"); // open guarded
		}

		// Local variables
		for (ArrayList<String> lVars : localVariables) {
			outCode.addAll(lVars);
		}

		// Body code
		outCode.add("// Translated code");
		outCode.addAll(body);

		if (!guardList.equals("")) {
			if (isProtected || isEnviron) {
				outCode.add("");
			}
			outCode.add("}"); // close guarded
		} 

		outCode.add("}"); // close function

		return outCode;

	}

	@Override
	protected String generateParameterDefinition(String type,
			String identifier, ParameterType parameterType) {
		String paramDefn = "";

		// Out parameters (to the calling subroutine) will be using the Pointer
		// class.
		switch (parameterType) {
		case OUT:
			paramDefn = type + " *" + identifier;
			break;
		case IN:
		default:
			paramDefn = type + " " + identifier;
			break;
		}

		return paramDefn;
	}

	@Override
	protected AbstractIL1TranslatorUtils getTranslatorUtils() {
		return new CTranslatorUtils();
	}

}
