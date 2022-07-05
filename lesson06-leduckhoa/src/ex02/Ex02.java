package ex02;

import java.util.Scanner;

public class Ex02 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String password = null;
		System.out.println("Mời nhập mật khẩu:");
		

		do {
			password = input.nextLine();
			try {
				checkPass(password) ;
					break;
				

			} catch (NumberFormatException n) {
				System.out.println("Nhập lại mật khẩu ,"+n.getMessage());
			}

		} while (true);

		System.out.println("Thành công: "+ password);

	}

	public static boolean checkPass(String password) {

		if (password.length() < 8 || password.length() > 255) {
			throw new NumberFormatException("mật khẩu sai, tối thiểu 8 kí tự, tối đa 255 kí tự");
		}

		if (!password.matches(".*[a-z].*")) {
			throw new NumberFormatException("Mật khẩu sai, tối thiểu 1 chữ thường");

		}

		if (!password.matches(".*[A-Z].*")) {
			throw new NumberFormatException("Mật khẩu sai, tối thiểu 1 chữ hoa");

		}

		if (!password.matches(".*\\d+.*")) {
			throw new NumberFormatException("Mật khẩu sai, tối thiểu 1 chữ số");
		}

		if (!password.matches(".*[^\\w].*")) {
			throw new NumberFormatException("Mật khẩu sai, tối thiểu 1 kí tự đặt biệt");
		}

		return true;
	}
}
