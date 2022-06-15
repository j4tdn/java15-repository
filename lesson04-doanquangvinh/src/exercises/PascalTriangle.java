package exercises;

public class PascalTriangle {
	   public static void main(String[] args) {
	      int n = 7;
	      int[][] arr = new int[7][7];
	      for (int i = 1; i <= n; i++) {
	         arr[i][1] = 1;
	         arr[i][i+1] = 1;
	         
	         System.out.println();
	         if (i==1) {
	            System.out.print(arr[i][1]+ "  " + arr[i][i+1]);
	         }
	         for (int j = 1; j <= i; j++) {
	          
	          if (j>=2){
	            arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
	            
	            System.out.print( arr[i][1] + "  "+ arr[i][j] + "  " + arr[i][i+1]);
	          }
	         }
	         
	      }
	   }
	}


