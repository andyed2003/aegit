package org.eventb.codegen.template.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.Declaration;
import org.eventb.codegen.il1.PartiallyTranslatedDecl;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.IL1TranslationUnhandledTypeException;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

import ac.soton.fmusim.codegen.FMUTranslator;

public class InitialisationsListGenerator implements IGenerator {

	public List<String> generate(IGeneratorData data)
			throws IL1TranslationException, IL1TranslationUnhandledTypeException {
		List<String> outCode = new ArrayList<String>();
		Protected prot = null;
		IL1TranslationManager translationManager = null;
		// Sort out the data that we are receiving from the caller.
		// Get the protected object and the translation manager.
		List<Object> dataList = data.getDataList();
		for (Object obj : dataList) {
			if (obj instanceof Protected) {
				prot = (Protected) obj;
			}
			else if(obj instanceof IL1TranslationManager){
				translationManager = (IL1TranslationManager) obj;
			}
		}
		
		outCode.add("// Generated By InitialisationsListGenerator ");
		
		if (prot != null && translationManager != null) {
			EList<Declaration> declList = prot.getDecls();
			// for each variable we require an initialisation of the form:
			// protectedName + "_" + variableArrayRefName [ vRef ] =
			// initialValue
			for (Declaration decl : declList) {
				String protectedName = prot.getName();
				String varName = decl.getIdentifier();
				String initialValue = decl.getInitialValue();
				// If we have a boolean declaration in the IL1 
				// This is where we translate get the resulting translation (i.e. fmiTrue or fmiFalse)
				PartiallyTranslatedDecl td = (PartiallyTranslatedDecl) translationManager.translateDeclaration(decl, FMUTranslator.targetLanguage);
				String type = td.getType();
				if(type.equals("BOOL")){
					initialValue = td.getPartialInitialisationExpression();
				}
				// update the variable names in the action to the arrayReference style.
				String tmpAction = varName + "_" + protectedName + " = " + initialValue + ";";
				String initialisation = "\t\t" + FMUTranslator.updateFieldVariableName(tmpAction, decl,
						translationManager);
				outCode.add(initialisation);
			}
		}
		return outCode;
	}
}
