package view;

import java.util.Scanner;

public class Ex04LargestOoddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang: ");
		int n = Integer.parseInt(ip.nextLine());
		int[] Number = new int[n];
		int max = 0;
		for (int i = 0; i < n; i++) {
			System.out.printf("Nhap gia tri cho phan tu [%d] = ", i + 1);
			Number[i] = Integer.parseInt(ip.nextLine());
		}
			for (int num : Number) {
			}
			for (int k : Number) {
				if (k % 2 != 0 && k > max)
					max = k;
			}
			System.out.println("Phan tu le lon nhat cua mang la: " + max);
		}
	}
