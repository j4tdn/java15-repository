package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HW02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Enter password:");
			String password = sc.nextLine();
			
			try {
				if (isValid(password))
					System.out.println("Succesfull");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	public static boolean isValid(String password) throws Exception {
		if (password.length() < 8) {
			throw new Exception("Password must contain at least 8 character");
		}
		if (password.length() > 256) {
			throw new Exception("Password can only contain at most 256 character");
		}
		if (!Pattern.matches(".*[a-z].*", password)) {
			throw new Exception("Password must contain at least 1 lowercase character");
		}
		if (!Pattern.matches(".*[A-Z].*", password)) {
			throw new Exception("Password must contain at least 1 uppercase alphabetic character");
		}
		if (!Pattern.matches(".*[0-9].*", password)) {
			throw new Exception("Password must contain at least 1 number");
		}
		if ((!Pattern.matches(".*[^a-zA-Z0-9].*", password))) {
			throw new Exception("Password must contain at least 1 special character.");
		}
		if((Pattern.matches("Vien", password))) {
			throw new Exception("Password cannot contain your name");
		}

		return true;
	}
}
