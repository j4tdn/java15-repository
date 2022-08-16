package view;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = { 3, 1, 2, 4, 3, 8, 7, 8, 8, 7, 0 };
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(getThirdLargestNum(numbers));

//		compare(numbers);
//		System.out.println(Arrays.toString(removeSameElement(numbers)));

	}

	//
	private static int[] removeSameElement(int[] source) {
		int[] result = new int[source.length];
		for (int i = 0; i < source.length - 1; i++) {

		}
		return source;
	}
	// so sanh gia tri trung binh cua nua dau va nua cuoi cua mang
	private static void compare(int[] source) {
		int firstNum;
		int lastNum;

		int sum = 0;
		int count = 0;
		for (int i = 0; i < source.length / 2; i++) {
			sum += source[i];
			count++;
		}
		firstNum = sum / count;
		sum = 0;
		

		for (int i = source.length / 2; i < source.length; i++) {
			sum += source[i];
			
		}
		lastNum = sum / count;

		if (firstNum > lastNum) {
			System.out.println("average value of first haft is greater than");
		}
		if (firstNum < lastNum) {
			System.out.println("average value of first haft is less than");
		} else {
			System.out.println("equals");
		}

	}
	// tim so lon thu 3 trong mang
	private static int getThirdLargestNum(int[] numbers) {
		int largestNum = Integer.MIN_VALUE;
		int secondLargestNum =  Integer.MIN_VALUE;
		int thirdLargestNum = Integer.MIN_VALUE;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > largestNum) {
				largestNum = numbers[i];

			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < largestNum && numbers[i] > secondLargestNum) {
				secondLargestNum = numbers[i];

			}

		}
		for (int i = 0 ; i < numbers.length; i++) {
			if(numbers[i] < secondLargestNum && numbers[i] > thirdLargestNum) {
				thirdLargestNum = numbers[i];
			}
		}

		return thirdLargestNum;
	}
	
	//xoa mot phan tu
	

}
