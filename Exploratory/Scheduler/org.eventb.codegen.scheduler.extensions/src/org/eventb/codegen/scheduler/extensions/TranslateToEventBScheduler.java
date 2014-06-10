package org.eventb.codegen.scheduler.extensions;

import java.util.ArrayList;

import org.eventb.codegen.il1.Program;
import org.eventb.codegen.il1.translator.AbstractTranslateEventBToTarget;
import org.eventb.codegen.il1.translator.ClassHeaderInformation;
import org.eventb.codegen.il1.translator.IL1TranslationManager;
import org.eventb.codegen.il1.translator.TargetLanguage;
import org.eventb.codegen.il1.translator.utils.IL1CodeFiler;


public class TranslateToEventBScheduler extends AbstractTranslateEventBToTarget
{

	@Override
	protected TargetLanguage getTargetLanguage() {
		return new TargetLanguage("Java");
	}

	@Override
	protected ArrayList<String> formatCode(ArrayList<String> code, IL1TranslationManager translationManager) {
		return formatCodeBraces(code);
	}

	@Override
	protected void saveToFile(ArrayList<String> codeToSave,
			ArrayList<ClassHeaderInformation> headerInformation,
			Program program, String directoryName,
			IL1TranslationManager translationManager) {	
		
		for (int lineNumber = 0; lineNumber < codeToSave.size(); lineNumber++)			
		{
			String line = codeToSave.get(lineNumber);
			
			if (line.equals("// Protected"))
			{
				//	Extract the protected code
				ArrayList<String> protectedCode = new ArrayList<String>();
				lineNumber = getCodeBlock(codeToSave,lineNumber+1,"// EndProtected",protectedCode);
				
				//	Get the protected name
				//	Assumes first line is // Protected:
				String name = getName(protectedCode, "// Protected:");
				
				IL1CodeFiler.getDefault().save(protectedCode,directoryName, name + ".java", translationManager);
			}
			else if (line.equals("// Task"))
			{
				//	Extract the protected code
				ArrayList<String> taskCode = new ArrayList<String>();
				lineNumber = getCodeBlock(codeToSave,lineNumber+1,"// EndTask",taskCode);
				
				//	Get the protected name
				//	Assumes first line is // Task:
				String name = getName(taskCode, "// Task:");
				
				IL1CodeFiler.getDefault().save(taskCode,directoryName, name + ".java", translationManager);
			}
			else if (line.equals("// MainEntry"))
			{
				//	Extract the protected code
				ArrayList<String> taskCode = new ArrayList<String>();
				lineNumber = getCodeBlock(codeToSave,lineNumber+1,"// EndMainEntry",taskCode);
				
				//	Get the protected name
				//	Assumes first line is // Task:
				String name = getName(taskCode, "// MainEntry:");
				
				IL1CodeFiler.getDefault().save(taskCode,directoryName, name + ".java", translationManager);
			}
			else if (line.equals("// EnvironTask"))
			{
				//	Extract the protected code
				ArrayList<String> taskCode = new ArrayList<String>();
				lineNumber = getCodeBlock(codeToSave,lineNumber+1,"// EndEnvironTask",taskCode);
				
				//	Get the protected name
				//	Assumes first line is // Task:
				String name = getName(taskCode, "// EnvironTask:");
				
				IL1CodeFiler.getDefault().save(taskCode,directoryName, name + ".java", translationManager);
			}
			else if (line.equals("// GlobalDeclarations"))
			{
				ArrayList<String> globalDeclCode = new ArrayList<String>();
				lineNumber = getCodeBlock(codeToSave, lineNumber+1, "// EndGlobalDeclarations", globalDeclCode);
				
				//	put these in a class on their own
				IL1CodeFiler.getDefault().save(globalDeclCode, directoryName, "GlobalDeclarations.java", translationManager);
			}
			else
			{
				//	Do nothing with it
			}			
		}	
	}
	
	protected int getCodeBlock(ArrayList<String> codeIn, int startIdx, String endStatement, ArrayList<String> codeOut)
	{
		int endIdx = startIdx;
		for (int i = startIdx; i < codeIn.size() && !codeIn.get(i).equals(endStatement); i++, endIdx++)
		{
			codeOut.add(codeIn.get(i));
		}
		
		return endIdx;
	}
	
	protected String getName(ArrayList<String> codeIn, String lhs)
	{
		//	Find first occurence of the lhs string
		//	As the first lines may be include / import statements
		for (String s : codeIn)
		{
			if (s.startsWith(lhs))
			{
				return s.split(lhs)[1].trim();
			}
		}		
		
		return "";	//	something went wrong
	}	
}



