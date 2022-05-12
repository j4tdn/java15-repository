package main;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		// Khai báo các biến cần thiết
		int n;
		int[] soNguyen;
		Scanner sc = new Scanner(System.in);
		// Nhập dữ liệu
		System.out.println("Nhập vào n:");
		n = sc.nextInt();
		soNguyen = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào số nguyên:");
			soNguyen[i] = sc.nextInt();
		}
//	      //In ra mảng ban đầu
//	      System.out.println("Mảng trước khi đảo ngược: ");
//	      for (int i = 0; i < n; i++)
//	         System.out.print(soNguyen[i] + " ");
//	      //Đảo ngược mảng
//	      for (int i = 0; i < n/2; i++)
//	      {
//	         int empty;
//	         empty = soNguyen[i];
//	         soNguyen[i] = soNguyen[n-i-1];
//	         soNguyen[n-i-1] = empty;
//	      }
//	      //In ra mảng sau khi đảo ngược
//	      System.out.println("\nMảng sau khi đảo ngược: ");
//	      for (int i = 0; i < n; i++)
//	      System.out.print(soNguyen[i] + " ");
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(soNguyen[i]+ " ");

		}
	}
}
