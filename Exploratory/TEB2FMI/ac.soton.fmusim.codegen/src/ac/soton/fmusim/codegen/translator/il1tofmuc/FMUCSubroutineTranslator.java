package ac.soton.fmusim.codegen.translator.il1tofmuc;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.InParameter;
import org.eventb.codegen.il1.OutParameter;
import org.eventb.codegen.il1.Parameter;
import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.c.CTranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractIL1TranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractSubroutineIL1Translator;
import org.eventb.codegen.tasking.TaskingTranslationException;
import org.eventb.core.ast.ITypeEnvironment;
import org.eventb.core.ast.Type;
import org.eventb.core.basis.MachineRoot;

import ac.soton.fmusim.codegen.FMUTranslator;

public class FMUCSubroutineTranslator extends AbstractSubroutineIL1Translator {

	@Override
	protected ArrayList<String> generateFunction(String name,
			ArrayList<String> parameterDefinitions,
			ArrayList<ArrayList<String>> localVariables, String guardList,
			ArrayList<String> body, boolean isProtected, boolean isEnviron,
			String machineName, Subroutine actualSource,
			IL1TranslationManager translationManager)
			throws TaskingTranslationException {

		ArrayList<String> outCode = new ArrayList<String>();

		// For an FMU we know that subroutines are either:
		// 1 - communicating with the master - i.e. an fmiGetXXX, or fmiSetXXX;
		// or
		// 2 - the fmiDoStep subroutine.
		// This should help us to determine the parameters that we need for the
		// subroutine.

		// Signature for Getters 1:
		// fmiStatus fmiGetXXX(fmiComponent c, const fmiValueReference vr[],
		// size_t nvr, fmiInteger value[]);

		// Signature for Setters 1:
		// fmiStatus fmiSetXXX(fmiComponent c, const fmiValueReference vr[],
		// size_t nvr, const fmiInteger value[]);

		// Signature for 2:
		// fmiStatus fmiDoStep(fmiComponent c, fmiReal
		// currentCommunicationPoint,
		// fmiReal communicationStepSize, fmiBoolean
		// noSetFMUStatePriorToCurrentPoint)

		// So - what are we getting? Ints, reals, bools? Let's assume we can
		// tell from the parameters,
		// which are typed, and all the same type - because we enforce that
		// restriction.
		EList<Parameter> formalParams = actualSource.getFormalParameters();
		String fmiTypeName = null;
		String communicationDirection = null;

		// >>>>> // if this has parameter(s) then it must be a getXXX or SetXXX
		// for the master
		if (formalParams.size() > 0) {
			// Get any of the subroutine parameters, they should all be either
			// incoming, or outgoing
			Parameter subroutineParam = formalParams.get(0);
			// we also need the original event parameter to see if it incoming
			// or outgoing
			// FMU Out = master GET
			if (subroutineParam instanceof OutParameter) {
				communicationDirection = "Get";
			}
			// FMU In = master Set
			else if (subroutineParam instanceof InParameter) {
				communicationDirection = "Set";
			}
			
			MachineRoot root = (MachineRoot) translationManager.getSourceRoot(
					actualSource.getProjectName(), machineName);
			String exampleParamName = subroutineParam.getIdentifier();
			// get the FMI type from the type environment
			ITypeEnvironment typeEnv = translationManager
					.getTypeEnvironment(root);
			Type type = typeEnv.getType(exampleParamName);
			// We hard Code the translation of the parameter Type String here
			
			fmiTypeName = FMUTranslator.getFMITypeString(type);

			// Format the parameters
			String fmiAPIparameters = "fmiComponent c, const fmiValueReference vr[], "
					+ "size_t nvr, fmiInteger value[]";

			// Uniquely identify each event name using the machine name
			outCode.add("fmiStatus " + machineName + "_"
					+ communicationDirection + fmiTypeName + "("
					+ fmiAPIparameters + ")");
			outCode.add("{"); // open function

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
			List<String> newBody = substituteVariableRefs(body, actualSource,
					translationManager);
			outCode.add("// Translated code");
			outCode.addAll(newBody);

			if (!guardList.equals("")) {
				if (isProtected || isEnviron) {
					outCode.add("");
				}
				outCode.add("}"); // close guarded
			}
			outCode.add("return fmiOK;"); // return OK upon successful completion
			outCode.add("}"); // close function
		}
		// >>>>> // else it must be an fmiDOStep subroutine
		else {
			// Format the parameters
			String fmiAPIparameters = "fmiComponent c, fmiReal currentCommunicationPoint,"
					+ " fmiReal communicationStepSize, fmiBoolean noSetFMUStatePriorToCurrentPoint";

			// Uniquely identify each event name using the machine name
			outCode.add("fmiStatus " + machineName + "_" + "fmiDoStep("
					+ fmiAPIparameters + ")");
			outCode.add("{"); // open function

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

			List<String> newBody = substituteVariableRefs(body, actualSource,
					translationManager);
			// Body code
			outCode.add("// Translated code");
			outCode.addAll(newBody);

			if (!guardList.equals("")) {
				if (isProtected || isEnviron) {
					outCode.add("");
				}
				outCode.add("}"); // close guarded
			}
			outCode.add("return fmiOK;"); // return OK upon successful completion
			outCode.add("}"); // close function
		}
		return outCode;
	}

	private List<String> substituteVariableRefs(ArrayList<String> body,
			Subroutine actualSource, IL1TranslationManager translationManager)
			throws TaskingTranslationException {
		// The body code needs to be converted to use the variable
		// references.
		// get the variable declarations
		EList<Declaration> decls = translationManager.getParentProtected(
				actualSource).getDecls();
		// iterate through each line in the subroutine body
		// to create a new body with substitutions if necessary
		List<String> newBody = new ArrayList<String>();
		for (String line : body) {
			// copy the line to work on
			String modifiedCode = line;
			// for each declaration
			for (Declaration d : decls) {
				// modify the statement where we find the declared variable
				modifiedCode = FMUTranslator.updateVariableName(modifiedCode, d, translationManager);
			}
			// if the line has been changed
			if (!line.equals(modifiedCode)) {
				newBody.add(modifiedCode);
			}
			// else add the original line
			else {
				newBody.add(line);
			}
		}
		return newBody;
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
