package ex04_lesson09exam;

import java.util.Scanner;

public class Ex04 {
	static Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Mời nhập tên tài khoản:");
		String NameAccount = ip.nextLine();
		String Password;
		while(true) {
			System.out.println("Mời nhập password:");
			Password = ip.nextLine();
			//System.out.println(CheckPassWord(Password));
		}
		
	}
	
}

