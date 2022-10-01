package file.structure;

import java.io.File;
import java.nio.file.Path;

import utils.FileUtils;

public class Ex04FileUploadWithPath {
	
	private static String sourcePathName = String.join(File.separator, 
			"storage", "template", "image", "root-flower.png");
	
	private static String targetPathName = String.join(File.separator, 
			"storage", "template", "upload");
	
	public static void main(String[] args) {
		Path result = FileUtils.copy(sourcePathName, targetPathName);
		
		System.out.println("result " + result.getFileName());
	}
}