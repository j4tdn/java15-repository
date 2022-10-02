package file.structure;

import java.io.File;

import utils.FileUtils;

public class Ex01FileCreator {
	private static String pathname =   "storage" 
					+ File.separator + "data" 
					+ File.separator + "content.txt";
	public static void main(String[] args) {
		
		File file = FileUtils.createNewFile(pathname);
		System.out.println("file --> " + file.getName());
		
		
		// filename data.txt
		// filename content\\data.txt
		// filename C:\\content\\data.txt
		
		/*
		File file = new File(pathname);
		if(!file.exists()) {
			try {
				boolean isCreated = file.createNewFile();
				System.out.println("Create file " + (isCreated ? "success" : "fail"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println(file.getName() + " is existed !!!");
		}
		*/
		
	}
}