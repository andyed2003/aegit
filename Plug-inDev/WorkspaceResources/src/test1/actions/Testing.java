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

		IProject pp = wsr.getProject("pp");
		try {
			if (pp.exists()) {
				if (!pp.isOpen()) {
					pp.open(null);
				}
			} else {
				pp.create(null);
				pp.open(null);
			}

			IFolder fo = pp.getFolder("fo");
			if (!fo.exists()) {
				fo.create(false, true, null);
			}

			IFile fi = fo.getFile("abc.txt");
			if (!fi.exists()) {
				fi.create(null, false, null);
			}
			String fullName = fi.getLocation().toString();
			BufferedWriter out = new BufferedWriter(new FileWriter(fullName));
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
