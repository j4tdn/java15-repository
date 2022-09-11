package logic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02Pass {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email = "Vantan123@";
		
		do {

			System.out.println("Enter password");
			String password = ip.nextLine();
			Pattern letter = Pattern.compile("[a-zA-z]");
			Pattern digit = Pattern.compile("[0-9]");
			Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
			// Pattern eight = Pattern.compile (".{8}");

			Matcher hasLetter = letter.matcher(password);
			Matcher hasDigit = digit.matcher(password);
			Matcher hasSpecial = special.matcher(password);
			if (hasLetter.find() && hasDigit.find() && hasSpecial.find() && password.length() >= 8
					&& password.length() <= 256 && !password.equals(email)) {
				System.out.println(password);
				System.out.println("password is okie");
				break;
			} else {
				System.out.println("password is not okie");

			}

		} while (true);
	}

}
