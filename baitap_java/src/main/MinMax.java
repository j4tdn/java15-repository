package main;

import java.util.Scanner;

public class MinMax {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang");
		n = sc.nextInt();
		int[] arrs = new int[n];
		for (int i = 0; i < arrs.length; i++) {
			System.out.println("nhap phan tu thu "+ (i+1));
			arrs[i] = sc.nextInt();
		}
		System.out.println("so nho nhat la " +findMin(arrs));
		System.out.println("so lon nhat la " +findMax(arrs));
	}

	public static int findMin(int[] elements) {
		int min = elements[0];
		for (int i : elements) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}

	

	public static int findMax(int[] elements) {
		int max = elements[0];
		for (int i : elements) {
			if(max < i) {
				max = i;
			}
		}
		return max;
	}

}
