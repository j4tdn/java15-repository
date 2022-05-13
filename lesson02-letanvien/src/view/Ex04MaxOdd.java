package view;

public class Ex04MaxOdd {
	public static void main(String[] args) {
		int[] numbers = new int[] { 5, 1, 9, 11, 20, 19, 17, 21, 30 };
		int maxOddNumbers = findMaxOddNumbers(numbers);
		System.out.println((maxOddNumbers));
		findMaxOddNumbers(numbers);

	}

	private static int findMaxOddNumbers(int[] elements) {
		int maxOdd = elements[0];
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] % 2 != 0 && elements[i] > maxOdd) {
				maxOdd = elements[i];

			}

		}
		return maxOdd;

	}

}
