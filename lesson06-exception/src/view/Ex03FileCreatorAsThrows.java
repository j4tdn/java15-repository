package view;
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
		File file =  new File(filename);
		
		
		//bắt buộc khi gọi hàm createNewFile ---> phải xử lí lỗi tại compile
		//try/catch || throw/throws
		
		
		// require to process(try/catch/throw/throws) at calling place
	return file.createNewFile();
	}
}	
