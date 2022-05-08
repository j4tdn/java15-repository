package io;

import java.util.Scanner;

public class Ex01scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Nhap:");
		String name = ip.nextLine();
		
		System.out.print("enter age:");
		int age = ip.nextInt();
		ip.nextLine();
		
		System.out.println("add:");
		String add = ip.nextLine();
		
		System.out.println("==================");
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
		System.out.println("Add:" + add);
		
	}
}
