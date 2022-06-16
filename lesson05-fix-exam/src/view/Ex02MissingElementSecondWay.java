package view;
/**
 * Cho mảng A gồm n-1 phần tử, giá trị của phần tử thứ k, Ak = [1, n].
Tìm số nguyên còn lại trong khoảng [1, n] không tồn tại trong mảng A.
VD1: n = 6, Ak = [3, 2, 1, 6, 5]
Phần tử cần tìm có giá trị: 4

VD2: n = 10, Ak = [3, 7, 9, 2, 1, 6, 5, 4, 10]
Phần tử cần tìm có giá trị: 8
*/
public class Ex02MissingElementSecondWay {
	public static void main(String[] args) {
		//general: random n-1 elements which is from [1-n]
		//finding missing element
		int[] numbers1 = { 3, 2, 1, 6, 5};
		System.out.println("Missing element: " + findMissingNumber(numbers1));
				
		int[] numbers2 = { 3, 7, 9, 2, 1, 6, 5, 4, 10};
		System.out.println("Missing element: " + findMissingNumber(numbers2));
	}
	
	private static int findMissingNumber(int[] numbers) {
		//step 1: find max element
		int N = numbers.length + 1;
		
		//step 2: find sum of N elements
		int sum = N * (N + 1) / 2;
		
		//step 3: sum(21) - sum(number[k])(19)=2
		int sumOfElements = 0;
		for(int number: numbers) {
			sumOfElements += number;
		}
		
		return sum - sumOfElements;
	}
}
