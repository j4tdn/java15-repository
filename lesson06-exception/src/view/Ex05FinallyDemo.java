package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05FinallyDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");

		if (file.exists()) {
			writeData(file);

		}
		System.out.println("Finished......");
	}

	private static void writeData(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Hi ALL\n");
			fw.write("I would like to send the report as content below\n");
			fw.write("Line 1\n");
			fw.write("Line 2\n");
			fw.write("Line 3\n");
			fw.write("Line 4\n");
			fw.write("Line 5\n");
			int value = 222 / 0;
			fw.write("Line k " + value + "\n");
			fw.write("Line ....\n");
			fw.write("Line 1000\n");

			fw.write("Best Regards");

		} catch (IOException | ArithmeticException e) {
			e.printStackTrace();

		} finally {

		}
		System.out.println("Before closing.....");
		try {
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
