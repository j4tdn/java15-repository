package view;

import java.io.File;
import java.io.IOException;

public class Ex04Throw {
	public static void main(String[] args) {
		divide(7, 0);
    
	}

	// ArithmeticException
	private static int divide(int a, int b) {
		if (b == 0) {
			throw new ArithmeticException("b cannot be null");
		}

		// s= calculation();
		return a / b;

	}

	private static boolean isValidPassword(String text) {
		if (text == null) {
			throw new NullPointerException("text cannot be null");
		}
		return text.length() >= 8;

	}
	 private static File createFile(String filename) throws IOException {
		 if(filename== null) {
			 throw new NullPointerException("Filename cannot be null");
			
		 }
		 if(filename.isEmpty()) {
			 throw new IOException("Filename cannot be empty");		 } 
		 return new File(filename);
		 
		 
		 
	 }

}
