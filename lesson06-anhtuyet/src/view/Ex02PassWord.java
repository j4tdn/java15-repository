package view;

import java.util.Scanner;

public class Ex02PassWord {
	private static String passWord = null;

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		do {
			try {
				System.out.println("Enter password: ");
				passWord = sc.nextLine();
				checkPassWord(passWord);
				System.out.println("Qualified is password");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	}

	public static boolean checkPassWord(String passWord) throws Exception {
		if(passWord.length() < 8) {
			throw new Exception("Password must contain at least 8 characters");
		}
		if(passWord.length() > 256) {
			throw new Exception("Password must contain at least 256 characters!");
		}
		if(!passWord.matches(".*([a-z]{1,}).*")){
			throw new Exception("Password must contain at least 1 lower alphabetic character");
		}
		if(!passWord.matches(".*([A-Z]{1,}).*")){
			throw new Exception("Password must contain at least 1 uppercase alphabetic character ");
		}
		if(!passWord.matches(".*([0-9]{1,}).*")){
			throw new Exception("Password must contain at least 1 numeber");
		}
		if(!passWord.matches("(.*[~!@#$%^&*()-_=+]{1,}).*")){
			throw new Exception("Password must contain at least special character");
		}
		return true;
	}
}

