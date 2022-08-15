package view;


public class Ex02 {
	public static void main(String[] args) {
		int row = 5;
		int col =4;
		int[][] matrixs = { { 1, 2, 3, 4 }, { 5, 0, 8, 7 }, { 1, 9, 0, 9 }, { 2, 0, 6, 5 }, { 1, 2, 4, 5 } };
		int[][] tmps = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				tmps[i][j] = matrixs[i][j];
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrixs[i][j] == 0) {
					for (int m = 0; m < col; m++) {
						tmps[i][m] = 0;
					}
					for (int n = 0; n < row; n++) {
						tmps[n][j] = 0;
					}
				}

			}
		}
		for (int i = 0; i < matrixs.length; i++) {
			for (int j = 0; j < matrixs.length - 1; j++)

				System.out.print(tmps[i][j] + "\t");

			System.out.print("\n");
		}
	}
}
