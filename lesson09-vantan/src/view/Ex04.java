package view;

import java.util.Scanner;

public class Ex04 {
	private static String id = "vantan999";

	public static void main(String[] args) {
		do {
			System.out.println("Enter pass");
			String pass = new Scanner(System.in).nextLine();
			if (checkPass(pass)) {
				System.out.println("Sign Up Success");
				break;
			}else {
				System.out.println("please try again");
			}
		} while (true);
	}

	private static boolean checkPass(String pass) {

		if (pass.matches("^.*(?=..*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$") && pass.length() >= 8 && check(id, pass)) {

			return true;
		}
		return false;
	}

	private static boolean check(String id, String pass) {

		int count = 0;
		for (int i = 0; i < pass.length(); i++) {
			if (id.contains(pass.charAt(i) + "")) {
				count++;
				if (count == 3) {
					return false;
				}
			}
		}
		return true;
	}
}
