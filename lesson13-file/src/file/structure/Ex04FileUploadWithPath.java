package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import utils.FileUtils;

public class Ex04FileUploadWithPath {
	private static String sourcePath = String.join(File.separator, "storage", "template","image","root-flower.jpg");
	
	private static String targetPath = String.join(File.separator, "storage", "template","upload");
	public static void main(String[] args) {
		
		Path result = FileUtils.copy(sourcePath, targetPath);
		System.out.println("result " + result.getFileName());
		
	}
}
