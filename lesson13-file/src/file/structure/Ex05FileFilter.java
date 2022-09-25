package file.structure;

import java.io.File;
import java.util.Arrays;

import utils.FileUtils;

public class Ex05FileFilter {
	
	private static String dirPath = "storage" + File.separator
			+ "random";
	public static void main(String[] args) {
		File dir = FileUtils.createRandomFiles(dirPath, 30, "txt", "java", "png", "mp3", "mp4", "exe");
		System.out.println("dir --> " + dir);
		
		File[] exeFiles = dir.listFiles(file -> file.isFile() && file.getName().endsWith(".exe"));
		
		Arrays.stream(exeFiles) // Stream<File>
			  .forEach(File::delete);
		
	}
}
