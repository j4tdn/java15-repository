package Ex04;

import java.util.Scanner;

/**
 * Viết chương trình thực hiện chức năng đăng ký tài khoản
B1. Nhập tên tài khoản ví dụ byztkhx256
B2. Nhập mật khẩu admin123
Yêu cầu mật khẩu như sau:
1. Độ dài mật khẩu: >= 8
2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
 * */
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
