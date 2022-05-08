package io;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name = ip.nextLine();
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();
		System.out.print("Enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		System.out.println("Your name: " + name);
		System.out.println("Your age: " + age);
		System.out.println("Your hobbies: " + hobbies);

	}
}
