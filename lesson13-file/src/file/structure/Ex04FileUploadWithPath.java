package file.structure;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import utils.FileUtils;

public class Ex04FileUploadWithPath {
	private static String sourcepathName = String.join(File.separator, "storage", "template", "image", "sun.jpg");
	private static String targetpathName = String.join(File.separator, "storage", "template", "upload");

	public static void main(String[] args) {
		Path result = FileUtils.copy(sourcepathName, targetpathName);
		System.out.println("result :" + result.getFileName());
	}
}
