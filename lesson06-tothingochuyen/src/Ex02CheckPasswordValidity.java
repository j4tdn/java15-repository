import java.util.Scanner;

/**
 * Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
Mật khẩu phải thỏa mãn các điều kiện sau đây.
Lặp lại các bước kiểm tra điều kiện cho đến khi đăng ký tài khoản thành công.
Nếu thông tin nhập vào không hợp lệ sẽ ném ra các ngoại lệ, lỗi tương ứng
sau đó thông báo cho người dùng biết và cho phép nhập lại.
 * */
public class Ex02CheckPasswordValidity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String password;
		while(true) {
			System.out.print("Enter password: ");
			password = input.nextLine();
			try {
				if(isValidPassword(password)) {
					System.out.println("Sign in successfully!!!");
					break;
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	private static boolean isValidPassword(String password) throws Exception{
		if(password.length() < 8) {
			throw new Exception("Password must contain at least 8 characters!");
		}
		if(password.length() > 256) {
			throw new Exception("Password must contain at most 256 characters!");
		}
		if(!password.matches(".*([a-z]{1,}).*")) {
			throw new Exception("Password must contain at least 1 lower alphabetic character!");
		}
		if(!password.matches(".*([A-Z]{1,}).*")) {
			throw new Exception("Password must contain at least 1 uppercase alphabetic character!");
		}
		if(!password.matches(".*([0-9]{1,}).*")) {
			throw new Exception("Password must contain at least 1 number!");
		}
		if(!password.matches("(.*[~!@#$%^&*()-_=+]{1,}).*")) {
			throw new Exception("Password must contain at least 1 number!");
		}
		return true;
	}
}
