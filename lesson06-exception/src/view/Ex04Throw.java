package view;

import java.io.File;
import java.io.IOException;

public class Ex04Throw {
	public static void main(String[] args) {
		
	}
	
	// ArithmeticException
	private static int divide(int a, int b) {
		// validate
		if (b == 0) {
			throw new ArithmeticException("b cannot be null");
		}
		
		// a = calculation();
		return a/b;
	}
	
	private static boolean isValidPassword(String text) {
		// password length >= 8
		if (text == null) {
			// stackTrace --> log
			throw new NullPointerException("text cannot be null");
		}
		
		return text.length() >= 8;
	}
	
	private static File createFile(String filename) throws IOException {
		if (filename == null) {
			throw new NullPointerException("Filename cannot be null");
		}
		
		if (filename.isEmpty()) {
			throw new IOException("Filename cannot be empty");
		}
		
		return new File(filename);
	}
	
	
}