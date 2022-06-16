package view;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(7);
		System.out.println("High of rectangle: " + (n+1));
		int[][] array = new int[n+1][n + 2];
		Rectangle(array, n);
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n + 1; j++) {
				if (array[i][j] > 0) {
					System.out.print(array[i][j] + "\t");
				}
			}
			System.out.println();
			System.out.println();
		}
	}

	private static void Rectangle(int[][] arr, int n) {
		for (int i = 0; i <= n; i++) {
			arr[i][0] = 1;
		}
		for (int i = 0; i <= n; i++) {
			arr[i][i + 1] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
			}
		}
	}
}
