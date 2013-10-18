package org.eventb.codegen.templates.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eventb.codegen.il1.translator.IL1TranslationException;
import org.rodinp.core.IRodinProject;
import org.rodinp.core.RodinDBException;

public class TemplateReader {
	private static TemplateReader templateReader = null;
	public static final String TAG_BEGIN = "//##";
	private IFolder templateSourceFolder = null;
	private IFolder targetFolder = null;
	
	public static TemplateReader getDefault() {
		if (templateReader == null) {
			templateReader = new TemplateReader();
		}
		return templateReader;
	}

	// Given a Project find the folder with that name.
	// We use it to find the templates folder;
	public IFolder getTargetFolder(IProject project, String folderName){
		targetFolder = project.getFolder(folderName);
		return targetFolder;
	}
	
	// Given a Rodin Project find the (non-Rodin) folder with that name.
	// We use it to find the templates source folder;
	public void initialise(IRodinProject rodinProject, String folderName)
			throws RodinDBException, IL1TranslationException {
		List<IResource> nonRodinResources = Arrays.asList(rodinProject
				.getNonRodinResources());
		for (IResource resource : nonRodinResources) {
			if (resource.getType() == IResource.FOLDER
					&& resource.getName().equals(folderName)) {
				templateSourceFolder = (IFolder) resource;
				// we've found it, let's return.
				return;
			}
		}
		// we got hete so we've been unable to initialise the reader
		throw new IL1TranslationException("could not initialise Template Reader with: " 
		+ rodinProject.getElementName()+"/"
				+ folderName);
	}

	// This is the method that should go through each line, and replace the
	// tag with generated code. Then write the output to a file.
	public void instantiateTemplate(BufferedWriter bufferedWriter) throws IOException,
			TemplateException, IL1TranslationException, CoreException {
		List<IResource> folderMembers = Arrays.asList(templateSourceFolder.members());
		for (IResource member : folderMembers) {
			if (member.getType() == IResource.FILE) {
				IFile resourceFile = (IFile) member;
				File iFile = new File(resourceFile.getRawLocationURI());
				FileReader reader = new FileReader(iFile);
				BufferedReader br = new BufferedReader(reader);
				// write all lines to a temporary store for processing
				List<String> tempArrayList = new ArrayList<String>();
				// Get a line and copy it. If it has the 'begin
				// markup' tag, then mark it as a template and we will
				// pass it on for special handling.
				boolean finished = false;
				boolean isTemplate = false;
				while (!finished) {
					String line = br.readLine();
					if (line == null) {
						finished = true;
					} else {
						tempArrayList.add(line);
						if (!isTemplate
								&& line.contains(TemplateReader.TAG_BEGIN)) {
							isTemplate = true;
						}
					}
				}
				br.close();
				// if we do not have a template we have an error.
				if (!isTemplate) {
					throw new IL1TranslationException(iFile,
							"Non-Template(s) found in 'templates' " + "folder");
				} else {
					// iterate through each line getting tags if they exist.
					for (String s : tempArrayList) {
						if (s.contains(TemplateReader.TAG_BEGIN)) {
							System.out.println("FOUND A TAG <<<<<<<<<<<<<<<<<<");
						}
					}

					
					for (String line : tempArrayList) {
						bufferedWriter.write(line + "\n");
					}
					bufferedWriter.flush();
					bufferedWriter.close();

				}
			}
		}
	}

	// get the mapping from keys to values from a repository
	private void getTemplateKeyMapping() {

	}

}
