package exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04SignUp {

	public static void main(String[] args) {
		String account ;
		String password;
		Scanner sc = new Scanner(System.in);
		boolean test = true;
		do {
			System.out.println("Nhập tài khoản: ");
			account = sc.nextLine();
			System.out.println("Nhập mật khẩu: ");
			password = sc.nextLine();
			if(!PasswordValidation(password) && !check(account, password)) {
				System.out.println("Vui lòng nhập lại tài khoản theo yêu cầu! ");
				test = false;
			}
			else {
				System.out.println("Đăng ký tài khoản thành công !!!");
				test = true;
			}
		}while(test == false);
		
		
	}

	public static boolean PasswordValidation(String password) {

		if (password.length() >= 8) {
			Pattern letter = Pattern.compile("[A-Z]");
			Pattern digit = Pattern.compile("[0-9]");
			Pattern special = Pattern.compile("[~!@#$%^&*]");

			Matcher hasLetter = letter.matcher(password);
			Matcher hasDigit = digit.matcher(password);
			Matcher hasSpecial = special.matcher(password);

			return hasLetter.find() && hasDigit.find() && hasSpecial.find();

		} else
			return false;

	}

	public static boolean check(String account, String password) {
		int count = 0;

		for (int i = 0; i < account.length(); i++) {
			for (int j = 0; j < password.length(); j++)
				if (account.charAt(i) == password.charAt(j))
					count++;
		}
		if (count <= 3) {
			return true;
		} else {
			return false;
		}

	}
}
