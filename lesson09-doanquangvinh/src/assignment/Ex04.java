package assignment;

import java.util.Iterator;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String account = null;
		String password = null;
		boolean flag = true;
		do {
			System.out.print("Please Enter Your Account :");
			account = ip.nextLine();
			System.out.print("Next - Enter Your Password :");
			password = ip.nextLine();
			if (Validator(password, account)) {
				System.out.println("Sign In successfully");
				flag = false;
			}
		} while (flag);
	}

	private static boolean Validator(String password, String account) {
		int count = 0;
		if (!password.matches(".{8,256}")) {
			System.out.println("require at least more than 8 characters in password");
			return false;
		}
		if (!password.matches(".*[~!@#$%^&*]+.*")) {
			System.out.println("require at least more than one special letter in password");
			return false;
		}
		if (!password.matches(".*[A-Z]+.*")) {
			System.out.println("require at least more than one Uppercase in password");
			return false;
		}
		if (!password.matches(".*[0-9]+.*")) {
			System.out.println("require at least more than one number in password");
			return false;
		}
		for (int i = 0; i < account.length(); i++) {
			for (int j = 0; j < password.length(); j++) {
				if (password.charAt(j) == account.charAt(i)) {
					count++;
					if (count == 3) {
						System.out.println("Exceed amount of duplicate characters");
						return false;
					}
				}
			}

		}

		return true;
	}
}
