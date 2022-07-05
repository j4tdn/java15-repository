package view;

import java.util.Scanner;

public class Ex02PasswordCheck {
	public static void main(String[] args) {
		String password = null;
		Scanner ip = new Scanner(System.in);
		do {
			try {
				System.out.print("Fill password: ");
				password = ip.nextLine();
				if(PasswordException(password)) {
					System.out.println(">>> Complete regist password !!!");
				};
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	private static boolean PasswordException(String password) throws Exception {
		if (password.length() < 8 || password.length() > 256) {
			throw new Exception(">>> Length of password must be from 8 to 256 characters");
		}
		if (checkUpcase(password) == false) {
			throw new Exception(">>> Password at least 1 Uppercase Alphabetic !!!");
		}
		if (checkLowcase(password) == false) {
			throw new Exception(">>> Password at least 1 Lowercase Alphabetic !!!");
		}
		if (checkDigit(password) == false) {
			throw new Exception(">>> Password at least 1 number !!!");
		}
		if (checkSpecialCharacters(password) == false) {
			throw new Exception(">>> Password at least 1 special character !!!");
		}
		return true;
	}

	private static boolean checkUpcase(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i)))
				;
			return true;
		}
		return false;
	}

	private static boolean checkLowcase(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i)))
				;
			return true;
		}
		return false;
	}

	private static boolean checkDigit(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isDigit(password.charAt(i)))
				;
			return true;
		}
		return false;
	}

	private static boolean checkSpecialCharacters(String password) {
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLetterOrDigit(password.charAt(i)))
				;
			return true;
		}
		return false;
	}
}
