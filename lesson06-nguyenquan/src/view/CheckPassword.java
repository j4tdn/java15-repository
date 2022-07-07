package view;

import java.util.Scanner;

import exception.InvalidException;

public class CheckPassword {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the password: ");
		String string = scanner.nextLine();

		do {
			try {
				if (check(string)) {
					System.out.println("you have successfully entered");
					break;
				}

				System.out.print("Enter the password: ");
				string = scanner.nextLine();

			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("the re-enter!!!");
				System.out.print("Enter the password: ");
				string = scanner.nextLine();

			}

		} while (true);
	}

	public static boolean check(String string) throws InvalidException {

		if (!string.matches("^.{8,256}$")) {
			throw new InvalidException("the password at least 8 characters and most 256 characters");
		} else if (!string.matches("^.*[a-z]+.*$")) {
			throw new InvalidException("the password at least 1 lowercase alphabetic characters");
		} else if (!string.matches("^.*[A-Z]+.*$")) {
			throw new InvalidException("the password at least 1 uppercase alphabetic characters");

		} else if (!string.matches("^.*[0-9]+.*$")) {
			throw new InvalidException("the password at least 1 number");
		} else if (!string.matches("^.*[~!@#$%^&*()]+.*$")) {
			throw new InvalidException("the password at least 1 special characters");
		}
		return true;

	}
}
