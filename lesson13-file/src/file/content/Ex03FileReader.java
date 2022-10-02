package file.content;

import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;

import bean.Customer;
import utils.FileUtils;

public class Ex03FileReader {
	private static String pathname = String.join(File.separator, "storage", "data", "content.txt");
	public static void main(String[] args) {
		Path path = FileUtils.createNewFileAsPath(pathname);
		List<Customer> custonmers = FileUtils.readFile(path, Customer::transfer);
		
		List<String> lines = FileUtils.readFile(path);
		lines.forEach(System.out::println);
		
		System.out.println("Finished ...");	}
}
