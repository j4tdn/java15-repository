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
	private static String pathname = String.join(File.separator, "storage", "data", "content.txt");
	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		
		// FileWriter, BufferWriter
//		FileWriter fw = null;
//		BufferedWriter bw = null;
//		try {
//			fw = new FileWriter(file);
////		fw = new FileWriter(file, true);
//			// true là để append vào file cũ, k bị tạo mới
//			bw = new BufferedWriter(fw);
//			
//			// txt file -> List of String
//			
//			bw.write("Line 3 - Data Test"); bw.newLine();
//			bw.write("Line 4 - Data Test"); bw.newLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			close(bw,fw);
//		}
		// Customer: id,
//		lines.add(0, "Thông tin khách hàng");
//		lines.add(1, "====================");
		
//		FileUtils.writeFile(file, DataModel.getCustomers());
		FileUtils.writeFile(file, DataModel.getCustomers(), Customer::toLine);
		System.out.println("Finished ...");
	}
	
}
