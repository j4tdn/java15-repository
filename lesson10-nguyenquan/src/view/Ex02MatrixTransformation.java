package view;



public class Ex02MatrixTransformation {
	public static void main(String[] args) {
		int [][]matix = {{1,2,3,4},{5,6,8,7},{1,9,0,9},{2,9,6,5},{1,2,4,5}};
		int [][] result = transformation(matix, 5, 4);
		for(int i = 0; i< 5; i++) {
			for(int j = 0; j<4; j++) {
				System.out.print(result[i][j] +"   ");
			}
			System.out.println();
		}
		
	}
	private static int [][] transformation(int [][]matrix,int row, int col){
		int rowZero = 0;
		int colZero = 0;
		for(int i = 0; i< row; i++) {
			for(int j = 0; j<col; j++) {
				if(matrix[i][j]== 0) {
					rowZero = i;
					colZero = j;
					break;
				}
			}
		}
		for(int i = 0; i<row ;i++) {
			matrix[i][colZero] = 0;
		}
		for(int i = 0; i<col ;i++) {
			matrix[rowZero][i] = 0;
		}
		return matrix;
	}
}


