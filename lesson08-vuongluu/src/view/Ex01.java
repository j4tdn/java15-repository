package view;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String line = scanner.nextLine();
		String formatted = line.trim().replaceAll("\\s+", "");
		for (int i = 0; i < formatted.length(); i++) {
			System.out.println(formatted.charAt(i));
		}
		System.out.println("===========================");
		String[] tmps = line.split("\\s+");
		for (String tmp : tmps) {

			System.out.println(tmp);
		}
		System.out.println("===========================");
		for (int i = line.length() - 1; i >= 0; i--) {
			System.out.println(line.charAt(i));
		}
		System.out.println();

		System.out.println("===========================");
		StringBuffer stringBuffer = new StringBuffer(line);
		System.out.println(stringBuffer.reverse().toString());
	}
}
