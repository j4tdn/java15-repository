package io;

import java.util.Scanner;

public class Ex01Scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("enter name: ");
		String name = ip.nextLine();
		
		System.out.print("enter hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.print("enter age: ");
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("====================");
		System.out.println("Your name: " + name);
		System.out.println("Your age: " + age);
		System.out.println("Your hobbies: " + hobbies);
	}
}
