package view;

import java.util.Arrays;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		int[] result = add(numbers, 2, 8);
		int[] insertArray = insert(numbers, 2, 8);
		int[] removedArray  = remove(numbers, 1);
	
		System.out.println("AddeArray: " +Arrays.toString(result));
		System.out.println("removedArray:" +Arrays.toString(removedArray));

	}
	private static int[] insert(int[] source, int pos, int newValue) {
		int []target = new int[source.length+1];
		for(int i = 0; i<source.length;i++) {
			target[i]= source[i];
			
		}
		for(int i = target.length- 1; i>pos;i--) {
			target[i] = target[i-1];
		}
		target[pos] = newValue;
		return target;
	}

	private static int[] add(int[] source, int pos, int newValue) {
		
		int[] target = new int[source.length + 1];
		for (int i = 0; i < pos; i++) {
			target[i] = source[i];
		}
		target[pos] = newValue;
		for (int i = pos + 1; i < target.length; i++) {
			target[i] = source[i - 1];
		}
		return target;

	}

	private static int[] remove(int[] source, int pos) {
		int [] target = new int[source.length];
		for(int i = 0; i<target.length;i++) {
			target[i] = source[i];
			
		}
		for(int i= pos;i < target.length-1;i++ ) {
			target[i] = target[i+1];
		}
		
		
		
   return Arrays.copyOfRange(target, 0, target.length- 1);
	}
}
