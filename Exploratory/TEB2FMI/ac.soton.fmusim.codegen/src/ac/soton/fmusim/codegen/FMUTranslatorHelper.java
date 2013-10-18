package ac.soton.fmusim.codegen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eventb.codegen.il1.translator.IL1TranslationException;

public class FMUTranslatorHelper {

	private static FMUTranslatorHelper helper;

	public static FMUTranslatorHelper getDefault() {
		if (helper == null) {
			helper = new FMUTranslatorHelper();
		}
		return helper;
	}

	public BufferedWriter createBufferedWriter(IProject project,
			String targetDirectoryName, String targetFileName)
			throws IOException {
		IProject targetProject = project;
		IFolder resourceTargetFolder = targetProject
				.getFolder(targetDirectoryName);
		IFile resourceTargetFile = resourceTargetFolder.getFile(targetFileName);
		File targetFile = new File(resourceTargetFile.getRawLocationURI());
		FileWriter fw = new FileWriter(targetFile);
		BufferedWriter bw = new BufferedWriter(fw);
		return bw;
	}

	public BufferedWriter createBufferedWriter(IFolder resourceTargetFolder,
			String targetFileName) throws IOException, IL1TranslationException {
		IFile resourceTargetFile = resourceTargetFolder.getFile(targetFileName);
		File targetFile = new File(resourceTargetFile.getRawLocationURI());
		FileWriter fw = new FileWriter(targetFile);
		if (!targetFile.exists()) {
			boolean success = targetFile.createNewFile();
			if (!success)
				throw new IL1TranslationException(
						"Failed to create new targetFile: "
								+ resourceTargetFile.getName() + "/"
								+ targetFileName);
		}
		if (!targetFile.canWrite()) {
			throw new IL1TranslationException("Unable to write to targetFile"
					+ resourceTargetFile.getName() + "/"
					+ targetFileName);
		}

		BufferedWriter bw = new BufferedWriter(fw);
		return bw;
	}

}
