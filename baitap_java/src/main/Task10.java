package main;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		int n; 
		int[] arr;
		int min =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen n");
		n = sc.nextInt();
		arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("nhap gia tri thu "+(i+1));
			arr[i] = sc.nextInt();
			
		}
		min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("gia tri nho nhat cua mang la: "+min);
	}

}
