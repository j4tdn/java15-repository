package structure.array;

import java.util.Arrays;

/**
 * 1. Tìm những phần tử lẻ trong mảng số nguyên input: Mảng output: Mảng số lẻ
 * 2.
 *
 */
public class Ex02Filter {
	public static void main(String[] args) {
		int[] number = { 13, 24, 35, 33, 52 };
		int[] oddNumbers = findOddNumbers(number);
		System.out.println(Arrays.toString(oddNumbers));

	}

	private static int[] findOddNumbers(int[] elements) {
		// index 0 1 2 3 4
		// value 0 0 0 0 0

		int[] oddelements = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				oddelements[count] = element;
				count++;

			}
		}
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = oddelements[i];
		}

		return result;

	}
}
