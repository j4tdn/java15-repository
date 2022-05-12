package main;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a, b, c");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		if(a+b>c && a+c>b && b+c>a) {
			System.out.println("a, b, c là ba cạnh của tam giác");
		}else {
			System.out.println("a, b, c ko phải là cạnh của 1 tam giác");
		}
	}

}
