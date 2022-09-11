package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreatorAsThrow {
	public static void main(String[] args) {
		try {
			boolean isSuccess = createFile("hallo.txt");
			System.out.println("isSucess: "+ isSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean createFile(String FileName) throws IOException {
		File file = new File(FileName);
		
		//bắt buộc khi gọi hàm createNewFile --> phải xử lý tại compile
		//try/catch || throw/throws
		
		return file.createNewFile();
	}
}
