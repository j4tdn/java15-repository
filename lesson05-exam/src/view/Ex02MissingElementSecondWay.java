package view;

/**
 * Bài 2 (15đ): Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1,
 * n]. Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
 * 
 * VD1: n = 6, Ak = [3, 2, 1, 6, 5] --> Phần tử cần tìm có giá trị: 4
 * 
 * VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10] --> Phần tử cần tìm có giá
 * trị: 8
 */
public class Ex02MissingElementSecondWay {
	public static void main(String[] args) {
		// General: Random n-1 elements which is from [1-n]
		// Finding missing element
		int[] numbers = { 3, 2, 6, 4, 5 };
		System.out.println("Missing element: " + findMissingNumber(numbers));
	}

	private static int findMissingNumber(int[] numbers) {
		// Step 1: Find max element = elements.length + 1 ==> N = 6
		int N = numbers.length + 1;

		// Step 2: Find sum of N elements = N*(N+1)/2 ==> SUM = 21
		int sum = N * (N + 1) / 2;

		// Step 3: SUM(21) - SUM(numbers[k])(19) = 2
		int sumOfElements = 0;
		for (int number : numbers) {
			sumOfElements += number;
		}

		return sum - sumOfElements;
	}
}