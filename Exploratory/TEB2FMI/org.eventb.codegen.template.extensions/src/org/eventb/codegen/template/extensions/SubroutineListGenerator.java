package org.eventb.codegen.template.extensions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eventb.codegen.il1.Protected;
import org.eventb.codegen.templates.IGenerator;

import ac.soton.fmusim.codegen.ModelDescriptionManager;

import FmiModel.BooleanType;
import FmiModel.DocumentRoot;
import FmiModel.FmiScalarVariable;
import FmiModel.IntegerType;
import FmiModel.RealType1;
import FmiModel.StringType;

public class SubroutineListGenerator implements IGenerator {

	private Protected actualSource = null;
	
	@Override
	public List<String> generate(Object data) {
		List<String> outCode = new ArrayList<String>();
		if(data instanceof Protected){
			actualSource = (Protected) data;
			processVariableDecls(outCode);
		}
		return outCode;
	}


	private void processVariableDecls(List<String> outCode) {
		// Add the instance variable references
		outCode.add("// Variables and constants");
		// we need to add declarations, like "int i[integerArraySize];" for each
		// fmi array type
		String machineName = actualSource.getMachineName();
		List<DocumentRoot> docs = ModelDescriptionManager.getDefault()
				.getDocumentRoot();
		// find the document root for this IL1 protected
		RealType1 r = null;
		IntegerType i = null;
		BooleanType b = null;
		StringType s = null;
		for (DocumentRoot docRoot : docs) {
			if (docRoot.getFmiModelDescription().getModelName()
					.equals(machineName)) {
				// we have found the related modelDescription file, get the
				// scalars
				EList<FmiScalarVariable> scalars = docRoot
						.getFmiModelDescription().getModelVariables()
						.getScalarVariable();
				// for each of the scalars get set to a non-null value to output
				// an an FMI array declaration;
				for (FmiScalarVariable scalar : scalars) {
					if (r == null)
						r = scalar.getReal();
					if (i == null)
						i = scalar.getInteger();
					if (b == null)
						b = scalar.getBoolean();
					if (s == null)
						s = scalar.getString();
					// get the variable name and value reference into a
					// declaration.
					outCode.add("fmiValueReference " + scalar.getName() + "_"
							+ machineName + "_ = " + scalar.getValueReference()
							+ ";");
				}
				// when we are done iterating through the scalars we can quit
				// the search
				break;
			}
		}

		if (r != null)
			outCode.add("fmiReal i[realArraySize];");
		if (b != null)
			outCode.add("fmiBoolean b[booleanArraySize];");
		if (i != null)
			outCode.add("fmiInteger i[integerArraySize];");
		if (s != null)
			outCode.add("fmiString s[stringArraySize];");

		outCode.add("");
	}
}
