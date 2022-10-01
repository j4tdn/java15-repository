package file.content;

import java.io.File;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	
	private static String pathname = String.join(File.separator, 
			"storage", "data", "content.txt");
	
	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		
		FileUtils.writeFile(file, DataModel.getCustomers(), Customer::toLine);
		
		System.out.println("Finished ....");
	}
	
}