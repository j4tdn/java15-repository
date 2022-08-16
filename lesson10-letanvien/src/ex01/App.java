package ex01;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 3, 1 };
		int[] anotherArray = { 7, 8, 8, 8, 6, 2, 5, 1 };
		System.out.println("Array removed duplicate: " + Arrays.toString(removeDuplicate(numbers)));
		System.out.println("Compare First Hafl and Last Half: " + compareAverage(numbers));
		System.out.println("Third Largest Number: " + findThirdLargest(anotherArray, 3));
	}

	private static void sortDescending(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] < numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

	private static String compareAverage(int[] numbers) {
		if (numbers.length < 0) {
			return "Array cannot empty";
		}

		int result = 0;
		for (int i = 0; i < numbers.length / 2; i++) {
			result += numbers[i] - numbers[numbers.length - i - 1];
		}

		return (result < 0) ? "First half < Last Half"
				: ((result == 0) ? "First Half = Second Half" : "First Half > Last Half");
	}

	private static int[] removeDuplicate(int[] numbers) {
		int[] arr = new int[max(numbers) + 1];
		int[] result = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {
			arr[numbers[i]]++;
		}

		int index = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (arr[numbers[i]] == 1) {
				result[index++] = numbers[i];
			}
		}

		return Arrays.copyOfRange(result, 0, index);
	}

	private static int max(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int number : numbers) {
			max = (number > max) ? number : max;
		}

		return max;
	}

	private static int findThirdLargest(int[] numbers, int n) {
		sortDescending(numbers);
		int count = 1;
		int temp = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (temp > numbers[i]) {
				temp = numbers[i];
				count++;
				if (count == n) {
					return numbers[i];
				}
			}
		}

		return 0;
}
}