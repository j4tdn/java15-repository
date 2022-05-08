package io;

import java.util.Scanner;

public class Ex01Scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = ip.nextLine();
		
		System.out.print("Enter your hobbies: ");
		String hobbies = ip.nextLine();
		
		System.out.print("Enter age: ");
		//int age = ip.nextInt();
		//ip.nextLine();
		// biểu thức để trị vấn đề bấm enter k cho nhập address
		int age = Integer.parseInt(ip.nextLine());
		
		System.out.println("Enter address: ");
		String address = ip.nextLine();
		
		System.out.println("===========");
		System.out.println("Your name: " + name);
		System.out.println("Your hobbies: " +  hobbies);
		System.out.println("Your age: " + age);
		System.out.println("Your address: " + address);
			}
}
