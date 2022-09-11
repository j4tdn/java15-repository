package logic;

import java.util.Scanner;

public class Ex02CheckPass {
	private static String pass = "";
	private static String emailAddress = "vantan";
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		
		do {
			System.out.println("Enter password ");
			pass = ip.nextLine();
			if (pass.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,256}$") && !pass.equals(emailAddress)
					&& pass.length() >= 8 && pass.length() <= 256) {
				break;
			} else {
				System.out.println("password be not okie");
			}

		} while (true);
		System.out.println(pass);
		
	}
	

}
