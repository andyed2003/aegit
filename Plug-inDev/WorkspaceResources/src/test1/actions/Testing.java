package test1.actions;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class Testing {

	/**
	 * @param args
	 */
	public void run() {

		IWorkspaceRoot wsr = ResourcesPlugin.getWorkspace().getRoot();

		IProject prj = wsr.getProject("pp");
		try {
			if (prj.exists()) {
				if (!prj.isOpen()) {
					prj.open(null);
				}
			} else {
				prj.create(null);
				prj.open(null);
			}

			IFolder folder = prj.getFolder("fo");
			if (!folder.exists()) {
				folder.create(false, true, null);
			}

			IFile file = folder.getFile("abc.txt");
			if (!file.exists()) {
				file.create(null, false, null);
			}
			String fileLocation = file.getLocation().toString();
			BufferedWriter out = new BufferedWriter(new FileWriter(fileLocation));
			out.write("Testing123");
			out.close();
		} catch (CoreException | FileNotFoundException
				| UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
