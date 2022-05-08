package structure.array;

import java.util.Arrays;
public class Ex02Filter {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		int[] oldNumbers = findOddNumbers(numbers);
		//for(int i : oldNumbers) System.out.println(i);
		System.out.println(Arrays.toString(oldNumbers));
	} 
	
	private static int[] findOddNumbers(int[] elements) {
			int[] result= new int[elements.length];
			int i=0;
			for( int element : elements) {
				if(element % 2 != 0 ) result[i++] = element;
			}
			return result;
	}
	
}

