package view;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter your name: ");
		String ipName=input.nextLine();
		System.out.println(format(ipName));
	}
	private static String format(String text) {
		String formattedText="";
		String[] words=text.split("[\\s,-]{1,}");
		for(String word:words) {
			
		String formattedWord=	Character.toUpperCase(word.charAt(0))+ word.substring(1).toLowerCase();
		formattedText+=formattedWord+" ";
		}
		return formattedText;
	}
}
