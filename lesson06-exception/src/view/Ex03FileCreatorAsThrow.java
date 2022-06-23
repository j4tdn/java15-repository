package view;

import java.io.File;
import java.io.IOException;

public class Ex03FileCreatorAsThrow {
	public static void main(String[] args) {
		try {
			boolean isSuccess = createFile("hello.txt");
			System.out.println("isSuccess: " + isSuccess);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	private static boolean createFile(String filename) throws IOException {
		File file = new File(filename);
		return file.createNewFile();
	}
}
