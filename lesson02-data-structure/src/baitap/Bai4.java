package baitap;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {

		int n;
		int soLe = 0;
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap vao so phan tu cua mang");
		n = ip.nextInt();
		if (n <= 0) {
			System.out.println("nhap lai n");
		}
		int A[] = new int[n];
		System.out.println("nhap cac phan tu cho mang: ");
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu thu " + i + ": ");
			A[i] = ip.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (A[i] % 2 != 0) {
				soLe++;
			}
		}
	

}}
