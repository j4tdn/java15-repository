package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String line = scanner.nextLine();
		System.out.println(toUpperFirst(line));
	}

	private static String toUpperFirst(String s) {
		String result = " ";
		s = s.toLowerCase();
		String[] arr = s.split(" ");
		for (String arrs : arr) {
			if (!arrs.equals("") && !arrs.equals(null)) {
				result += String.valueOf(arrs.charAt(0)).toUpperCase() + arrs.substring(1) + " ";
			}
		}
		if (!result.equals("") && result.equals(null)) {
			result = result.substring(0, result.length() - 1);
		}
		return result;
	}
}