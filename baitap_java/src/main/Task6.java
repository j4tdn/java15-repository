package main;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		int n;
		int fibonacci = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		n = sc.nextInt();
		if (n == 1 || n == 0) {
			fibonacci = 1;
		} else {
			fibonacci = (n - 1) + (n - 2);
			
		}
		System.out.println("fibonacci " +fibonacci);
	}
}

