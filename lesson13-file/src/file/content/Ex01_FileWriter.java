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

public class Ex01_FileWriter {
	private static String pathname = String.join(File.separator, "storage", "data", "content.txt");
	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		
		
		//lines.add(0, "Thong tin khach hang");
	//	lines.add(1, "=====================");
		FileUtils.writeFile(file, DataModel.getCustomer(), Customer::toLine);
	}
	
	public static void close(AutoCloseable ...closeables) {
		for(AutoCloseable closeable : closeables) {
			if(closeable != null) {
				try {
					closeable.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
