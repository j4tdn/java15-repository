package file.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	private static String pathname = "storage\\data.txt";
	public static void main(String[] args) {
		FileUtils.createNewFile(pathname);
		//file.txt
		/*
		File file = new File(pathname);
		if(!file.exists()){
			try {
				boolean isCreated = file.createNewFile();
				System.out.println("Create file" + (isCreated ? " success" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println(file.getName() + " is existed !!!");
		}
		*/
	}
}
