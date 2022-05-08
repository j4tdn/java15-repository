package control;

import java.util.Scanner;

public class Ex05_Find_Password {

	public static void main(String[] args) {
		 Scanner ip = new Scanner(System.in);

		
		String name = "admin";
		String pass = "asd";
		do {
			System.out.print("Nhap username: ");
			name = ip.nextLine();
			System.out.print("Nhap password: ");
			pass = ip.nextLine();
			System.out.println(name);
			System.out.println(pass);
			System.out.println("ahihi");
		}
		while((name == "admin" ) && (pass == "asd"));
	}
}
