package file.structure;

import java.io.File;
import java.io.IOException;

public class Ex01FileCreator {
	private static String pathname = "data.txt";
	public static void main(String[] args) {
		File file = new File(pathname);
		if(file.exists()) {
			try {
				boolean isCreated = file.createNewFile();
				System.out.println("Create file" + (isCreated ? "success" : "fail"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println(file.getName() +  " is existed");
		}
	}
}
