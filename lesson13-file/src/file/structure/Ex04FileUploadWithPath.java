package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import utils.FileUtils;

public class Ex04FileUploadWithPath {
	private static String sourcePathName = String.join(File.separator, 
					"storage", "template", "images","girl-with-candle-lantern-autumn.jpg");
	
	private static String targetPathName = String.join(File.separator, 
			"storage", "template", "upload");
	
	public static void main(String[] args) {
		Path result = FileUtils.copy(sourcePathName, targetPathName);
		System.out.println("result " + result.getFileName());
	}
}