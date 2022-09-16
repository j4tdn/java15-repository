package view;

import java.util.Arrays;

public class Ex01Crud {

	public static void main(String[] args) {
		int[] numbers = {1,9,5,36,12,33};
		int[] addedArray = add(numbers,4,99);
		System.out.println(Arrays.toString(addedArray));
	}
	private static int[] add(int[] source, int pos, int newValue) {
		int[] target = new int [source.length+1];
		
		for(int i = 0; i<target.length;i++) {
			if(i<pos) {
				target[i] = source[i];
			}
			else if(i == pos) {
				target[i]= newValue;
			}
			else {
				target[i] = source[i-1];
			}
	
		}
		return target;
		
		
	}
	

}
	
