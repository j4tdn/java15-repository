package ex03;

import java.util.Random;
import java.util.Scanner;

public class SaddleElement {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Enter the number of rows :");

		int rows = ip.nextInt();

		System.out.println("Enter the number of columns :");

		int cols = ip.nextInt();

		int[][] matrix = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = 1 + random.nextInt(99);
			}
		}

		System.out.println("The input matrix is :");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "\t");
			}

			System.out.println();
		}

		findSaddlePoint(matrix);

	}

	public static void findSaddlePoint(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			int rowMin = matrix[i][0];

			int colIndex = 0;

			boolean saddlePoint = true;

			for (int j = 1; j < matrix[i].length; j++) {
				if (matrix[i][j] < rowMin) {
					rowMin = matrix[i][j];

					colIndex = j;
				}
			}
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][colIndex] > rowMin) {
					saddlePoint = false;

					break;
				}
			}

			if (saddlePoint) {
				System.out.println("Saddle Point is : " + rowMin);
			}
		}
	}
}