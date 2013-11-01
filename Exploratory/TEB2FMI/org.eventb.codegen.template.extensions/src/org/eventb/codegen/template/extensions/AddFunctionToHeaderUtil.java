package org.eventb.codegen.template.extensions;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.templates.IGenerator;
import org.eventb.codegen.templates.IGeneratorData;

public class AddFunctionToHeaderUtil implements IGenerator {

	private ClassHeaderInformation headerInfo = null;
	private BufferedReader bufferedReader = null;

	// This generator adds a header for the line of source code.
	@Override
	public List<String> generate(IGeneratorData data) throws Exception {
		Protected protectedSource = null;
		IL1TranslationManager translationManager = null;
		// Sort out the data that we are receiving from the caller.
		// Get the protected object and the translation manager.
		// we also need to get the helper from the list.
		// We should have only one so throw an exception if there
		// are more.
		List<Object> dataList = data.getDataList();
		List<BufferedReader> brList = new ArrayList<BufferedReader>();
		for (Object obj : dataList) {
			if (obj instanceof Protected) {
				protectedSource = (Protected) obj;
			} else if (obj instanceof IL1TranslationManager) {
				translationManager = (IL1TranslationManager) obj;
			} else if (obj instanceof BufferedReader) {
				brList.add((BufferedReader) obj);
			}
		}

		
		if (brList.size() == 0) {
			throw new IL1TranslationException(
					"No bufferedReader found in generator: " + this);

		}
		// We need to get the last reader that was added, readers may be nested.
				bufferedReader = brList.get(brList.size()-1);
				
				
		// These subroutines all belong to one shared machine/object, so they
		// have a common c source file, and also header file. Lets get/create a
		// header, and store
		// the generated subroutines after processing.
		ArrayList<ClassHeaderInformation> headerList = translationManager
				.getClassHeaderInformation();
		// look for an existing header for the class
		boolean found = false;
		for (ClassHeaderInformation classHeader : headerList) {
			String className = classHeader.getClassName();
			if (className.equals(protectedSource.getName())) {
				headerInfo = classHeader;
				// save the headers, this will be used later on
				found = true;
				break;
			}
		}

		// if the header did not exist create a new one
		if (!found) {
			headerInfo = new ClassHeaderInformation();
			headerInfo.setClassName(protectedSource.getName());
			translationManager.addClassHeaderInformation(headerInfo);
		}

		List<String> signature = new ArrayList<String>();
		boolean markedSupported = bufferedReader.markSupported();
		if(!markedSupported){
			throw new IL1TranslationException("Mark not supported, cannot reset the" +
					" BufferedReader. New implementation required in: " + this);
		}
		
		bufferedReader.mark(1024);
		String line = bufferedReader.readLine();
		while (line != null) {
			// if we have reached the end of the function declaration
			if (line.contains(")")) {
				// get the line up to the closing parenthesis
				int end = line.indexOf(")");
				String substr = line.substring(0, end+1);
				signature.add(substr);
				break;
			} else {
				signature.add(line);
			}
			line = bufferedReader.readLine();
		}
		bufferedReader.reset();

		// add a semi-colon to the last segment
		String last = signature.get(signature.size()-1);
		signature.remove(signature.size()-1);
		last = last + ";";
		signature.add(last);
		
		//flatten to a single declaration.
		String flattenedSignature = new String("");
		for(String s: signature){
			flattenedSignature = flattenedSignature + s.trim();
		}
		
		headerInfo.getFunctionDeclarations().add(flattenedSignature);

		List<String> outCode = new ArrayList<>();
		return outCode;
	}

}
