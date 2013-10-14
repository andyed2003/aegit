package ac.soton.fmusim.codegen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eventb.codegen.tasking.TaskingTranslationException;

public class ExternalFileHandler {
	// This method should send the external files from a source location
	// to their target folders. Any templates will be processed and sent to
	// the "src" folder, and other (unchanged) files will be copied to
	// "externals".
	public void handleExternalFiles() throws CoreException, IOException,
			TaskingTranslationException {
		// get the external files from the source project
		if (FMUTranslator.sourceRodinProject == null) {
			throw new TaskingTranslationException(
					"sourceProject not found in ExternalFileHandler Class");
		}
		List<IResource> externalResources = Arrays
				.asList(FMUTranslator.sourceRodinProject.getNonRodinResources());
		for (IResource resource : externalResources) {
			if (resource.getType() == IResource.FOLDER
					&& resource.getName().equals(
							FMUTranslator.EXTERNAL_SOURCE_FOLDER)) {
				IFolder folder = (IFolder) resource;
				List<IResource> folderMembers = Arrays.asList(folder.members());
				for (IResource member : folderMembers) {
					if (member.getType() == IResource.FILE) {
						IFile resourceFile = (IFile) member;
						String resourceFileName = resourceFile.getName();
						File iFile = new File(resourceFile.getRawLocationURI());
						FileReader reader = new FileReader(iFile);
						BufferedReader br = new BufferedReader(reader);
						// write all lines to a temporary store fro processing
						List<String> outputArrayList = new ArrayList<String>();
						// get a line and copy it unless it contains the 'begin
						// markup tag' string
						// If it does contain a tag then pass it on for special
						// handling
						boolean finished = false;
						boolean isTemplate = false;
						while (!finished) {
							String line = br.readLine();
							if (line == null) {
								finished = true;
							} else {
								outputArrayList.add(line);
								if (!isTemplate && line.contains("//##")) {
									isTemplate = true;
								}
							}
						}
						br.close();
						// if we do not have a template we simply copy the file
						// to the destination.
						if (!isTemplate) {
							BufferedWriter bw = createBufferedWriter(
									FMUTranslator.targetProject,
									FMUTranslator.EXTERNAL_SOURCE_FOLDER,
									resourceFileName);
							for (String line : outputArrayList) {
								bw.write(line + "\n");
							}
							bw.close();
						} else {
							List<String> modifiedOutput = new ArrayList<String>();
							// We shall modify the output depending on the markup
							for (String line : outputArrayList) {
								modifiedOutput.add(line);
							}
							BufferedWriter bw = createBufferedWriter(
									FMUTranslator.targetProject,
									FMUTranslator.GENERATED_SRC_FOLDER,
									resourceFileName);
							// then write the modified output
							for (String line : modifiedOutput) {
								bw.write(line + "\n");
							}
							bw.close();
						}

						// now we have an array of lines which we can process
						// and output

						for (String o : outputArrayList) {

						}
					}
				}
			}
		}
	}

	private BufferedWriter createBufferedWriter(IProject project,
			String targetDirectoryName, String targetFileName) throws IOException {
		IProject targetProject = project;
		IFolder resourceTargetFolder = targetProject
				.getFolder(targetDirectoryName);
		IFile resourceTargetFile = resourceTargetFolder.getFile(targetFileName);
		File targetFile = new File(resourceTargetFile.getRawLocationURI());
		FileWriter fw = new FileWriter(targetFile);
		BufferedWriter bw = new BufferedWriter(fw);
		return bw;
	}

}
