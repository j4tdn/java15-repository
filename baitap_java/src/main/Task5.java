package main;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		int n; 
		int mul = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		n = sc.nextInt();
		for (int i = 1; i <= 20; i++) {
			mul = n*i;
			System.out.println(n+ " x " +i+ " = " +mul);
		}
		
	}

}
