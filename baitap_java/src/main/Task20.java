package main;

import java.util.Scanner;

public class Task20 {
	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập tên ");
		name = sc.nextLine();
		String fName = name.substring(0, 1);
		String sName = name.substring(1, name.length());
		fName = fName.toUpperCase();
		name = fName + sName;
		System.out.println("Tên sau khi viết hoa: "+name);
	}
}
