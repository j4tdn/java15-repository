package ex03;

import java.util.Random;
import java.util.Scanner;

public class SadleElement {
	private static Scanner sc = new Scanner(System.in);
	private static Random rd = new Random();

	public static void main(String[] args) {
		System.out.print("Enter the size of column: ");
		int m = sc.nextInt();
		System.out.print("Enter the size of row: ");
		int n = sc.nextInt();

		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = rd.nextInt(99) + 1;
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		if (saddleElement(a) != 0) {
			System.out.println("The saddle element in the array: " + saddleElement(a));
		} else {
			System.out.println("There doesn'e exist saddle element in the aray!");
		}
	}

	public static int saddleElement(int[][] a) {
		int colMax = 0;
		for (int i = 0; i < a.length; i++) {
			int rowMin = a[i][0];
			int colIndex = 0;
			// Finding the smallest element in ith row
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] < rowMin) {
					rowMin = a[i][j];
					colIndex = j;
				}
			}
			// Checking rowMin is also the largest element in its column
			for (int k = 0; k < a.length; k++) {
				if (a[k][colIndex] > rowMin) {
					colMax = 0;
					break;
				} else {
					colMax = rowMin;
				}
			}
			if (colMax != 0) {
				System.out.println("The saddle point is: " + colMax);
				return colMax;
			}
		}
		return colMax;
	}
}