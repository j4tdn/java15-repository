package view;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 2, 4, 5 } };
		reversedMatrix(matrix);
	}

	private static void reversedMatrix(int[][] matrix) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					x = i;
					y = j;
					System.out.println(x + " " + y);
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == x || j == y) {
					matrix[i][j] = 0;
                    
				}
			}
		}
		printMatrx(matrix);
	}

	private static void printMatrx(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println("");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
		}
	}
}
