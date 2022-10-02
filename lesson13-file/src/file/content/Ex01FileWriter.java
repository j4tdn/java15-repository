package file.content;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import bean.Customer;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	private static String pathname = String.join(File.separator, "storage", "data", "content.txt");

	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);

		/*
		 * FileWriter fw = null; BufferedWriter bw = null; //FileWriter, BufferWriter
		 * try { fw = new FileWriter(file); bw = new BufferedWriter(fw); //txt file -->
		 * list of strings bw.write("Line 1 - Data Test"); bw.newLine();
		 * bw.write("Line 2 - Data Test"); bw.newLine(); } catch (IOException e) {
		 * 
		 * e.printStackTrace(); } finally { close(bw, fw); }
		 */
		List<String> lines = DataModel.getCustomers().stream().map(Customer::toLine).collect(Collectors.toList());

		lines.add(0, "Thông tin khách hàng");
		lines.add(1, "====================");

		FileUtils.writeFile(file, lines);

		System.out.println("Finished .....");
	}

	public static void close(AutoCloseable... closeables) {
		for (AutoCloseable closeable : closeables) {
			if (closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
	}
}
