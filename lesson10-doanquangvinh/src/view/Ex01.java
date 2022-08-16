package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 3, 1 };
		int[] numbersv2 = { 7, 8, 8, 8, 6, 2, 5, 1 };

		// System.out.println(Arrays.toString(function(numbers)));
		function1(numbers);
		System.out.println(Arrays.toString(function1(numbers)));
		function2(numbers);
		function3(numbersv2);
	}

	private static int[] function1(int[] elements) {
		boolean[] flags = new boolean[elements.length];
		int[] results = new int[elements.length];
		int position = 0;
		for (int i = 0; i < flags.length - 1; i++) {
			for (int j = 0; j < flags.length; j++) {
				if (j != i && elements[j] == elements[i]) {
					flags[i] = true;
					flags[j] = true;

				}

			}
		}
		for (int i = 0; i < results.length; i++) {
			if (!flags[i]) {
				results[position++] = elements[i];
			}
		}
		return Arrays.copyOfRange(results, 0, position);
	}

	private static void function2(int[] numbers) {
		int location = numbers.length / 2;
		int S1 = 0;
		int S2 = 0;
		for (int i = 0; i < location; i++) {
			S1 += numbers[i];
		}
		for (int j = location; j < numbers.length; j++) {
			S2 += numbers[j];
		}
		System.out.println(S1);
		System.out.println(S2);
		double s1 = S1 / (double) location;
		double s2 = S2 / (double) location;
		System.out.println(s1);
		System.out.println(s2);
		if (s1 > s2) {
			System.out.println("Total of first n/2 > total of last n/2");
		} else if (s1 < s2) {
			System.out.println("Total of first n/2 < total of last n/2");
		} else {
			System.out.println("Equal");
		}
	}

	private static void function3(int[] numbers) {
		int maxValue = Integer.MIN_VALUE;
		Arrays.sort(numbers);
		maxValue = numbers[numbers.length - 1];
		int count = 2;
		for (int i = numbers.length - 2; i > 0; i--) {
			if (maxValue != numbers[i]) {
				maxValue = numbers[i];
				count--;
				if (count == 0) {
					System.out.println("The 3rd largest value :" + maxValue);

				}
			}

		}
	}

}
