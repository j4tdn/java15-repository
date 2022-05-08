package structure.array;

import java.util.Arrays;

/**
 * 
 *1. Tìm những phần tử lẽ trong mảng số nguyên
 */
public class Ex02_Filter {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		int[] oddNumbers = findoddNumber(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}
	private static int[] findoddNumber(int[] elements) {
		int[] oddElement = new int[elements.length];
		int dem = 0;
		for( int element : elements) {
			if(element % 2 != 0) {
				oddElement[dem] = element;
				dem++;
			}
		}
		int[] result = new int[dem];
		for(int i = 0; i < dem; i++) {
			result[i] = oddElement[i];
		}
		return result;
		
	}
}
