package file.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	private static String pathname = "storage\\data\\content.txt";
	public static void main(String[] args) {
		File file = FileUtils.createNewFile(pathname);
		System.out.println("file -> " + file.getName());
		/*File file = new File(pathname);
		if(!file.exists()) {
			try {
				file.createNewFile();
				boolean isCreated = file.createNewFile();
				System.out.println("Create file " + (isCreated  ? "success" : "f"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println(file.getName() + " is existed !!");
		}
		*/
	}
}
