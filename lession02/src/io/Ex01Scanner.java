package io;

import java.util.Scanner;

public class Ex01Scanner {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("nhap ten:");
		String name =  ip.nextLine();
		
		System.out.println("nhap tuoi :");
	//	int age = Interger.parseInt(ip.nextLine());
		int age = ip.nextInt();
		ip.nextLine();
		
		
		System.out.println("Nhap so thich : ");
		String hobbies = ip.nextLine();
		
		System.out.println("nhap dia chi :");
		String address = ip.nextLine();
		
		
		System.out.println("ten cua ban la: " + name);
		System.out.println("tuoi cua ban: " + age);
		System.out.println("so thich la :" + hobbies);
		System.out.println("dia chi la: " + address);
		

	}

}
