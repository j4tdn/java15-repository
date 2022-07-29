package viwer;

import java.util.Scanner;

public class Ex04 {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		 System.out.printf("Username: ");
	        String user = input.next();
	        System.out.printf("Password: ");
	        String password = input.next();
	        do {
				password = input.nextLine();
				try {
					checkPass(password) ;
					System.out.println("Đăng nhập thành công:");
						break;
					

				} catch (NumberFormatException n) {
					System.out.println("Nhập lại mật khẩu ,"+n.getMessage());
					System.out.println("Password:");
				}

			} while (true);

			
	

	}
	public static boolean checkPass(String password) {

		if (password.length() < 8  ){
			throw new NumberFormatException("Mật khẩu quá ngắn: ");
		}
		
		if (!password.matches("^.*[A-Z]+.*$")) {
			throw new NumberFormatException("Mật khẩu có ít nhất kí tự viết hoa:");

		}
		
		 if (!password.matches("^.*[0-9]+.*$")) {
			throw new NumberFormatException("Mật khẩu có ít nhất một số: ");
		 }
		  if (!password.matches("^.*[~!@#$%^&*()]+.*$")) {
				throw new NumberFormatException("Mật khẩu có ít nhất một kí tự đặc biệt :");
			}

		return true;
	}
}
