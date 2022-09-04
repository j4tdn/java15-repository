package view;

import java.util.Scanner;

public class Ex01AntagonalTriangle {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input: ");
		int keyNum = ip.nextInt();
		printMatrix(createMatrixByKeyNum(keyNum));

	}

	private static void printMatrix(String[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static String[][] createMatrixByKeyNum(int keyNum) {
		int lengthMatrix = 2 * keyNum - 1;
		String[][] matrix = new String[lengthMatrix][lengthMatrix];
		for (int row = 0; row < lengthMatrix; row++) {
			for (int col = 0; col < lengthMatrix; col++) {
				if ((row <= keyNum && row < col && col < lengthMatrix - row - 1)
						|| col < row && lengthMatrix - row - 1 < col) {
					matrix[row][col] = " ";
				} else {
					matrix[row][col] = String.valueOf(col + 1);
				}
			}
		}
		return matrix;
	}
}
