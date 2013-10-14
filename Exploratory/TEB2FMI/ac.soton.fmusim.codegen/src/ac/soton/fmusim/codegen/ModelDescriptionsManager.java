package ac.soton.fmusim.codegen;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import FmiModel.BooleanType;
import FmiModel.DocumentRoot;
import FmiModel.FmiScalarVariable;
import FmiModel.ModelVariablesType;

public class ModelDescriptionsManager {
	
	private ArrayList<DocumentRoot> docRootList;

	public ModelDescriptionsManager(ArrayList<DocumentRoot> docRootList_) {
		setDocRootList(docRootList_);
	}

	public ArrayList<DocumentRoot> getDocRootList() {
		return docRootList;
	}

	public void setDocRootList(ArrayList<DocumentRoot> docRootList) {
		this.docRootList = docRootList;
	}
	
	public void getVariableType(String variableName){
		for(DocumentRoot docRoot : docRootList){
			ModelVariablesType modelVars = docRoot.getFmiModelDescription().getModelVariables();
			EList<FmiScalarVariable> scalars = modelVars.getScalarVariable();
			for(FmiScalarVariable scalar : scalars){
				if(scalar.getName().equals(variableName)){
					long vr = scalar.getValueReference();
					BooleanType bool = scalar.getBoolean();
				}
			}
		}
	}

}
