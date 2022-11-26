package file.content;

import java.io.File;
import java.util.List;

import bean.Customer;
import utils.FileUtils;

public class Ex05FileReaderSerialize {
	private static String pathname = String.join(File.separator, "storage" , "data", "context.txt");
	public static void main(String[] args) {
		File files = FileUtils.createNewFile(pathname);
		List<Customer> customers = FileUtils.readObject(files);
		customers.forEach(System.out::println);
	}
}
