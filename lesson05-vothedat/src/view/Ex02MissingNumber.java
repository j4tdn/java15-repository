package view;

import java.util.Scanner;

public class Ex02MissingNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n = Integer.parseInt(ip.nextLine());
		int k, sum = 0;
		int Number[] = new int[n];
		for (int i = 0; i < n - 1; i++) {
			System.out.println("Nhap phan tu " + (i + 1) + ":");
			Number[i] = Integer.parseInt(ip.nextLine());		
		}
		for (int num : Number) {
			sum += num;
		}
		k = sumall(n) - sum;
		System.out.println("Kết quả là: " + k);
	}

	private static int sumall(int n) {
		int sumall = 0;
		for(int i = 1; i <= n; i++) {
			sumall += i;
		}
		return sumall;
	}
}
