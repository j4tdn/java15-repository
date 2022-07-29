package ex04register;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Register {
	private static Scanner ip = new Scanner(System.in);
	private static boolean flag = true;

	public static void main(String[] args) {
		System.out.println("Enter username: ");
		String username = ip.nextLine();
		do {
			System.out.print("Enter password: ");

			String password = ip.nextLine();
			if (checkPassword(password) == false) {
				System.out.println("Mật Khẩu phải chứa chữ in hoa, chữ thường, số và kí tự đặc biệt!");
			}else {
				System.out.println("Đăng nhập thành công");
				flag = false;
			}
		} while (flag);
	}

	public static boolean checkPassword(String passWord) {
		String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

		if (!Pattern.matches(pattern, passWord)) {
			return false;
		}
		return true;
	}
}
