package main;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		String mssv;
		String[] arr = new String[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("nhap gia tri thu " +(i+1));
			arr[i] = sc.nextLine();
			if (!arr[i].matches("00[2-5]L\\d{4}")) {
				System.out.println("sai roi");
				break;
			}else {
				System.out.println("dung roi");
			}
		}
	}
}
