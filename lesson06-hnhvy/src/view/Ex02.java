package view;

import java.util.Scanner;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String password = "";
		while (true) {
			try {
				password = input();
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("PassWord: " + password);
	}

	private static String input() throws Exception {
		System.out.print("Enter Pass Word: ");
		String password = sc.nextLine();
		if (password.length() < 8 || password.length() > 256) {
			throw new Exception("Password must have at least 8 characters and at most 256 characters");
		}
		if (!password.matches(".*(?=.*[a-z]).*")) {
			throw new Exception("Password must have at least 1 lowercase alphabetic character ");
		}
		if (!password.matches(".*(?=.*[A-Z]).*")) {
			throw new Exception("Password must have at least 1 uppercase alphabetic character");
		}
		if (!password.matches(".*(?=.*[0-9]).*")) {
			throw new Exception("Password must have at least 1 number");
		}
		if (!password.matches(".*[\\p{Punct}}].*")) {
			throw new Exception("Password must have at least 1 special character");
		}
		return password;
	}

}