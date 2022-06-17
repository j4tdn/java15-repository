package view;

import utils.ArrayUtils;

/**
 Bài 2 (15đ): Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1, n].
 Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
 
 VD1: n = 6, Ak = [3, 2, 1, 6, 5]
 --> Phần tử cần tìm có giá trị: 4
 
 VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
 --> Phần tử cần tìm có giá trị: 8
 */
public class Ex02MissingElement {
	public static void main(String[] args) {
		// General: Random n-1 elements which is from [1-n]
		// Finding missing element
		int[] numbers = { 3, 4, 1, 6, 5 };
		System.out.println("Missing element: " + findMissingNumber(numbers));
	}
	
	private static int findMissingNumber(int[] numbers) {
		int foundElement = 0;
		
		// Step 1: Sort array of number ascending, descending
		ArrayUtils.sort(numbers);
		
		// 1 2 3 4 5 6
		// T T T F T T
		// --> 1 2 3 5 6 (n-1)*n

		// Step 2: Iterate elements in array
		// If elements[i] != elements[i-1] + 1 ==> found = elements[i-1] + 1
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] - numbers[i - 1] != 1) {
				foundElement = numbers[i-1] + 1;
				break;
			}
		}
		return foundElement;
	}
}
