package view;

import java.io.File;

public class Ex04Throw {
	public static void main(String[] args) {
		
	}
	//ArithmeticException
	private static int divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException(" b connot be null");
		}
		return a/b;
	}
	private static boolean isValidPassword(String text) {
		// password lenght > 8
		return text.length() > 8;
	}
//	private static File createFile(String fileName) {
//		
//	}
}
