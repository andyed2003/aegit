package ac.soton.fmusim.codegen.translator.il1tofmuc;

import java.util.ArrayList;
import java.util.List;

import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.templates.IGeneratorData;


// A data class with the necessary information for translation of a subroutine.
public class GeneratorData implements IGeneratorData {
	
	IL1TranslationManager translationManager = null;
	private List<Object> dataList = new ArrayList<Object>();
	
	public List<Object> getDataList() {
		return dataList;
	}

}
