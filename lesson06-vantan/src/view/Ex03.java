package view;

import java.util.Scanner;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		checkEmail();
	}
	private static void checkEmail() {
		
		
		do {
			System.out.println("Enter the your Email : ");
			String email = sc.nextLine();
			if(email.matches("^[a-z][a-z0-9\\._]+@[a-z]+(\\.[a-z]+)+$")) {
				System.out.println("email address is okie");
				break;
			}
			System.out.println("invalid email");
		} while (true);
		
	}
}
