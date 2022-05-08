package structure.array;

import java.util.Arrays;

/**
 * 1. Tim nhung phan tu le? trong mang? so' nguyen Input : Mang? Output : Mang?
 * nhung~ so' le?
 *
 */
public class Ex02Filter {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] Oddnumbers = findOddnumbers(numbers);
		System.out.println(Arrays.toString(Oddnumbers));
	}

	private static int[] findOddnumbers(int[] elements) {
		int[] Odds = new int[elements.length];
		int count = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				Odds[count] = element;
				count++;
			}
		}
		int[] result = new int[count];
		for (int i = 0; i < count; i++) {
			result[i] = Odds[i];
		}
		return result;
	}
}
