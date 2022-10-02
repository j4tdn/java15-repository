package file.content;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileWriter {
	
	private static String pathname  = String.join(File.separator, "storage" , "data", "content.txt");
	
	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("Line 1 - Data test"); bw.newLine();
			bw.write("Line 2 - Data test"); bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close(bw,fw);
		}
		
	}
}
