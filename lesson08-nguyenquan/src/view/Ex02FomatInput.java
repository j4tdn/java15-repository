package view;

import java.util.Scanner;

import bean.InvalidException;

public class Ex02FomatInput {
	public static void main(String[] args) {
		String result= "";
		do {
		try { 
			Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name: " );
		String name = scanner.nextLine();
		result= formatName(name);
		break;
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}while(true);
		System.out.println(result);
	}
	private static String formatName(String string) {
		String formatName = "";
		if(!string.matches("[A-Za-z\\s]+")) {
        throw new InvalidException("input characters are [[a-z,A-z]]");
		}
		String[] words = string.split("\\s+");
		for(String word : words) {
			
			formatName += Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase() +" ";	
		}
		return formatName;
		
	}

}
