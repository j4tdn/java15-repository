package view;


public class Ex09TwoDimensionsArray {
	public static void main(String[] args) {
		int[] oneD = {1, 2, 3, 4, 5};
		
		int[][] twoD= { 
				{1,2} , //twoD[0]
				{2,3}   //twoD[1]
				};
		//TwoD(x,y,z)
		//TwoD[] twoD = {new TwoD(1, 2, 3), new TwoD(2,3,4)}
		for(int row =0; row < twoD.length; row++) {
			for(int colum =0; colum < twoD[row].length; colum++) {
				System.out.print(twoD[row][colum] + " ");
			}
			System.out.println();
		}
	}
}
