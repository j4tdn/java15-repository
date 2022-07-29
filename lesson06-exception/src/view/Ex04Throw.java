package view;

import java.io.File;
import java.io.IOException;

public class Ex04Throw {
	public static void main(String[] args) {
		System.out.println(isValidString(null));

		
	}
	
	//ArithmeticException
	private static int divide(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("b cannot be null");
		}
		return a/b;
	}
	
	private static boolean isValidString(String text) {
		// password length > 8 
		if(text == null) {
			//stackTrace
			throw new NullPointerException("text must not null");
		}
		return text.length() >=8;
	}
	
	private static File createFile(String filename) throws IOException {
		if(filename == null) {
			throw new NullPointerException("File name cannot null");
		}
		
		/*when you throw compile exception, you must add throws on declaration section to 
		solve exception before implement function*/
		if(filename.isEmpty()) {
			throw new IOException("Filenamr cannot be empty");
		}
		return new File(filename);
	}
}
