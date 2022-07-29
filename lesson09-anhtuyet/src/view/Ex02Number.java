package view;

import java.util.Scanner;

public class Ex02Number {
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int a = Integer.parseInt(ip.nextLine());
	}

	private static void getLargestNumbers(String s) {
		int n;
		int count = 1, max = 0, firstIndex = 0;
		for (int i = 1; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i)) && Character.isDigit(s.charAt(i - 1))) {
				count++;
			} else
				count = 1;
			if (count >= max) {
				max = count;
			}
		}
	}
}