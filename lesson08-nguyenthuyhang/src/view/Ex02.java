package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String s;
		s = ip.nextLine();
		System.out.println("Name: " +format(s));
	}
	private static String format(String text) {
		String formattedText = "";
		String[] word = text.split("[\\s]+");
		for(String words:word) {
			String formattedWord = Character.toUpperCase(words.charAt(0)) + words.substring(1).toLowerCase();
			formattedText += formattedWord + " ";
		}
		return formattedText;
	}
	
}
