package view;

import java.util.Scanner;

public class Ex01PrintString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = scanner.nextLine();
		char[] characters = plitCharracter(string);
		for (char character : characters) {
			System.out.print(character + " ");
		}
		System.out.println();
		
		System.out.println("========================");
		
		String[] words = plitWord(string);
		for (String word : words) {
			System.out.println(word);
		}
		
		System.out.println("========================");
		
		String results = reverseCharacter(string);
		System.out.println(results);
		
		System.out.println("========================");
		 results = reverseWord(string);
		 System.out.println(results);

	}

	private static char[] plitCharracter(String string) {
		string = string.replaceAll("\\s+", "");

		char[] c = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {
			c[i] = string.charAt(i);
		}
		return c;

	}

	private static String[] plitWord(String string) {
		String[] word = string.split("\\s+");
		return word;
	}
	
	private static String reverseCharacter(String string) {
		String result;
		StringBuilder sb = new StringBuilder(string);
	      result = sb.reverse() +" ";
		return result;
	}
	
	private static String reverseWord(String string) {
		String formatText = "";
		String []words = string.split("\\s+");
		for(String word: words) {
			StringBuilder sb = new StringBuilder(word);
			sb = sb.reverse();
			formatText += sb + " ";
		}
		return formatText;
			
		
	}
}
