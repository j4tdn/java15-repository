package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * b1: kết nối file
 * b2 : viet
 * b3:lưu và đóng
 *
 */
public class Ex05_FinallyDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");
		if(file.exists()) {
			writeData(file);
		}
		System.out.println("Finished...");
	}
	private static void writeData(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Deal ALl\n");
			fw.write("I miss u\n");
			
			fw.write("Line1\n");
			fw.write("Line2\n");
			fw.write("Line3\n");
			fw.write("Line4\n");
			fw.write("Line5\n");
			int value = 220/0;

			fw.write("Line k" + value + "\n");
			fw.write("Line....\n");
			fw.write("Line 1000\n");
			
		} catch (IOException | ArithmeticException e) {
			//e.printStackTrace();
		} finally {
			System.out.println("Before closing...");
		}
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
