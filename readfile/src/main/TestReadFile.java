package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class TestReadFile {
	public static void main(String[] args) {
//		File f = new File("D:\\JAVA15\\2.JAVA\\write\\task.txt");
//		try {
//			BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//			String line = null;
//			while (true) {
//			line =br.readLine();
//			if (line == null) {
//				break;
//			}else {
//				System.out.println(line);
//			}
//			}
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
		
		File f = new File("D:\\JAVA15\\2.JAVA\\write\\task.txt");
		try {
			List<String> alltext = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
			for (String line : alltext) {
				System.out.println(line);
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
