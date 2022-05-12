package main;

import java.util.Scanner;

public class Task14 {
	public static void main(String[] args) {
		String s;
		char c;
		int time = 0;
		boolean b = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chuoi s");
		s = sc.nextLine();
		System.out.println("Nhap kí tu l");
		c = sc.nextLine().charAt(0);

		char arr[] = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == c) {
				time = time + 1;
				b = true;
			}

		}
		if (b == true) {
			System.out.println("ký tự " + c + " xuất hiện " + time + " lần");
		}

		if (b == false) {
			System.out.println("không xuất hiện ký tự " + c + " trong chuỗi");
		}
	}

}
