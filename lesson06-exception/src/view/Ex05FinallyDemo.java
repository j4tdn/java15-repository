package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * B1 : Create File
 * 
 * @author MSI GL65 B2 : Write File B3 : Save and Close
 */
public class Ex05FinallyDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");

		if (file.exists()) {
			writeData(file);
		}
		System.out.println("Finished ... ");
	}

	private static void writeData(File file) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Dear All \n");
			fw.write("I would like to send the report as content below\n");
			// fw.close();
			fw.write("Line1\n");
			fw.write("Line2\n");
			fw.write("Line3\n");
			fw.write("Line4\n");
			fw.write("Line5\n");
			int value = 222/0;
			fw.write("Line k" + value + "\n");
			fw.write("Line.....\n");
			fw.write("Line1000\n");
			
			fw.write("Best Regards");
		} catch (IOException| ArithmeticException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// save and close file after writing
			// close database connection after querry
			// 
			System.out.println("Before closing ...");
		}
		// fw.close() : blockscope , tranh de ngoai nay vi de xay ra ngoai le
		try {
			fw.close();
		} catch (IOException | ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
