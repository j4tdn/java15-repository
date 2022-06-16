package view;

import utils.ArrayUtils;

/**
 * Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1, n].
Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
VD1: n = 6, Ak = [3, 2, 1, 6, 5]
Phần tử cần tìm có giá trị: 4

VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
Phần tử cần tìm có giá trị: 8
*/
public class Ex02MissingElement {
	public static void main(String[] args) {
		//general: random n-1 elements which is from [1-n]
		//finding missing element
		int[] numbers1 = { 3, 2, 1, 6, 5};
		System.out.println("Missing element: " + findMissingNumber(numbers1));
		
		int[] numbers2 = { 3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println("Missing element: " + findMissingNumber(numbers2));
	}
	
	private static int findMissingNumber(int[] numbers) {
		int foundElement = 0;
		//step 1: sort array of number ascending, descending
		ArrayUtils.sort(numbers);
				
		ArrayUtils.printf(numbers);
		//step 2: iterate elements in array
		//If element[i] != elements[i-1] + 1 ==> found = element[i-1] + 1
		for(int i = 1; i< numbers.length; i++) {
			if(numbers[i] - numbers[i - 1] != 1) {
				foundElement = numbers[i - 1] + 1;
			}
		}
		return foundElement;	
	}
}
