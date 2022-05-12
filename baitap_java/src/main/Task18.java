package main;

import java.util.Scanner;

public class Task18 {
	public static void main(String[] args) {
		int x, y, div, res;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập x");
		x = sc.nextInt();
		System.out.println("Nhập y");
		y = sc.nextInt();
		div = x/y;
		res = x%y;
		System.out.println("Số nguyên " +div);
		System.out.println("Số dư " +res);
	}
}
