package ex01;

import java.util.Scanner;

public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter string: ");
		String input = sc.nextLine().trim();
		do {
			System.out.println("---------------------------");
			System.out.println("1/ Print each character of the string");
			System.out.println("2/ Print each word of the string");
			System.out.println("3/ Print reverse each character of the string");
			System.out.println("4/ Print reverse each word of the string");
			System.out.println("5/ Exit");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:
				for (char c: toChar(input)) {
					System.out.println(c);
				}
				break;
			case 2:
				for (String s: toWord(input)) {
					System.out.println(s);
				}
				break;
			case 3:
				for (char c: reverseChar(input)) {
					System.out.println(c);
				}
				break;
			case 4:
				for (String s: reverseWord(input)) {
					System.out.println(s);
				}
				break;
			case 5: 
				System.exit(0);
			default:
				break;
			}
		} while (true);
	}
	
	private static char[] toChar(String s) {
		s = s.replaceAll("\\s+", "");
		return s.toCharArray();
 	}
	
	private static String[] toWord(String s) {
		return s.split("\\s+");
	}
	
	private static char[] reverseChar(String s) {
		char[] toChar = toChar(s);
		char[] reverse = new char[toChar.length];
		int count = 0;
		for (int i = toChar.length - 1; i >= 0; i--) {
			reverse[count++] = toChar[i];
		}
		return reverse;
	}
	
	private static String[] reverseWord(String s) {
		String[] toWord = toWord(s);
		String[] reverse = new String[toWord.length];
		int count = 0;
		for (int i = toWord.length - 1; i >= 0; i--) {
			reverse[count++] = toWord[i];
		}
		return reverse;
	}
}