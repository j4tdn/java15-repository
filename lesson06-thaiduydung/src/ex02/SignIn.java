package ex02;

import java.util.Scanner;

public class SignIn {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("========= Sign In =========");
		System.out.print("Enter username: ");
		String username = checkUserName();
		System.out.print("Enter password: ");
		String password = checkPassword();
		System.out.println("======================");
		System.out.println("Sign in successfull!");
		System.out.println("User: " + username);
		System.out.println("Password: " + password);
	}
	
	private static String checkUserName() {
		String userName = sc.nextLine().trim();
		if (userName.isBlank()) {
			System.err.println("UserName is empty!");
			System.out.print("Enter again: ");
			return checkUserName();
		}
		if (Character.isDigit(userName.charAt(0))) {
			System.err.println("UserName shouldn't start with a digit!");
			System.out.print("Enter again: ");
			return checkUserName();
		}
		return userName;
	}
	
	private static String checkPassword() {
		String password = sc.nextLine();
		if (password.isBlank()) {
			System.err.println("Password is empty!");
			System.out.print("Enter again: ");
			return checkPassword();
		}
		if (password.length() < 8 || password.length() > 256) {
			System.err.println("Password length must least 8 character and most 256 character!");
			System.out.print("Enter again: ");
			return checkPassword();
		}
		if (!checkPass(password, c -> Character.isLowerCase(c))) {
			System.err.println("Password must contain least 1 lowercase character!");
			System.out.print("Enter again: ");
			return checkPassword();
		}
		if (!checkPass(password, c -> Character.isUpperCase(c))) {
			System.err.println("Password must contain least 1 uppercase character!");
			System.out.print("Enter again: ");
			return checkPassword();
		}
		if (!checkPass(password, c -> Character.isDigit(c))) {
			System.err.println("Password must contain least 1 number!");
			System.out.print("Enter again: ");
			return checkPassword();
		}
		if (!checkSpecialCharacter(password)) {
			System.err.println("Password must contain least 1 special character!");
			System.out.print("Enter again: ");
			return checkPassword();
		}
		
		return password;
	}
	
	private static boolean checkPass(String password, Condition con) {
		int count = 0;
		for (int i = 0; i < password.length(); i++) {
			if (con.checkPass(password.charAt(i))) {
				count++;
			}
		}
		return count > 0;
	}
	
	private static boolean checkSpecialCharacter(String password) {
		char[] specChar = {'~', '!', '@', '#', '$', '%', '^', '&', '*',
							'(', ')','-', '_', '=', '+', '[', ']', '|', 
							';', ':', ',', '.', '<', '>', '?', '/'};
		for (int i = 0; i < password.length(); i++) {
			for (int j = 0; j < specChar.length; j++) {
				if (j != i && specChar[j] == password.charAt(i)) {
					return true;
				}
			}
		}
		return false;
	}
}