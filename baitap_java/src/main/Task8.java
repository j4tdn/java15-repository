package main;

import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		int n;
		int sum = 0;
		double ave =0;
		int[] arr;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu " + i);
			arr[i] = sc.nextInt();
			sum = sum +arr[i];
		}
		
		ave = sum/(arr.length);
		System.out.println("trung binh mang arr "+ave);
	}
}
