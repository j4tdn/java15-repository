package Ex04;

import java.util.Scanner;

public class VerifiedPassword {
private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter username:");
		String username=sc.nextLine();
		String password = "";
		while(true) {
			
			try {
				password = input();
				break;
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
	    }
	}   
	
	private static String input() throws Exception {
		System.out.print("Enter password:");
		String password=sc.nextLine();
		if (password.length() < 8) {
			throw new Exception("Password must contain at least 8 character");
		}
		if (!password.matches(".*(?=.*[a-z]).*")) {
			throw new Exception("Password must have at least 1 lowercase alphabetic character ");
		}
		if (!password.matches(".*(?=.*[A-Z]).*")) {
			throw new Exception("Password must have at least 1 uppercase alphabetic character");
		}
		if (!password.matches(".*[\\p{Punct}}].*")) {
			throw new Exception("Password must have at least 1 special character");
		}
		return password;
	}
}
