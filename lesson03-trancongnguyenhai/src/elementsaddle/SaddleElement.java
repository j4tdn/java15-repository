package elementsaddle;

import java.util.Scanner;

public class SaddleElement {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Num of row: ");
		int row = ip.nextInt();
		System.out.print("Num of col: ");
		int col = ip.nextInt();
		int[][] array = new int[row][col];
		inputArray(array, row, col);
		outputArray(array, row, col);
		if (isArrayHasNumSaddle(array, row, col)) {
			System.out.println("==> The array has saddle element!");
		} else {
			System.out.println("==> The array hasn't saddle element!");
		}
	}

	private static void inputArray(int[][] arr, int m, int n) {
		Scanner ip = new Scanner(System.in);
		System.out.println("\nInput array: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("arr[" + i + "]" + "[" + j + "]= ");
				arr[i][j] = ip.nextInt();
			}
		}
	}

	private static void outputArray(int[][] arr, int m, int n) {
		System.out.println("\nArray:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	private static boolean isArrayHasNumSaddle(int[][] array, int m, int n) {
		int[] arrMinRow = minRow(array, m, n);
		int[] arrMaxCol = maxCol(array, m, n);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if ((array[i][j] == arrMinRow[i]) && (array[i][j] == arrMaxCol[j])) {
					return true;
				}
			}
		}
		return false;
	}

	private static int[] minRow(int[][] array, int m, int n) {
		int[] minRow = new int[m];
		for (int i = 0; i < m; i++) {
			minRow[i] = array[i][0];
			for (int j = 0; j < n; j++) {
				if (minRow[i] > array[i][j]) {
					minRow[i] = array[i][j];
				}
			}
		}
		return minRow;
	}

	private static int[] maxCol(int[][] array, int m, int n) {
		int[] maxCol = new int[n];
		for (int i = 0; i < n; i++) {
			maxCol[i] = array[0][i];
			for (int j = 0; j < m; j++) {
				if (maxCol[i] < array[j][i]) {
					maxCol[i] = array[j][i];
				}
			}
		}
		return maxCol;
	}
}
