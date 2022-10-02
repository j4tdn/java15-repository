package file.content;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterWithFilesNio {
	private static String pathname = String.join(File.separator, "storage", "data", "content.path.txt");

	public static void main(String[] args) {
		Path path = FileUtils.createNeWFileAsPath(pathname);
		List<String> lines = DataModel.getCustomers()
				.stream()
				.sorted(Comparator.comparing(Customer::getId))
				.map(Customer::toLine).collect(Collectors.toList());
		lines.add(0, "Thong tin khach hang");
		lines.add(1, "====================");
		
		try {
			Files.write(path, lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Finished ...");
	}
}
