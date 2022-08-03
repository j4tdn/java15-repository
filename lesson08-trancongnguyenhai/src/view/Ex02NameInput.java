package view;

import java.util.Scanner;

public class Ex02NameInput {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Fill your name: ");
		String name = ip.nextLine();
		System.out.print("Your name: " + formattedName(name));
	}

	private static String formattedName(String name) {
		String format = "";
		for (char c : name.replaceAll("\\s+", "").toCharArray()) {
			if (!Character.isAlphabetic(c)) {
				throw new IllegalArgumentException("Name must only contain alphabet character!!");
			}
		}
		String[] words = name.split("\\s+");
		for (String word : words) {
			String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			format += formattedWord + " ";
		}
		return format;
	}
}
