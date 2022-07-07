package view;

import java.io.File;
import java.io.IOException;

public class Ex04Throw {
	public static void main(String[] args) {
		
	}
	
	//ArithmeticException.  Nếu chúng ta chia bất kỳ số nào cho số 0, xảy ra ngoại lệ ArithmeticException. 
	// return a/b có the xay ra ngoai le khi b = 0
	public static int divide ( int a, int b) {
		// a = calculation (tinh toan) tính tốn thời gian tính xong b=0 nữa thì bú
		//Tiền xử lí , xử lí trước 	
		//Vadidate
		if (b == 0 ) {
			throw new ArithmeticException("B khong the bang 0");//Runtime Exception
		}
		return a/b;
	}
	
	private static boolean isValidString(String text) {
		//password lenght >=8
		if (text == null ) {
			// Nếu dùng systemout nó chỉ in ra trên console chứ không hiện trên giao diện người dùng
			// Hiển thị cho người dùng thấy lỗi thông qua strackTrace -->lưu trên log
			throw new NullPointerException("text rong");
		}
		return text.length() >= 8;
	}
	
	private static File createFile(String filename) throws IOException {
		if (filename == null) {
		throw new NullPointerException("File rong");//runtime exception
		}
		if (filename.isEmpty()) {
			throw new IOException("Filename cannot be empty");//compile exception
		}
		return new File(filename);
	}	
	
}
