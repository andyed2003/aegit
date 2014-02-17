package ac.soton.fmusim.fmu.popup.actions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.statushandlers.StatusManager;

import ac.soton.fmusim.fmu.FMUPackagerPlugin;

public class PackageFMU implements IObjectActionDelegate {

	@SuppressWarnings("unused")
	private Shell shell;
	private IStructuredSelection selection;
	private String projectName;
	private IProject sourceProject;
	private String modelIdentifier;

	/**
	 * Constructor for Action1.
	 */
	public PackageFMU() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			sourceProject = (IProject) selection.getFirstElement();
			IFile srcDescriptionFile = getSourceDescriptionFile(sourceProject);
			packageFMU(srcDescriptionFile);
		} catch (CoreException e) {
			Status status = new Status(IStatus.ERROR,
					FMUPackagerPlugin.PLUGIN_ID,
					"Packaging FMU Failed: CoreException:"
					+ e.getMessage() +":\n", e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
			e.printStackTrace();
		} catch (IOException e) {
			Status status = new Status(IStatus.ERROR,
					FMUPackagerPlugin.PLUGIN_ID,
					"Packaging FMU Failed: IOException:"
					+ e.getMessage() +":\n", e);
				StatusManager.getManager().handle(status,
					StatusManager.SHOW);
			e.printStackTrace();
		}

	}

	private void packageFMU(IFile srcDescriptionFile) throws CoreException, FileNotFoundException,
			IOException {
		IFile binaryFile = null;
		projectName = sourceProject.getName();
		// This is where the Debug Binary is stored
		IFolder debugBinariesFolder = sourceProject.getFolder("Debug");
		IFolder releaseBinariesFolder = sourceProject.getFolder("Release");
		
		// Construct the libraryName - this may need to change - for the FMU
		// standard
		String OSName = System.getProperty("os.name");
		// TODO appropriate fileExtension
		String sourceBinaryFileName = "lib" + projectName + ".so";
		// Get the binary.so
		IFile debugBinaryFile = debugBinariesFolder.getFile(sourceBinaryFileName);
		IFile releaseBinaryFile = releaseBinariesFolder.getFile(sourceBinaryFileName);
		// if we have both release and binary files throw an exception
		if(!debugBinaryFile.exists() && !releaseBinaryFile.exists()){
			throw new FileNotFoundException("cannot find 'debug' or 'release' library file");
		}
		else if(debugBinaryFile.exists() && releaseBinaryFile.exists()){
			throw new IOException("cannot process both 'debug' and 'release' libraries \n + " +
					"please delete one - TODO - fix this");
		}
		else if(debugBinaryFile.exists()){
			binaryFile = debugBinaryFile;
		}
		else binaryFile = releaseBinaryFile;
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject targetProject = root.getProject(projectName + "FMU");
		// create a new project
		if (!targetProject.exists())
			targetProject.create(null);
		if (!targetProject.isOpen())
			targetProject.open(null);
		// this will be the new zip file
		IPath path = srcDescriptionFile.getRawLocation();
		modelIdentifier = path.removeFileExtension().lastSegment();
		IFile targetZipFile = targetProject.getFile(modelIdentifier + ".zip");
		String targetZipName = targetZipFile.getRawLocation().toString();
		// get output streams to write to the zip
		FileOutputStream fOut = new FileOutputStream(targetZipName);
		ZipOutputStream zipOut = new ZipOutputStream(fOut);
		// package the binary file
		packageBinaryFile(binaryFile, zipOut);
		// package the model description
		packageModelDescription(srcDescriptionFile, zipOut);
		zipOut.close();
	}


	private void packageBinaryFile(IFile binaryFile, ZipOutputStream zipOut)
			throws CoreException, FileNotFoundException, IOException {
		String sourceBinaryFileName = binaryFile.getName();
		String fileExt = binaryFile.getRawLocation().getFileExtension();
		// get a reader for the library .so
		if(!binaryFile.isAccessible()) throw new FileNotFoundException("Cannot Find "+sourceBinaryFileName);
		InputStream binaryStream = binaryFile.getContents();
		InputStreamReader binaryStreamReader = new InputStreamReader(
				binaryStream);
		// create a zip entry
		String OSName = System.getProperty("os.name");
		String SunArch = System.getProperty("sun.arch.data.model");
		String tgtDirectory = "";
		if(OSName.equalsIgnoreCase("linux")){
			if(SunArch.equalsIgnoreCase("64")) tgtDirectory = "linux64";
			if(SunArch.equalsIgnoreCase("32")) tgtDirectory = "linux32";
		}
		else if(OSName.equalsIgnoreCase("windows")){
			if(SunArch.equalsIgnoreCase("64")) tgtDirectory = "win64";
			if(SunArch.equalsIgnoreCase("32")) tgtDirectory = "win32";
		}
		
		// add the binary file entry 
		ZipEntry ze = new ZipEntry("binaries" + File.separatorChar + tgtDirectory
				+ File.separatorChar + modelIdentifier + "." + fileExt);
		zipOut.putNextEntry(ze);

		// write the file to the zip entry
		int value = binaryStreamReader.read();
		while (value > 0) {
			zipOut.write(value);
			value = binaryStreamReader.read();
		}
		binaryStreamReader.close();
	}
	
	private void packageModelDescription(IFile srcDescriptionFile, ZipOutputStream zipOut) throws CoreException, IOException {
		InputStream srcDescriptionStream = srcDescriptionFile.getContents();
		InputStreamReader descriptionStreamReader = new InputStreamReader(
				srcDescriptionStream);

		// Create the target description path. It goes in the archive root
		String tgtDescriptionFileName = "modelDescription.XML";

		// create a zip entry
		ZipEntry ze = new ZipEntry(tgtDescriptionFileName);
		zipOut.putNextEntry(ze);

		// write the file to the zip entry
		int value = descriptionStreamReader.read();
		while (value > 0) {
			zipOut.write(value);
			value = descriptionStreamReader.read();
		}
		descriptionStreamReader.close();
	}

	private IFile getSourceDescriptionFile(IProject sourceProject)
			throws CoreException, FileNotFoundException {
		IFolder srcDescriptionsFolder = sourceProject.getFolder("descriptions");
		IResource[] members = srcDescriptionsFolder.members();
		if(members.length > 1) throw new FileNotFoundException("Found too many files in the descriptions folder: "+srcDescriptionsFolder.getName());
		IResource srcDescriptionResource = members[0];
		String srcDescriptionFileName = srcDescriptionResource.getName();
		IFile srcDescriptionFile = srcDescriptionsFolder.getFile(srcDescriptionFileName);
		return srcDescriptionFile;
	}

	
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
