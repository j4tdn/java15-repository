package ex03;

import java.util.Scanner;

public class EmailException {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("-------Check valid email!-------");
		System.out.print("Enter email: ");
		String email = checkValidEmail();
		System.out.println("Valid email!");
		System.out.println("Email: " + email);
	}

	private static String checkValidEmail() {
		String email = sc.nextLine().trim();
		if (email.isBlank()) {
			System.err.println("Email is empty!");
			System.out.print("Enter again: ");
			return checkValidEmail();
		}
		if (!email.contains("@")) {
			System.err.println("Email must contains @!");
			System.out.print("Enter again: ");
			return checkValidEmail();
		}
		if (email.startsWith("@") || email.endsWith("@")) {
			System.err.println("Email shouldn't start or end with @");
			System.out.print("Enter again: ");
			return checkValidEmail();
		}
		if (Character.isDigit(email.charAt(0))) {
			System.err.println("Email shouldn't start with a digit!");
			System.out.print("Enter again: ");
			return checkValidEmail();
		}
		if (!email.contains(".")) {
			System.err.println("Email must contains \".\"");
			System.out.print("Enter again: ");
			return checkValidEmail();
		}
		int count = 0;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				count++;
			}
		}
		if (count > 1) {
			System.err.println("Email must contains only one @!");
			System.out.print("Enter again: ");
			return checkValidEmail();
		}
		if (email.charAt(email.indexOf("@") - 1) == '.' || email.charAt(email.indexOf("@") + 1) == '.') {
			System.err.println("Email shouldn't contain \".\" at before or after @");
			System.out.print("Enter again: ");
			return checkValidEmail();
		}
		return email;
	}
}