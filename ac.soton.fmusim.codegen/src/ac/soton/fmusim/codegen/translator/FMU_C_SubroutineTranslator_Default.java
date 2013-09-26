package ac.soton.fmusim.codegen.translator;

import java.util.ArrayList;

import org.eventb.codegen.il1.Subroutine;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.c.CTranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractIL1TranslatorUtils;
import org.eventb.codegen.il1.translator.core.AbstractSubroutineIL1Translator;

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

		// Format the parameters
		String parameters = "";
		boolean first = true;
		for (String p : parameterDefinitions) {
			if (!first)
				parameters = parameters + ", ";

			parameters = parameters + p;
			first = false;
		}

		// For an FMU we know that subroutines are either:
		// 1 - communicating with the master - i.e. an fmiGetXXX, or fmiSetXXX; or
		// 2 - the fmiDoStep subroutine.
		// This should help us to determine the parameters that we need for the subroutine.
		
		
		// Uniquely identify each event name using the machine name
		outCode.add("void_x " + machineName + "_" + name + "(" + parameters + ")");
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
