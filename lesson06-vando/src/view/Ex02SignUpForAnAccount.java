package view;

import java.util.Scanner;

public class Ex02SignUpForAnAccount {
	public static boolean validPassword(String password) throws Exception {
		if (!((password.length() >= 8) && (password.length() <= 256))) {
			throw new Exception("Password length should be between 8 to 256 characters");
		}
		if (password.contains(" ")) {
			throw new Exception("Password should not contain any space");
		}
		if (true) {
			int count = 0;

			for (int i = 0; i <= 9; i++) {
				String str1 = Integer.toString(i);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new Exception("Password should contain at least one digit(0-9)");
			}
		}
		if (!(password.contains("@") || password.contains("#") || password.contains("!") || password.contains("~")
				|| password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&")
				|| password.contains("*") || password.contains("(") || password.contains(")") || password.contains("-")
				|| password.contains("+") || password.contains("/") || password.contains(":") || password.contains(".")
				|| password.contains(", ") || password.contains("<") || password.contains(">") || password.contains("?")
				|| password.contains("|"))) {
			throw new Exception("Password should contain at least one special character");
		}
		if (true) {
			int count = 0;

			for (int i = 65; i <= 90; i++) {
				char c = (char) i;
				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new Exception("Password should contain at least one uppercase letter(A-Z)");
			}
		}

		if (true) {
			int count = 0;
			for (int i = 90; i <= 122; i++) {
				char c = (char) i;
				String str1 = Character.toString(c);
				if (password.contains(str1)) {
					count = 1;
				}
			}
			if (count == 0) {
				throw new Exception("Password should contain at least one lowercase letter(a-z)");
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do {
			String pass;
			System.out.print("Enter password: ");
			pass = ip.nextLine();

			try {
				System.out.println("Is Password " + pass + " valid?");
				validPassword(pass);
				System.out.println("Valid Password");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);

	}
}