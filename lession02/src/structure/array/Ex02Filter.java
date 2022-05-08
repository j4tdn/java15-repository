package structure.array;import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Tìm nhưng phần tử lẻ trong mảng số nguyên Input: Mảng outout: Mảng số lẻ
 * 
 * @author Admin
 *
 */

public class Ex02Filter {

	public static void main(String[] args) {
		int[] numbers = { 23, 25, 16, 28, 66 };
		int[] oddNumbers= findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}

	// int[] elements = number
	private static int[] findOddNumbers(int[] elements) {
		// index 0 1 2 3 4
		// value 0 0 0 0 0
		int[] OddRlements = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				OddRlements[count] = element;
				count++ ;
			}
		}
		int[] result = new int[count];
		for ( int i = 0 ; i < count; i++) {
			result[i] = OddRlements[i];
		}
		
		return result;
	}

}
