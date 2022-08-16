package view;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {1, 9, 0, 9}, {2, 9, 6, 5}, {1, 2, 4, 5}};
		 zeroCOLRow(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print( matrix[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
	private static void zeroCOLRow(int[][] source){
		
		
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < 4; j++) {
				if(source[i][j] == 0) {
					for (int j2 = 0; j2 < 4; j2++) {
						source[i][j2] =0;
					}
					for (int j2 = 0; j2 < source.length; j2++) {
						source[j2][j] = 0;
					}
					return ;
				}
				
				
			}
			
		}
	
	}
	
}
