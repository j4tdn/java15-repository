package main;

import java.util.Scanner;

public class Task15 {
	public static void main(String[] args) {
		int year;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("------------------------");
			System.out.println("Nhập năm muốn  kiểm tra");
			year = sc.nextInt();

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				System.out.println("Năm " + year + " là năm nhuận");

			} else {
				System.out.println("Năm " + year + " không phải năm nhuận");
			}
		} while (year != 0);
	}
}
