package sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		int[] input = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int[] head = new int[input.length];
		int[] betweed = new int[input.length];
		int[] last = new int[input.length];
		int[] results = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 7 == 0 && input[i] % 5 != 0) {
				head[count1] = input[i];
				count1++;

			} else if (input[i] % 5 == 0 && input[i] % 7 != 0) {
				last[count3++] = input[i];

			} else {
				betweed[count2++] = input[i];
			}

		}

		head = Arrays.copyOf(head, count1);
		betweed = Arrays.copyOf(betweed, count2);
		last = Arrays.copyOf(last, count3);

		System.arraycopy(head, 0, results, 0, count1);
		System.arraycopy(betweed, 0, results, count1, count2);
		System.arraycopy(last, 0, results, count1 + count2, count3);
		for (int i = 0; i < input.length; i++) {
			System.out.print(results[i] + ",");
		}

	}
}
