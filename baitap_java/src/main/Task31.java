package main;

import java.util.Scanner;

public class Task31 {
	public static boolean perfectNum(int a) {
		int sum = 0;
		for (int i = 1; i <= a/2; i++) {
			if (a%i==0) {
				sum = sum + i;
			}
			if(sum == a) 
				return true;
			
			
		}
		return false;
	}
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập giá trị thứ "+(i+1)+ " của mảng");
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if(perfectNum(arr[i])) {
				System.out.println("Số hoàn hảo có trong mảng là "+arr[i]+ " ");
			}
		}
	}
}
			

		
		

	

