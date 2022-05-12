package view;

import java.util.Scanner;

public class Ex04OddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = Integer.parseInt(ip.nextLine());
		int Number[] = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap phan tu " + i + ":");
			Number[i] = Integer.parseInt(ip.nextLine());
		}
		for (int num : Number) {
			System.out.println(" " + num);
		}
		for (int k : Number) {
			if (k % 2 != 0 && k > max)
				max = k;
		}
		System.out.println("max: " + max);
	}
}
