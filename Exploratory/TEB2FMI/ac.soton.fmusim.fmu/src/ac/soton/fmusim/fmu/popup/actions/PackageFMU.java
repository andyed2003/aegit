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
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
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

	private Shell shell;
	private IStructuredSelection selection;
	private IFile binaryFile = null;
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
			packageFMU();
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

	private void packageFMU() throws CoreException, FileNotFoundException,
			IOException {
		// Get the source project that has been selected for FMU Packaging
		IProject sourceProject = (IProject) selection.getFirstElement();
		// This is where the Debug Binary is
		IFolder debugBinariesFolder = sourceProject.getFolder("Debug");
		IFolder releaseBinariesFolder = sourceProject.getFolder("Release");
		
		// Construct the libraryName - this may need to change - for the FMU
		// standard
		String sourceBinaryFileName = "lib" + sourceProject.getName() + ".so";
		// Get the binary.so
		IFile debugBinaryFile = debugBinariesFolder.getFile(sourceBinaryFileName);
		IFile releaseBinaryFile = releaseBinariesFolder.getFile(sourceBinaryFileName);
		// if we have both release and binary files throw an exception
		if(debugBinaryFile == null && releaseBinaryFile == null){
			throw new FileNotFoundException("cannot find 'debug' or 'release' library file");
		}
		else if(debugBinaryFile != null && releaseBinaryFile != null){
			throw new IOException("cannot process both 'debug' and 'release' libraries \n + " +
					"please delete one - TODO - fix this");
		}
		else if(debugBinaryFile != null){
			binaryFile = debugBinaryFile;
		}
		else binaryFile = releaseBinaryFile;
		
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IProject targetProject = root.getProject(sourceProject.getName()
				+ "FMU");
		// create a new project
		if (!targetProject.exists())
			targetProject.create(null);
		if (!targetProject.isOpen())
			targetProject.open(null);
		// this will be the new zip file
		IFile ff = targetProject.getFile("abcd.zip");
		
		packageBinaryFile(sourceProject, sourceBinaryFileName, binaryFile, ff);
		packageModelDescription(sourceProject);

	}

	private void packageModelDescription(IProject sourceProject) {
		IFolder descriptionsFolder = sourceProject.getFolder("descriptions");
		//IResource r = new ResourceImpl();
		System.out.println();
	}

	private void packageBinaryFile(IProject sourceProject,
			String sourceBinaryFileName, IFile binaryFile, IFile ff)
			throws CoreException, FileNotFoundException, IOException {
		// get a reader for the library .so
		if(!binaryFile.isAccessible()) throw new FileNotFoundException("Cannot Find "+sourceBinaryFileName);
		InputStream binaryStream = binaryFile.getContents();
		InputStreamReader binaryStreamReader = new InputStreamReader(
				binaryStream);
		String targetZipName = ff.getRawLocation().toString();
		// get output streams to write to the zip
		FileOutputStream fOut = new FileOutputStream(targetZipName);
		ZipOutputStream zipOut = new ZipOutputStream(fOut);

		// create a zip entry
		ZipEntry ze = new ZipEntry("binaries" + File.separatorChar
				+ sourceBinaryFileName);
		zipOut.putNextEntry(ze);

		// write the file to the zip entry
		int value = binaryStreamReader.read();
		while (value > 0) {
			zipOut.write(value);
			value = binaryStreamReader.read();
		}

		sourceProject.getFile("");
		zipOut.close();
		binaryStreamReader.close();
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
