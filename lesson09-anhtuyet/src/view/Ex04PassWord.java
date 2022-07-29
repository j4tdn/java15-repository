package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04PassWord {
	private static String userName = null;
	private static String passWord = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			try {
				System.out.println("Input name: ");
				userName=sc.nextLine();
				System.out.println("Input password: ");
				passWord = sc.nextLine();
				checkPassWord(passWord);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}
	public static boolean checkIP(String userName) throws Exception {
		if(userName.contains(passWord)) {
			throw new Exception	("Please input agian");
		}
		return true;
	}

	public static boolean checkPassWord(String passWord) throws Exception {
		if (passWord.length() < 8) {
			throw new Exception("Password must contain at least 8 characters");
		}
		if (!passWord.matches(".*([A-Z]{1,}).*")) {
			throw new Exception("Password must contain at least 1 uppercase alphabetic character ");
		}
		if (!passWord.matches(".*([0-9]{1,}).*")) {
			throw new Exception("Password must contain at least 1 numeber");
		}
		if (!passWord.matches("(.*[~!@#$%^&*()-_=+]{1,}).*")) {
			throw new Exception("Password must contain at least special character");
		}
		return true;
	}
}
