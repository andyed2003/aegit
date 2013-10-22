package org.eventb.codegen.templates.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
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
	public IFolder getTargetFolder(IProject project, String folderName) {
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
		// we got here so we've been unable to initialise the reader
		throw new IL1TranslationException(
				"could not initialise Template Reader with: "
						+ rodinProject.getElementName() + "/" + folderName);
	}

	// This is the method that should go through each line, and replace the
	// tag with generated code. Then write the output to a file.
	public void instantiateTemplate(BufferedWriter bufferedWriter, String masterTemplateName)
			throws IOException, TemplateException, IL1TranslationException,
			CoreException {
		List<IResource> folderMembers = Arrays.asList(templateSourceFolder
				.members());
		File masterTemplate = null;
		for (IResource member : folderMembers) {
			if (member.getType() == IResource.FILE) {
				IFile resourceFile = (IFile) member;
				URI uri = resourceFile.getRawLocationURI();
				File iFile = new File(uri);
				IPath path = new Path(uri.getPath());
				String fileName = path.lastSegment();
				if (fileName.equals(masterTemplateName)) {
					// We've found the masterTemplate resource, 
					// so log it, and exit the lookup.
					masterTemplate = iFile;
					break;
				}
			}
		}
		if(masterTemplate == null){
			throw new TemplateException("Master template ("+ masterTemplateName +") not found in templates folder");
		}
		// Let's read the template.
		FileReader reader = new FileReader(masterTemplate);
		BufferedReader br = new BufferedReader(reader);
		// write all lines to a temporary store for processing
		List<String> tempArrayList = new ArrayList<String>();
		// Get a line and copy it. If it has the 'begin
		// markup' tag, then mark it as a template and we will
		// pass it on for special handling.
		boolean finished = false;
		while (!finished) {
			String line = br.readLine();
			if (line == null) {
				finished = true;
			} else {
				List<String> newLines = null;
				if (line.contains(TemplateReader.TAG_BEGIN)) {
					String keyword = getKeyword(line);
					TemplateHelper templateHelper = TemplateHelper.getDefault();
					newLines = templateHelper.generate(keyword);
				}
				if(newLines == null){
					tempArrayList.add(line);
				}
				else{
					tempArrayList.addAll(newLines);
				}

			}
		}
		br.close();

		// POST Process: write the output.
		for (String line : tempArrayList) {
			bufferedWriter.write(line + "\n");
		}
	}

	private String getKeyword(String line) {
		int firstDelimiter = line.indexOf("<") + 1;
		int lastDelimiter = line.indexOf(">");
		String keyword = line.substring(firstDelimiter, lastDelimiter);
		return keyword;
	}

	// get the mapping from keys to values from a repository
	private void getTemplateKeyMapping() {

	}

}
