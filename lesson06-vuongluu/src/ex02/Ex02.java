package ex02;

import java.util.Scanner;

public class Ex02 {

		public static void main(String[] args) {
			String username;
			String password;
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			do {
				try {
					System.out.println("UserName: ");
					username = scanner.nextLine();
					System.out.println("Password: ");
					password = scanner.nextLine();
					validate(password);
					break;
				} catch (Exception e) {
					System.out.println("invalid");
					e.printStackTrace();
				}
			} while (true);
			
			
			System.out.println("wellcome " + username);

		}
		private static boolean validate(String S) {
			if(S.length()<8) {
				throw new RuntimeException("invalid at least 8");
			}
			if(S.length()>256) {
				//System.out.println("invalid at least 8");
				throw new RuntimeException("invalid at most 235");
			}
			if(!(S.matches("^.*[a-z].*$"))) {
				throw new RuntimeException("invalid at least 1 lowercase");
			}
			if(!(S.matches("^.*[A-Z].*$"))) {
				throw new RuntimeException("invalid at least 1 uppercase");
			}
			if(!(S.matches("^(?=.*\\d).*$"))) {
				throw new RuntimeException("invalid at least 1 number");
			}
			if(!(S.matches("^(?=.*[!.#@_+,?-]).*$"))) {
				throw new RuntimeException("invalid at special character");
			}
			return true;
		}

}
