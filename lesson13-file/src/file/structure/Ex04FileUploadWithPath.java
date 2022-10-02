package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import utils.FileUtils;

public class Ex04FileUploadWithPath {
	private static String sourcePathName = String.join(File.separator, "storage" , "templante", "image", "root-flower.jpg");
	
	private static String targePathName = String.join(File.separator, "storage" , "templante", "upload");

	public static void main(String[] args) {
		

		Path source = Paths.get(sourcePathName);
		Path target = Paths.get(targePathName);


		Path targetPath = null;
		try {
			targetPath = Files.copy(source, target.resolve(renameTo(source.getFileName())));
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("targetPath " + targetPath.getFileName());
	}
	public static Path renameTo(Path source) {
		String filename = source.toString();
		String renameTo = "rnf " + System.currentTimeMillis() + new Random().nextInt(100)
				+ filename.substring(filename.lastIndexOf("."));
		return Paths.get(renameTo);
	}
}
