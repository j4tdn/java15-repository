package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreatorAsThrow {
	public static void main(String[] args) {
		try {
			boolean isSucess=createFile("hello.txt");
			System.out.println("is sucess:"+ isSucess);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static boolean createFile(String filename) throws IOException {
		File file= new File(filename);
		// khi gọi hàm createNewFile --> phải xử lí lỗi tại compile
		// try catch || throws or throw
		// require to process(try/catch/throw/throws) at calling place
		
		return file.createNewFile();
	}
}
