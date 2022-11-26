package file.content;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterWithThirdParty {
	private static String pathname = String.join(File.separator, "storage", "data", "context-path.txt");

	public static void main(String[] args) {
		Path path = FileUtils.createNewFileAsPath(pathname);
		
		File file = FileUtils.createNewFile(pathname);

		List<String> lines = DataModel.getCustomer().stream().map(Customer::toLine).collect(Collectors.toList());
		lines.add(0, "Thong tin khach hang");
		lines.add(1, "====================");
		
		try {
			Files.write(path, lines);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished ...");
	}
}
