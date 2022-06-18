package pascaltriangle;

import java.util.Scanner;

public class PascalTriangel {
	public static void main(String[] args) {

		int height;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the height: ");
		height = scanner.nextInt();
		// height +=1;
		int[][] A = new int[height + 1][height + 2];
		for (int i = 0; i <= height; i++) {
			A[i][0] = 1;
		}
		
		int m = 0, n = 1;
		while (m <= height) {
			A[m][n] = 1;
			m++;
			n++;
		}

		for (int i = 1; i < height + 1; i++) {
			for (int j = 1; j <= i; j++) {
				A[i][j] = A[i - 1][j - 1] + A[i - 1][j];
			}
		}

		for (int i = 0; i < height + 1; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print(A[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
