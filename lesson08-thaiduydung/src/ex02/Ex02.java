package ex02;

import java.util.Scanner;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter full name: ");
		String input = checkInput();
		System.out.println("Standard name format: " + format(input));
	}
	
	private static String checkInput() {
		String input = sc.nextLine().trim();
		if (!input.matches("[a-zA-Z\\s]+")) {
			System.out.print("Input includes only letters! Enter again: ");
			return checkInput();
		}
		return input;
	}
	
	private static String format(String s) {
		s = s.toLowerCase();
		String[] toWord = s.split("\\s+");
		String result = "";
		for (String word : toWord) {
			word = word.replaceFirst(word.charAt(0) + "", (word.charAt(0) + "").toUpperCase());
			result += word + " ";
		}
		return result.trim();
	}
}