package view;

import java.util.Scanner;

public class Ex01AntagonalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input the n :");
		int n = sc.nextInt();
		int [][] numbers = new int[n][n];
		antagonalTriangle(numbers);
		
	}
	private static  void antagonalTriangle(int numbers[][]) {
		int last = numbers.length-1;
     	int head = 0;
	
		
		for(int row = 0; row<numbers.length;row++) {
			for(int col = 0; col<numbers[row].length; col++) {
				numbers[row][col]= col+1;
			}
			
		}
		for(int row = 0; row<numbers.length;row++) {
			for(int col = 0; col<numbers[row].length; col++) {
				if(col<=head || col >=last) {
				
				System.out.print(numbers[row][col]+" ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			if(row<numbers.length/2) {
			head++;
			last--;
			}
			else {
				head--;
				last++;
			}
			System.out.println();
		}
	}

}
