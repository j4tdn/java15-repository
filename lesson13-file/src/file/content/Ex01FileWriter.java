package file.content;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	private static String pathname = String.join(File.separator, "storage" , "data", "context.txt");
	
	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		
		
		FileUtils.writeFile(file, DataModel.getCustomer(), Customer::toLine);
		
		System.out.println("Finished ...." );
		
		
	}
	
}
