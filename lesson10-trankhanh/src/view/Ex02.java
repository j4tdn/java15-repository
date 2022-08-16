package view;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 1 }, { 1, 0, 1, 0, 1 }, { 1, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0 } };
		setZeros(arr);
	}

	public static void setZeros(int[][] matrix) {
		boolean firstRowZero = false;
		boolean firstColumnZero = false;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				firstColumnZero = true;
				break;
			}
		}
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				firstRowZero = true;
				break;
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					// if true, sets an elements to 0
					matrix[i][j] = 0;
				}
			}
		}

		if (firstColumnZero) {
			for (int i = 0; i < matrix.length; i++)
				matrix[i][0] = 0;
		}
		if (firstRowZero) {
			for (int i = 0; i < matrix[0].length; i++)
				matrix[0][i] = 0;
		}

		for (int i = 0; i < matrix.length; i++) {
			// loop for printing columns
			for (int j = 0; j < matrix.length; j++) {
				// prints matrix elements
				System.out.print(matrix[i][j] + "\t");
				if (j == matrix.length - 1)
					// throws cursor to the next line
					System.out.println();
			}
		}
	}

}
