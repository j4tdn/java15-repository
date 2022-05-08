package io;

import java.util.Scanner;

public class Ex01Scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name =ip.nextLine();
		System.out.print("Enter your hobbies");
		String hobbies= ip.nextLine();
		System.out.print("Enter your age: ");
		int age= Integer.parseInt(ip.nextLine());
		System.out.print("Enter address");
		String address= ip.nextLine();
	
		System.out.println("============");
		System.out.println("Your Name:" + name);
		System.out.println("Your Hobbies:" + hobbies);
		System.out.println("Your Age:" + age);
		System.out.println("Your Address:" + address);

	}
}
