package file.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	private static String pathname = "storage" 
									+ File.separator + "data"
									+ File.separator + "content.txt";
	public static void main(String[] args) {
		FileUtils.createNewFile(pathname);
	}
		//file data.txt
		//file content\\data.txt : Tạo trong đường dẫn ở project hiện tại
		//file C:\\content\\data.txt
		/*
		File file = new File(pathname);
		if(!file.exists()) {
			try {
				Boolean isCreated = file.createNewFile();
				System.out.println("Create file " + (isCreated ? "success" : "fail"));
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file.getName() + " is exstis !!!");
		}
		
	}
	*/

}
