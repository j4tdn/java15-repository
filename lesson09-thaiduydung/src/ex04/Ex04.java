package ex04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {
	public static void main(String[] args) {
		String user = getUser();
		System.out.println("user :" + user);
		String pass =getPassWord();
		System.out.println("password: " +pass);
		
	}
	public static String getUser() {
		Scanner sc = new Scanner(System.in);
		String user ="";
		while(true) {
			System.out.println("user :");
			user =sc.nextLine();
		return user;
	}

	}

public static String getPassWord() {
	Scanner sc = new Scanner(System.in);
	String password ="";
	while(true) {
		System.out.println("password :");
		password =sc.nextLine();
		Pattern p =Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
		
		if(p.matcher(password).find()) {
			break;
			
		
		}else {
			System.out.println("password is not oke");
		}
	}
	
	return password;
	
}

}
