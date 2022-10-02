package ex05.view;

import java.io.File;
import java.util.List;

import ex05.utils.Ex05Utils;

public class Ex05 {
	private static String pathname = String.join(File.separator, "ex05", "student.txt");

	public static void main(String[] args) {
		List<String> lines = Ex05Utils.readFile(pathname);
		
	}
}
