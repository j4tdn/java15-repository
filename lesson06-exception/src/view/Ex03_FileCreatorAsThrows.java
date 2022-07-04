package view;

import java.io.File;
import java.io.IOException;

public class Ex03_FileCreatorAsThrows {
	public static void main(String[] args) {
		try {
			boolean isSuccess  = createFile("helloo.txt");
			System.out.println("isSuccess: " + isSuccess);
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
	private static boolean createFile(String filename) throws IOException {
		File file = new File(filename);
		//bắt buộc khi gọi hàm createNewFile --> phải xử lý lỗi tại compile
		// try/catch || throw/throws
		return file.createNewFile();
	}
}
