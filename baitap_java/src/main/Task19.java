package main;

import java.util.Scanner;

public class Task19 {
	public static void main(String[] args) {
		String string;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi");
		string = sc.nextLine();
		string = string.replaceAll(" ", "");
		System.out.println("chuỗi sau khi định dạng " +string);
	}
}
