package file.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterWithFileNio {
	private static String pathname= String.join(File.separator, "storage","data","content-path.txt");
	
	public static void main(String[] args) {
		//Path path = FileUtils.createFileAsPath(pathname);
		
		
		File file =FileUtils.createNewFile(pathname);
		List<Customer> customers= DataModel.getCustomers();
		
		FileUtils.writeFileCase1(file, DataModel.getCustomers());
		
		
		
		System.out.println("Finish");
	
	}
	
}
