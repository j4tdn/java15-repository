package ex03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidatorRegex {
	private static final String EMAIL_PATTERN = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
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
		if (!Pattern.matches(EMAIL_PATTERN, email)) {
			System.err.println("Invalid email");
			System.out.print("Enter again: ");
			return checkValidEmail();
		}
		return email;
	}
}