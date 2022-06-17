package io;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Ex01Scanner {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = ip.nextLine();
		System.out.print("Enter hobbies: ");
		String hobbies = ip.nextLine();
		System.out.print("Enter age: ");
		//int  age = ip.nextInt();
		//ip.nextLine();
		 int age = Integer.parseInt(ip.nextLine());// nhập số nguyên sau đó nhập kiểu string dùng biểu thưucs nhập này
		 
		System.out.print("Enter address: ");
		String address = ip.nextLine();
		
		System.out.println("============== ");
		System.out.println("your name: " + name);
		System.out.println("your age: " + age);
		System.out.println("your hobbies: " + hobbies );
		System.out.println(":your address"+ address);


	}

}
