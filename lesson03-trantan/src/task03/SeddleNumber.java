package task03;

import java.util.Random;

public class SeddleNumber {

	public static void main(String[] args) {
		System.out.println("Exist Seddle NUMBER: "+ finSaddle(createTable(6, 5)));
	}
	public static boolean finSaddle(int[][] table) {
		 int minRow, maxCol, jMinRow;

		boolean isSaddleNum = false;

		for (int row = 0; row < table.length; row++) {
			minRow = table[row][0];
			jMinRow = 0;
			for (int col = 1; col < table[row].length; col++) {

				if (minRow > table[row][col]) {
					minRow = table[row][col];
					jMinRow = col;
				}
			}
			maxCol = table[0][jMinRow];
			for (int col = 1; col < table[col].length; col++) {
				if (maxCol < table[col][jMinRow]) {
					maxCol = table[col][jMinRow];
				}

			}
			if (maxCol == minRow) {
				return isSaddleNum = true;
			}
			
		}
		return isSaddleNum;
	}

	public static int[][] createTable(int row, int col) {
		int[][] table = new int[row][col];
		
		for (int i = 0; i < row; i++) {
			System.out.println("\n");
			for (int j = 0; j < col; j++) {
				table[i][j] = new Random().nextInt(98) + 1;

				System.out.print(table[i][j] + "  ");
				

			}
		}
System.out.println(table.length);
		return table;
	}

}
