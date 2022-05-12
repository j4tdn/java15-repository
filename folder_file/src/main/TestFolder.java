package main;

import java.io.File;
import java.io.IOException;

public class TestFolder {
	public static void main(String[] args) {
		File folder1= new File("D:\\JAVA15\\2.JAVA\\folder_file");
		File folder2= new File("D:\\JAVA15\\2.JAVA\\folder_file1");

		System.out.println("folder có tồn tại: "+folder1.exists());
		System.out.println("folder có tồn tại: "+folder2.exists());
		
		File f1 = new File("D:\\JAVA15\\2.JAVA\\folder_file\\Directory_1");
		f1.mkdir();
		File f2 = new File("D:\\JAVA15\\2.JAVA\\folder_file\\Directory_1\\Directory_2\\Directory_3");
		f2.mkdirs();
		
		File d1 = new File("D:\\\\JAVA15\\\\2.JAVA\\\\folder_file\\\\Directory_1\\meme.txt");
		try {
			d1.createNewFile();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
