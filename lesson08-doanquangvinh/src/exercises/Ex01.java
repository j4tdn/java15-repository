package exercises;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = null;
		boolean flag = true;
		while (flag) {
			System.out.print("Nhập vào một chuỗi chỉ chứa các kí tự tiếng Việt , phím space : ");
			text = ip.nextLine();
			if (!text.matches(".*[0-9]+.*")) {
				System.out.println(" " + text);
				// function1(text);
				// function2(text);
				// function3(text);
				function4(text);
				flag = false;
			}
		}
	}

	private static void function1(String text) {
		for (int i = 0; i < text.length(); i++) {
			System.out.print(" " + text.charAt(i));
		}
	}

	private static void function2(String text) {
		String[] arr = text.split("\s+");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" " + arr[i]);
		}
	}

	private static void function3(String text) {
		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.print(text.charAt(i));
		}
	}
    private static void function4(String text) {
    	StringBuilder revert = new StringBuilder(text);
    	revert = revert.reverse();
    	String[] arr = revert.toString().split("\s+");
    	for (int i = arr.length -1; i >= 0; i--) {
			System.out.println(arr[i]);
			
		}
    }
}
