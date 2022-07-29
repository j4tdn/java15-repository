package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Step 1: connect and open file
 * Step 2: Write file
 * Step 3: Save and close
 */
public class Ex05FinallyDemo {
	public static void main(String[] args) {
		File file = new File("data.txt");
		
		if(file.exists()) {
			writeData(file);
		}
		
	}
	
	private static void writeData(File file)  {
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write("Dear ALL\n");
			fw.write("I would like to take today off\n");
			
			fw.write("Line 1\n");
			fw.write("Line 2\n");
			fw.write("Line 3\n");
			fw.write("Line 4\n");
			fw.write("Line 5\n");
			int value = 222/0;  //ArithmeticException hàm sẽ dừng tại đây vì try catch chỉ bắt lỗi compile chứ không bắt lỗi runtime
			fw.write("Line k"+ value +"\n");
			fw.write("Line ...\n");
			fw.write("Line 1000\n");
			
			fw.write("Best Regards");
			
		} catch (IOException | ArithmeticException e) {
			e.printStackTrace();
		} finally {
			//save and close file after writing
			//close database connection after query
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
