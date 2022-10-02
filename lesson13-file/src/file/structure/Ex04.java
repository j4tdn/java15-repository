package file.structure;

import java.io.File;
import java.nio.file.Path;


import utils.FileUtils;

public class Ex04 {
	private static String sourcePath = String.join(File.separator, "storage", "template", "image", "root-flower.png");
	private static String targetPath = String.join(File.separator, "storage", "template", "upload");

	public static void main(String[] args) {
		Path result = FileUtils.copy(sourcePath, targetPath);
	}
}