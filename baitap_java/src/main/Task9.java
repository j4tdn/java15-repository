package main;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		int n;
		int[] arr;
		int max = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("nhap phan tu thu "+(i+1));
			arr[i] = sc.nextInt();
			
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("so nguyen lon nhat trong chuoi la: "+max);
	}

}
