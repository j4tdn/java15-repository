package file.content;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	private static String pathname = String.join(File.separator, "storage", "data", "contentxx.txt");

	public static void main(String[] args) {
		/*
		 * File file = FileUtils.createNewFile(pathname);
		 * 
		 * List<String> lines = DataModel.getCustomers().stream() .map(Customer::toLine)
		 * .collect(Collectors.toList());
		 * 
		 * lines.add(0, "Thông tin khách hàng"); lines.add(1, "============");
		 * FileUtils.writeFiles(file, lines);
		 */

		// Case 1: Create interface ||using writeFileCase1(File file, List<T> list)
		/*
		 * File file = FileUtils.createNewFile(pathname);
		 * 
		 * FileUtils.writeFileCase1(file, DataModel.getCustomers());
		 * 
		 * System.out.println("Finish.");
		 */

		// Case 2 Function<T,R>
		File file = FileUtils.createNewFile(pathname);

		FileUtils.writeFileCase2(file, DataModel.getCustomers(),e->e.toLine() );

		System.out.println("Finish.");

	}

}
