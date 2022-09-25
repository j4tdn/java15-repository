package file.content;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex01FIleWriter {
	private static String pathname = String.join(File.separator, "storage", "data", "content.txt");
	
	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		
		List<String> lines = DataModel.getCustomers().stream()
				.map(Customer::toLine)
				.collect(Collectors.toList());
		
		lines.add(0, "Thông tin khách hàng");
		lines.add(1, "=====================");
		FileUtils.writeFile(file, lines);
		
		System.out.println("Finished ....");
	}
	
}
