package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,3,1};
		
	}
	private static int[] removeDuplicateNumber(int[] numbers) {
		int[] results;
		int rid=0;
		for(int i=0; i<numbers.length-1 ; i++) {
			for(int j=1; i<numbers.length; i++) {
				if(numbers[i] == numbers[j]) {
					
				}
			}
		}
		return Arrays.copyOfRange(results, 0, rid);
	}
}
