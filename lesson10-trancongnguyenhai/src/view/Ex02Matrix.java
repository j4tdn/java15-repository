package view;

import java.util.Arrays;

import bean.IndexZero;

public class Ex02Matrix {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		int[][] matrix2 = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		printMatrix(matrix2);
		System.out.println("====================");
		changeRowAndColByZeroIndex(matrix2);
	}

	private static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static IndexZero[] findIndexZero(int[][] matrix) {
		IndexZero[] result = new IndexZero[matrix[0].length * matrix.length];
		int running = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[0].length; column++) {
				if (matrix[row][column] == 0) {
					result[running++] = new IndexZero(row, column);
				}
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static void changeRowAndColByZeroIndex(int[][] matrix) {
		IndexZero[] indexZeros = findIndexZero(matrix);
		for (IndexZero indexZero : indexZeros) {
			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[0].length; j++) {
					if (i == indexZero.getRow() || j == indexZero.getColumn()) {
						matrix[i][j] = 0;
					}
				}
			}
		}
		printMatrix(matrix);
	}
}
