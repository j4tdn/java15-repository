package view;

import java.util.Scanner;

public class Ex04 {
	private static boolean validPassword(String username,String password) throws Exception {
		char[] name = username.toCharArray(); 
		char[] pass = password.toCharArray();
		int count1 = 0;
		for(int i = 0; i < name.length; i++) {
			for(int j = 0;j < pass.length; j++) {
				if(pass[j] == name[i]) {
					count1++;
				}
			}
		}
		if(count1 >= 3) {
			throw new Exception("Can't match more than 3 characters with the account name");
		}
		if (!((password.length() >= 8))) {
			throw new Exception("Password length must be more than 8 characters");
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
		
		System.out.println("Please enter username: ");
		String username = ip.nextLine();
	
		do {
			String pass;
			System.out.print("Enter password: ");
			pass = ip.nextLine();

			try {
				validPassword(username,pass);
				System.out.println("Logged in successfully");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
}
