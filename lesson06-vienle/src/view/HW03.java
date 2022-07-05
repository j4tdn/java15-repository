package view;

import java.util.Scanner;

public class HW03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String isContinue = "i";
		String email;
		do {
			System.out.print("Input your email: ");
			email = sc.nextLine();
			System.out.println(email + " is " + (validateEmail(email) ? "valid" : "invalid"));
			
		} while("i".equalsIgnoreCase(isContinue));
	}
	
	private static boolean validateEmail(String email) {
		String regex = "[@][0-9][a-z][A-Z]";
		return email.matches(regex);
	}
}



