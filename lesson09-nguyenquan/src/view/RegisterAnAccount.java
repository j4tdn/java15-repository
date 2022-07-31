package view;

import java.util.Scanner;

import bean.InvalidException;

public class RegisterAnAccount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		do {
			try {

				System.out.println("Enter the Account:");
				String Account = scanner.nextLine();
				System.out.println("Enter the password:");
				String password = scanner.nextLine();
				if (checkAccount(Account, password)) {
					System.out.println("registration account successfully entered ");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("re_enter!!!");
			}
		} while (true);

	}

	private static boolean checkAccount(String Account, String password) {
		int count = 0;
		for (int i = 0; i < Account.length(); i++) {
			for (int j = 0; j < password.length(); j++) {
				if (Account.charAt(i) == password.charAt(j)) {

					count++;
					continue;
				}
			}
		}

		if (!password.matches("^.{8,256}$")) {
			throw new InvalidException("the password at least 8 characters and most 256 characters");
		} else if (!password.matches("^.*[a-z]+.*$")) {
			throw new InvalidException("the password at least 1 lowercase alphabetic characters");
		} else if (!password.matches("^.*[A-Z]+.*$")) {
			throw new InvalidException("the password at least 1 uppercase alphabetic characters");

		} else if (!password.matches("^.*[0-9]+.*$")) {
			throw new InvalidException("the password at least 1 number");
		} else if (!password.matches("^.*[~!@#$%^&*]+.*$")) {
			throw new InvalidException("the password at least 1 special characters");
		} else if (count > 3) {
			throw new InvalidException("password no more than 3 characters similar to the account ");

		}

		return true;

	}

}
