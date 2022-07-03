package view;

import java.io.File;
import java.io.IOException;

public class Ex04Throw {
	public static void main(String[] args) {
          
	}
	// ArithmeticException
	private static int divide(int a , int b) {
		// validate
		if (b == 0) {
			throw new ArithmeticException("b can not be null");
		}
		// a = calculation();
		return a/b;
	}
	
	private static boolean isValidPassword(String text) {
		// password length >= 8
		if (text == null) {
			throw new NullPointerException("text can not be null");
		}
		return text.length() >=8;
	}
	private static File creaFile(String fileName) throws IOException {
		if (fileName == null) {
			throw new NullPointerException("File name can not be null");
		}
		if (fileName.isEmpty()) {
			throw new IOException("File name can not be empty");
		}
		return new File(fileName);
	}
}
