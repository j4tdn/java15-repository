package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileUpload {
	private static String sourcePathName = String.join(File.separator, 
					"storage", "template", "images","at.jpg");
	
	private static String targetPathName = String.join(File.separator, 
			"storage", "template", "upload");
	
	public static void main(String[] args) {
		File sourceFile = new File(sourcePathName);
		//File targetFile = new File(targetPathName);
		File targetFile = FileUtils.createNewDir(targetPathName);
		
		Path source = sourceFile.toPath();
		Path target = targetFile.toPath();
		
		Path result = null;
		try {
			result = Files.copy(source, target.resolve(sourceFile.getName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("result " + result.getFileName());
	}
}