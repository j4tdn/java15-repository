package view;

import java.util.Scanner;

public class Ex04_ValidatePassword {
	private static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		String pass = null;
		String uname = null;
		do {
			System.out.println("Nhap ten dang nhap: ");
			uname = ip.nextLine();
			System.out.println("Nhap password: ");
			pass = ip.nextLine();
			try {
				if(PasswordRequirement(pass, uname));
				System.out.println("MAT KHAU TOT");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}while(true);


	}
	private static boolean PasswordRequirement(String pass, String  uname) throws Exception {
		if(pass.length() < 8) {
			throw new Exception("Do dai mat khau phai lon hon 8 ki tu");
		}
		if(check1(pass) == false) {
			throw new Exception("Mat khau khong co chu viet hoa");
		}if(check2(pass, uname) == false) {
			throw new Exception("Mat khau trung qua 3 ki tu so voi ten dang nhap");
		}
		if(check3(pass) == false) {
			throw new Exception("Mat khau khong co so");
		}if(check4(pass) == false) {
			throw new Exception("Mat khau khong co ki tu dat biet");
		}
		return true;
	}
	private static boolean check1(String pass) {
		for(int i = 0; i < pass.length(); i++) {
			if(Character.isUpperCase(pass.charAt(i))) {
				return true;
			}
		}
		return false;

	}
	private static boolean check2(String pass, String uname) {
		int count = 0;
		for(int i = 0; i < uname.length(); i++) {
			for(int j = 0; j < pass.length(); j++) {
				if(uname.charAt(i) == pass.charAt(j)) {
					count++;
				}
			}
		}
		if(count < 3) {
			return true;
		}
		System.out.println("count: " + count);
		
		return false;

	}
	private static boolean check3(String pass) {
		int dem = 0;
		for(int i = 0; i < pass.length(); i++) {
			if(pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
				dem++;
			}
		}
		if(dem > 0) {
			return true;
		}
		return false;	
	}
	private static boolean check4(String password) {
		char[] chars = { '!', '@', '#', '$', '%', '^', '&', '*' };
		for (int i = 0; i < password.length(); i++) {
			for (int j = 0; j < chars.length; j++) {
				if (password.charAt(i) == chars[j])
					return true;
			}
		}
		return false;
	}
}
