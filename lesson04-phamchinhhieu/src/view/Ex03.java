package view;

import java.util.Random;

public class Ex03 {
	public static void main(String[] args) {
		Random rd = new Random();
		int n = rd.nextInt(1, 5);
		System.out.println("n= " + n);
		int[][] arr = new int[n + 1][n + 2];
		
		PascalRectangle(arr, n);
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n + 1; j++) {
				if (arr[i][j] > 0) {
					System.out.print(arr[i][j] + "		");
				}
			}
			System.out.println();
			System.out.println();
		}

	}

	private static void PascalRectangle(int[][] a, int n) {
		for (int i = 0; i <= n; i++) {
			a[i][0] = 1;
		}
		for (int i = 0; i <= n; i++) {
			a[i][i + 1] = 1;
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
			}
		}
	}

}
