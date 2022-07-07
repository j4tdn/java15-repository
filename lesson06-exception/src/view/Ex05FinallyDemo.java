package view;

import java.io.File;
import java.io.FileWriter;

/*
 * b1: cornnet va open file
 * b2: write file
 * b3: save and close  
 */

public class Ex05FinallyDemo {

	public static void main(String[] args) {
		File file = new File("data.txt");
		if (file.exists()) {
			writeData(file);
		}
		
	}
	public static void writeData(File file) {
		FileWriter fw = new FileWriter(file);
		
	}

}
