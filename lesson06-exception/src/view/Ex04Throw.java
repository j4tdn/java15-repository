package view;

import java.io.File;
import java.io.IOException;

public class Ex04Throw {
	public static void main(String[] args) {
		//devide(5, 0);
	}
	
	//Arithmetic Exception
	private static int devide(int a, int b)  {
		//validate
		if(b==0) {
			throw new ArithmeticException("b can not be null");
		}
		
		// a= calculation();
		return a/b;
	}
	private static boolean isValidStringPassword(String text) {
		//password length>=8
		if(text==null) {
			//stackTrace -->log
			throw new NullPointerException("text can not be null");
		}
		return text.length()>=8;
	}
	private static File createFile(String filename) throws IOException {
		if(filename==null) {
			throw new NullPointerException("fileName can not null");
		}
		if(filename.isEmpty()) {
			throw new IOException("FileName can not be empty");
		}
		return new File(filename);
	}
	
}
