package exercise;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
	}
	public static int lessOddNumber(int[] array, int lengthOfArray) {
		int minOdd = 0;
		for(int i = 0; i < lengthOfArray; i++) {
			System.out.print("Array[" + i + "]" + " = " + array[i]);
			Scanner ip = new Scanner(System.in);
			array[i] = ip.nextInt();
		}
		
		for(int i = 0; i < lengthOfArray; i++) {
			if(array[i] % 2 == 0) {
				
			}
		}
		return minOdd;
		
	}
}
