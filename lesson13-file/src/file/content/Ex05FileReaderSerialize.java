package file.content;

import java.io.File;
import java.util.List;

import bean.Customer;
import utils.FileUtils;

public class Ex05FileReaderSerialize {
	private static String pathname = String.join(File.separator, "storage", "data", "content-stream.txt");

	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		
		List<Customer> customers = FileUtils.readObject(file);
		customers.forEach(System.out::println);
	}
}
