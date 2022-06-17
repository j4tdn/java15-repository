package view;

public class Ex03Triagle {
	public static void main(String[] args) {
		int n = 8;
		
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n+1; j++) {
				if(pascal(n)[i][j] > 0) {
					System.out.print(pascal(n)[i][j]+ "  ");
					
				}
			}
			System.out.println();
			System.out.println();
		}
	}
	private static int[][] pascal( int n){
		int[][] arrays = new int[n+1][n+2];
		for (int i = 0; i <= n; i++) {
			arrays[i][0] = 1;
			
		}
		for (int i = 0; i <= n; i++) {
			arrays[i][i+1] = 1;
		}
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				arrays[i][j] = arrays[i-1][j-1] + arrays[i-1][j];
			}
		}
		return arrays;
	}
}
