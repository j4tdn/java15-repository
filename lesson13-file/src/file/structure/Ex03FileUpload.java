package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import utils.FileUtils;

public class Ex03FileUpload {
	private static String sourcePath = String.join(File.separator, "storage", "template", "image", "root-flower.png");
	private static String targetPath = String.join(File.separator, "storage", "template", "upload");

	public static void main(String[] args) {
		File sourceFile = new File(sourcePath);
		File targetFile = FileUtils.createNewDir(targetPath);

		Path source = sourceFile.toPath();
		Path target = targetFile.toPath();
        Path result = null;
		try {
			result = Files.copy(source, target.resolve(sourceFile.getName()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		System.out.println("result " + result.getFileName());
	}
}