package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreatorAsThrows {
	public static void main(String[] args) {
           try {
        	   boolean isSuccess = createFile("hello.txt");
			   System.out.println("isSuccess:" + isSuccess);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean createFile(String filename) throws IOException {
		File file = new File(filename);
		
		// Bắt buộc khi gọi hàm createNewFile --> Phải xử lí lỗi tại compile
		// try/catch || throw/throws
		
		// Require to process(try/catch/throw/throws) at calling place
		return file.createNewFile();
	}
	   // public boolean createNewFile() throws IOException
}
