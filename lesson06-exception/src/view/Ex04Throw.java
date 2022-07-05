package view;

import java.io.File;
import java.io.IOException;

public class Ex04Throw {
	public static void main(String[] args) {
		
	}
	
	// ArithmeticException
	private static int divide(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException("b can't be null");
		}
		
		// a = calculator(); tính toán a xong chia b thì rất lâu -> tiền xử lý trước
		// (giảm thiểu tính toán không cần thiết)
		return a/b;
	}
	
	private static boolean isValidPassword(String text) {
		// password length > 8
		if(text == null) {
			throw new NullPointerException("text can't be null");
		}
		return text.length() >= 8;
	}
	
	private static File creatFile(String fileName) throws IOException{
		if(fileName == null) {
			throw new NullPointerException("Filename can't be null");
		}
		
		if(fileName.isEmpty()) {
			throw new IOException("Filename can't be empty");
		}
		return new File(fileName);
	}
}
