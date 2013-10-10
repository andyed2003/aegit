package ac.soton.fmusim.codegen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eventb.codegen.tasking.TaskingTranslationException;

public class ExternalFileHandler {
	// This method should send the external files from a source location
	// to their target folders. Any templates will be processed and sent to
	// the "src" folder, and other (unchanged) files will be copied to "externals".
	public void handleExternalFiles() throws CoreException, IOException, TaskingTranslationException {
		// get the external files from the source project
		if(FMUTranslator.sourceProject == null){
			throw new TaskingTranslationException("sourceProject not found in ExternalFileHandler Class");
		}
		List<IResource> externalResources = Arrays.asList(FMUTranslator.sourceProject.getNonRodinResources());
		for(IResource resource : externalResources){
			if(resource.getType() == IResource.FOLDER && resource.getName().equals(FMUTranslator.EXTERNAL_SOURCE_FOLDER)){
				IFolder folder = (IFolder) resource;
				List<IResource> folderMembers = Arrays.asList(folder.members());
				for(IResource member: folderMembers){
					if(member.getType() == IResource.FILE){
						IFile file = (IFile) member;
						FileReader reader = new FileReader(file.getRawLocation().toString());
						BufferedReader br = new BufferedReader(reader);
						String line = br.readLine();
						br.close();					}
				}
				System.out.println();
			}
		}
	}

}
