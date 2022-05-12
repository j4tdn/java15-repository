package view;

import java.util.Scanner;

public class Ex04OddNumberCheck {

	public static void main(String[] args) {

		System.out.println("Nhap so phan tu cua day so can kiem tra");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("nhap lan luot cac so can kiem tra");
		for (int i = 0; i < n; i++) {
		arr[i] = sc.nextInt();
		}
		System.out.println("so le lon nhat la: " + LargestOddNumber(arr));
	}

	private static int LargestOddNumber(int[] n) {
		int maxOdd = 0;

		for (int i = 0; i < n.length; i++) {
			if (n[i] % 2 == 1) {
				if (maxOdd < n[i]) {
					maxOdd = n[i];
				}
			}
		}
		return maxOdd;
	}

}
