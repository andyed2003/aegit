package org.eventb.codegen.templates.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;
import org.eventb.codegen.templates.TemplatesPlugin;

public class TemplateReader{
	private File template = null;
	FileReader templateReader = null;
	
	
	public TemplateReader(File template_){
		checkConstruction(template_);
	}

	private void checkConstruction(File template_) {
		boolean isFile = template_.isFile();
		boolean canRead = template_.canRead();
		template = template_;
		try {
			if(!(isFile && canRead)){
				throw new TemplateException();
			}
			templateReader = new FileReader(template_);
		} catch (FileNotFoundException e) {
			Status status = new Status(IStatus.ERROR,
					TemplatesPlugin.PLUGIN_ID,
					"Failed Translation: FileNotFoundException:"
					+ e.getMessage(), e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
		} catch (TemplateException e) {
			Status status = new Status(IStatus.ERROR,
					TemplatesPlugin.PLUGIN_ID,
					"Failed Translation: TemplateException:"
					+ e.getMessage(), e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);		}
	}
	
	
	public void instantiateTemplate(String fname) throws IOException, TemplateException{
		// reset the file
		if(!templateReader.ready()){throw new TemplateException();}
		templateReader.reset();
		// get the mapping
		getTemplateKeyMapping();
		// iterate through the lines
		// where a key match is found, conditionally substitute keys for values
		
	}
	
	// get the mapping from keys to values from a repository
	private void getTemplateKeyMapping() {
		
	}

	public boolean readyRead() throws IOException{
		return templateReader.ready();
	}
	
	public void readline(){
		
	}
	
	
	public void writeToFile(String fName){
		
	}

}
