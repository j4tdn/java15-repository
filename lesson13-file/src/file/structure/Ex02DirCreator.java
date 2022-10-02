package file.structure;

import java.io.File;

import utils.FileUtils;

public class Ex02DirCreator {
	private static String pathname = "storage" + File.separator + "data"
										+ File.separator + "data"
										+ File.separator + "content.txt";
	public static void main(String[] args) {
		FileUtils.createNewFile(pathname);
	}
}
