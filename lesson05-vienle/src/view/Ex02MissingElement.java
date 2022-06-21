package view;

import utils.ArrayUtils;

public class Ex02MissingElement {
	public static void main(String[] args) {

		int[] numbers = { 3, 2, 1, 6, 5 };
		System.out.println("Missing elements : " + findMissingNumber(numbers));
	}

	private static int findMissingNumber(int[] numbers) {
		int foundElement = 0;
		ArrayUtils.sort(numbers);

		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] - numbers[i - 1] != 1) {
				foundElement = numbers[i - 1] + 1;
				break;
			}

		}
		return foundElement;

	}
}
