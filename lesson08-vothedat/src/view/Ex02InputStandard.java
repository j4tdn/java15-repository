package view;

import java.util.Scanner;

public class Ex02InputStandard {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s = ip.nextLine();
		String formattedText = "";
		String words[] = s.split("[\\s]+");
		for (String word : words) {
			String formattedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
        System.out.println(formattedText);
	}
}
