package file.content;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import utils.FileUtils;

public class Ex03FileReader {
	private static String pathname = String.join(File.separator, "storage" , "data", "context.txt");
	
	public static void main(String[] args) {
		Path path = FileUtils.createNewFileAsPath(pathname);
		
		List<String> lines = FileUtils.readFile(path);
		lines.forEach(System.out::println);
		
		System.out.println("Finished ....");
	}
}
