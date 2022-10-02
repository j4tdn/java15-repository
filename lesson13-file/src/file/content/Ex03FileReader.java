package file.content;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import bean.Customer;
import utils.FileUtils;

public class Ex03FileReader {
	private static String pathname = String.join(File.separator, "storage", "data", "content.txt");

	public static void main(String[] args) {
		Path path = FileUtils.createNewFileAsPath(pathname);
		
		
		// co the su dung constructor reference Customer::new
		List<Customer> customers =  FileUtils.readFile(path, Customer::transfer);
		customers.forEach(System.out::println);
		System.out.println("Finished ...");
	}
}
