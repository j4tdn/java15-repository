package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileUpload {
	private static String sourcePathName = String.join(File.separator, "storage" , "templante", "image", "root-flower.jpg");
	
	private static String targePathName = String.join(File.separator, "storage" , "templante", "upload");
	public static void main(String[] args) {
		File sourceFile = new File(sourcePathName);
		File targetFile = FileUtils.createNewDir(targePathName);
		
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
