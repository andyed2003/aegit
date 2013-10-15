package ac.soton.fmusim.codegen;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import FmiModel.DocumentRoot;
import FmiModel.FmiScalarVariable;
import FmiModel.ModelVariablesType;

public class ModelDescriptionManager {

	private List<DocumentRoot> docRootList = new ArrayList<DocumentRoot>();
	private static ModelDescriptionManager manager;

	public static ModelDescriptionManager getDefault() {
		if (manager == null) {
			manager = new ModelDescriptionManager();
		}
		return manager;
	}

	public List<DocumentRoot> getDocumentRoot() {
		return docRootList;
	}

	public void setDocumentRoot(List<DocumentRoot> docRoot) {
		this.docRootList = docRoot;
	}

	public List<FmiScalarVariable> getScalarVariables() {
		List<FmiScalarVariable> scalarVarList = new ArrayList<FmiScalarVariable>();
		for(DocumentRoot documentRoot: docRootList){
		ModelVariablesType modelVars = documentRoot.getFmiModelDescription()
				.getModelVariables();
		EList<FmiScalarVariable> scalars = modelVars.getScalarVariable();
		scalarVarList.addAll(scalars);
	}
		return scalarVarList;
	}

}
