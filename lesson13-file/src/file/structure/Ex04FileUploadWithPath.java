package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import utils.FileUtils;

public class Ex04FileUploadWithPath {
	private static String sourcePathName = String.join(File.separator,"storage","template","image","ke-kho-de-vai.jpg");
	private static String targetPathName = String.join(File.separator,"storage","template","upload");
	public static void main(String[] args) {
		
		
		Path source = Paths.get(sourcePathName);
		Path target = Paths.get(targetPathName);
		Path result = null;
		try {
			 result = Files.copy(source, target.resolve(source.getFileName()));
		} catch (IOException e) {

			e.printStackTrace();
		}
		System.out.println("result "  + result.getFileName());
		
	}

}
