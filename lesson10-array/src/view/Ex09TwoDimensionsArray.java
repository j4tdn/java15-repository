package view;

public class Ex09TwoDimensionsArray {
	public static void main(String[] args) {
		
		int[] one = {1, 2, 3, 4, 5};
		int[][] twoD = {
				{1, 2}, // twoD[0]
				{2, 3}  // twoD[1]
		};
		
		// TwoD [] = {new TwoD(1, 2, 3), new TwoD(2, 3, 4)}
		
		for(int row = 0; row < twoD.length; row++) {
			for(int col = 0; col < twoD[row].length; col++) {
				System.out.print(twoD[row][col] + " ");
			}
			System.out.println();
		}
	}
}
