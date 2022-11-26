package view;

import java.util.Arrays;

public class Ex01Crud {
	public static void main(String[] args) {
		int[] numbers = {1, 9, 5, 36, 12, 33};
		int[] addedArray = add(numbers, 3, 99);
		int[] removeArray = remove(numbers,3);
		int[] insertArray = insert(numbers, 3, 99);
		System.out.println(Arrays.toString(removeArray));
		System.out.println(Arrays.toString(addedArray));
		System.out.println(Arrays.toString(insertArray));
		
	}
	private static int[] add(int[]elements,int pos,int newValue) {
		int [] newArray = new int[elements.length+1];
		for (int i =0; i< newArray.length; i++) {
			if(i < pos) {
				newArray[i] = elements[i];
			}
			if(i == pos) {
				newArray[i] = newValue;
			}
			if (i > pos) {
				newArray[i] = elements[i-1];
			}
			
		}
		return newArray;
	}
	private static int[] remove(int[] elements,int pos) {
		int [] newArray = new int[elements.length - 1];
		
		for(int i = 0; i < elements.length - 1; i++) {
			if(i < pos) {
				newArray[i] = elements[i];
			}
			if (i >= pos) {
				newArray[i] = elements[i + 1];
			}
		}
		
		return newArray;
		
	}
	
	private static int[] insert(int[]elements,int pos,int newValue) {
		int [] newArray = new int[elements.length+1];
		
		for (int i = 0; i < elements.length; i++) {
			newArray[i] = elements[i];
		}
		for(int i = newArray.length - 1; i > pos; i--) {
			newArray [i] = newArray [i-1];
		}
		
		newArray[pos] = newValue;
		return newArray;
		
	}
	
}
