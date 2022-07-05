package view;

import java.util.Scanner;

import exception.LackofAtLeastOneLowerCase;
import exception.LackofAtLeastOneNumber;
import exception.LackofAtLeastOneUpperCase;
import exception.LackofCharacters;
import exception.LackofSpecialCharacter;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String password = null;
		boolean flag = true;
		do {

			try {
				System.out.print("Enter Suitable Password :");
				password = ip.nextLine();
				if (isValidPassword(password) == false) {
					System.out.println("Sign In Successfully");
					flag = false;
				} 
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		} while (flag);
	}

	private static boolean isValidPassword(String password) throws LackofCharacters, LackofAtLeastOneLowerCase,
			LackofAtLeastOneUpperCase, LackofAtLeastOneNumber, LackofSpecialCharacter {
		if (password.isBlank()) {
			throw new NullPointerException("Password can not be blank");
		}
		if (!password.matches("^.{8,256}$")) {

			throw new LackofCharacters(password);
		}
		if (!password.matches("^.*[a-z]+.*$")) {

			throw new LackofAtLeastOneLowerCase(password);
		}
		if (!password.matches("^.*[A-Z]+.*$")) {

			throw new LackofAtLeastOneUpperCase(password);
		}
		if (!password.matches("^.*[0-9]+.*$")) {
			throw new LackofAtLeastOneNumber(password);
		}
		if (!password.matches("^.*[~!@#$%^&*()_++;:,.<>/?]+.*$")) {
			throw new LackofSpecialCharacter(password);
		}
		return false;
	}
}
