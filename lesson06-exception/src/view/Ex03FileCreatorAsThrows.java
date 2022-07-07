package view;
/*
 * Trong Java có 2 loại exception: checked và unchecked. 
 * Tất cả các checked exception được kế thừa từ lớp Exception ngoại trừ lớp RuntimeException. 
 * RuntimeException là lớp cơ sở của tất cả các lớp unchecked exception. 
 * Đó cũng là dấu hiệu để nhận biết đâu là checked exception và đâu là unchecked exception.
 * Đối với checked exception, việc kiểm tra được thực hiện ngay thời điểm compile time
 * Còn đối với unchecked exception, việc xác định có exception xảy ra hay không chỉ có thể thực hiện ở thời điểm runtime
 */
import java.io.File;
import java.io.IOException;

public class Ex03FileCreatorAsThrows {

	public static void main(String[] args) {
		try {
			boolean isSuccess = createFile("hello.txt");
			System.out.println("isSucess: " + isSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static boolean createFile(String filename) throws IOException {
		File file = new File(filename);
		
		// Bắt buộc khi gọi hàm createFile --> phải xử lí lỗi tại compile
		// try/catch || throw/throws
		// không bắt buộc throws RuntimeException, vì nó không bắt buộc xử lí tai lúc compile
		
		return file.createNewFile();
	}
	
}
