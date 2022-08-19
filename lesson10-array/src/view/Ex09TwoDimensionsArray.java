package view;

public class Ex09TwoDimensionsArray {
	public static void main(String[] args) {
		int[] oneD = { 1, 2, 3, 4, 5 };
		
		int[][] twoD = { 
				{1,2,3}, // twoD[0]
				{2,3,4}  // twoD[1]
		};
		
		// TwoD(x,y,z)
		// TwoD[] twoD = {new TwoD(1,2,3), new TwoD(2,3,4)}
		
		int[][][] threeD = { 
				{
					{1,2,3}, // threeD[0]
					{2,3,4}
				},
				{
					{1,2,3}, // threeD[1]
					{2,3,4}
				},
		};
		// XType(x,y,z)
		// YType --> XType[]
		// YType[]
		for (int row = 0; row < twoD.length; row++) {
			for (int col = 0; col < twoD[row].length; col++) {
				System.out.print(twoD[row][col] + " ");
			}
			System.out.println();
		}
	}
}
