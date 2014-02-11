package ac.soton.fmusim.fmu.popup.actions;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.util.zip.*;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class PackageFMU implements IObjectActionDelegate {

	private Shell shell;
	private IStructuredSelection selection;

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
		// Get the source project that has been selected for FMU Packaging
		IProject sourceProject = (IProject) selection.getFirstElement();
		// This is where the Debug Binary is
		IFolder sourceBinariesFolder = sourceProject.getFolder("Debug");

		// Construct the libraryName - this may need to change - for the FMU standard
		String sourceBinaryFileName = "lib" + sourceProject.getName() + ".so";
		// Get the binary.so
		IFile binaryFile = sourceBinariesFolder.getFile(sourceBinaryFileName);
		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject targetProject = root.getProject(sourceProject.getName()
					+ "FMU");
			// create a new project
			if (!targetProject.exists()) targetProject.create(null);
			if (!targetProject.isOpen()) targetProject.open(null);
			// this will be the new zip file
			IFile ff = targetProject.getFile("abcd.zip");
			// get a reader for the library .so
			InputStream binaryStream = binaryFile.getContents();
			InputStreamReader reader = new InputStreamReader(binaryStream);
			String targetZipName = ff.getRawLocation().toString();
			// get output streams to write to the zip
			FileOutputStream fOut = new FileOutputStream(
					targetZipName);
			ZipOutputStream zipOut = new ZipOutputStream(fOut);

			// create a zip entry
			ZipEntry ze = new ZipEntry("zipOut");
			zipOut.putNextEntry(ze);

			// write the file to the zip entry
			int value = reader.read();
			while (value > 0) {
				zipOut.write(value);
				value = reader.read();
			}
			// close the writer and reader;
			zipOut.close();
			reader.close();
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = (IStructuredSelection) selection;
	}

}
