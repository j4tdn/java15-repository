package ex02;

import java.util.Arrays;
import java.util.Random;

public class EX02 {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int[][] a = getArray2D();
		pritnf(a);
		System.out.println("------------------");
		int[][] result = magic(a);
		pritnf(result);
	}

	private static int[][] getArray2D() {
		int[][] arr = new int[5][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = rd.nextInt(10);
			}
		}
		return arr;
	}

	private static void pritnf(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	private static int[][] magic(int[][] a) {
		int[] row = new int[a.length];
		int[] col = new int[a[0].length];
		
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if (a[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (row[i] == 1 || col[j] == 1) {
					a[i][j] = 0;
				}
			}
		}
		return Arrays.copyOf(a, a.length);
	}
}