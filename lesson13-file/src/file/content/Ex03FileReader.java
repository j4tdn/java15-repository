package file.content;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

import bean.Customer;
import utils.FileUtils;

public class Ex03FileReader {

	private static String pathname = String.join(File.separator, "storage", "data", "content.txt");

	public static void main(String[] args) {
		/*
		Path path = FileUtils.createFileAsPath(pathname);

		List<String> lines = FileUtils.readFile(path);
		lines.forEach(System.out::println);

		System.out.println("Finish.");
		*/
		
		//Case: Function<String,T>
		
		Path path = FileUtils.createFileAsPath(pathname);
		List<Customer> customers= FileUtils.readFileCase1(path, Customer::transfer );
		customers.forEach(System.out::println);
		
		
	}
}
