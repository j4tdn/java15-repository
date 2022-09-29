package file.content;

import java.io.File;
import java.util.List;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex04_FileWriterSerialize {
	private static String pathname = String.join(File.separator, "storage", "data", "content-stream.txt");
	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		List<Customer> customers = DataModel.getCustomer();
		FileUtils.writeFile(file, customers);
		
		System.out.println("finished...");
		
		
		
	}
}
