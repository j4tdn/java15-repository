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
			System.out.println(CheckPassWord(Password));
		}
		
	}
	private static boolean CheckPassWord(String Password) {
		if(Password.length() < 8) return false;
		int dem=0,dem1=0;
		boolean dem2=false;
		for(int i = 0; i< Password.length();i++) {
			if(Character.isDigit(Password.charAt(i))) dem++;
			if(Character.isLetter(Password.charAt(i))) dem1++;
			if(Password.charAt(i) != '('||'~'||'!'||'@'||'#'||'$'||'%'||'^'||'&'||'*'||')')
	}
		if(dem2==true) return true;
		return false;
}
}
