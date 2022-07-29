package Ex04;

import java.util.Scanner;

public class Ex04RegisterAccount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String username, password;
		
		while(true) {
			try {
				System.out.print("Username: ");
				username = input.nextLine();
				
				System.out.print("Password: ");
				password = input.nextLine();
				
				if(isValidPassword(username,password)) {
					System.out.println("Sign up success!!!");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static boolean isValidPassword (String username, String password) throws Exception{
		if(password.length() < 8) {
			throw new Exception("Password must contain at least 8 character!");
		}
		
		if(!password.matches(".*[A-Z].*")) {
			throw new Exception("Password must contain at least 1 upper alphabetic character!");
		}
		
		if(!password.matches(".*[0-9].*")) {
			throw new Exception("Password must contain at least 1 number!");
		}
		
		if(!password.matches(".*[~!@#$%^&*].*")) {
			throw new Exception("Password must contain at least 1 special character!");
		}
		return true;
	}
}
