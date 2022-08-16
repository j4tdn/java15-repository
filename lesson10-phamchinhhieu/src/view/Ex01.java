package view;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = {1,5,7,4,5,3, 1, 1,3,2,7};
		int[] foundElements  = deleteDuplicateElement(numbers);
		System.out.println(Arrays.toString(foundElements));
	}
	
	private static int[] deleteDuplicateElement(int[] elements) {
		boolean[] flags = new boolean[elements.length];
		int count = 0;
		for(int i = 0; i < elements.length -1; i++) {
			for(int j = i + 1; j < elements.length; j++) {
				if(elements[i] == elements[j] && i != j) {
					flags[i] = true;
					flags[j] = true;
				}
			}
		}
		int[] result = new int[elements.length];
		for(int i = 0; i < flags.length; i++) {
			if(!flags[i]) {
				result[count++] = elements[i];
			}
		}
		
		return Arrays.copyOfRange(result, 0, count);
	}
}
	