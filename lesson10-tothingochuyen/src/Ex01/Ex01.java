package Ex01;

import java.util.Arrays;
import java.util.Random;

/**
 * Tạo mảng số nguyên ngẫu nhiên gồm n phần tử. Viết các phương thức:
Loại bỏ những phần tử trùng nhau VD: {1,2,3,4,3,1} Kết quả: {2,4}
So sánh giá trị trung bình của n/2 phần tử đầu tiên với n/2 phần tử cuối cùng
Tìm số lớn thứ 3 trong mảng. Lưu ý trường hợp các phần tử lớn nhất trùng
nhau VD: {7 8 8 8 6 2 5 1} Kết quả: 6
 * */
public class Ex01 {
	public static void main(String[] args) {
		int[] numbers = getArray(6);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("===================");
		System.out.println("After remove duplicate elements: " + Arrays.toString(removeDuplicateElements(numbers)));
		
		System.out.println("===================");
		if(compareAverage(numbers) > 0) {
			System.out.println("The mean of the first n/2 elements is BIGGER than the last n/2 elements");
		}else if(compareAverage(numbers) < 0) {
			System.out.println("The mean of the first n/2 elements is SMALLER than the last n/2 elements");
		}else {
			System.out.println("The mean of the first n/2 elements is EQUAL to than the last n/2 elements");
		}
		
		System.out.println("===================");
		int[] arr = {7, 8, 8, 8, 6, 2, 5, 1};
		System.out.println("The thirst largest number in the array: " + thirdLargestNumber(arr));
	}
	
	private static int[] getArray(int length) {
		Random rd = new Random();
		int[] arr = new int[length];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10);
		}
		return arr;
	}
	
	private static int[] removeDuplicateElements(int[] numbers) {
		int[] temp = new int[numbers.length];
		
		int index = 0;
		
		for(int i = 0; i < numbers.length; i++) {
			int count = 0;
			for(int j = 0; j < numbers.length; j++) {
				if(numbers[i] == numbers[j]) {
					count++;
				}
			}
			
			if(count == 1) {
				temp[index] = numbers[i];
				index++;
			}
		}
		
		return Arrays.copyOfRange(temp, 0, index);
	}
	
	private static int compareAverage(int[] numbers) {
		int k = numbers.length / 2;
		int sumLeft = 0;
		int sumRight = 0;
		int i = 0;
		
		while(i < k) {
			sumLeft += numbers[i];
			sumRight += numbers[numbers.length - i - 1];
			i++;
		}
		//System.out.println((float)sumLeft/k);
		//System.out.println((float)sumRight/k);
		return (sumLeft - sumRight) / k;
	}
	
	private static int thirdLargestNumber(int[] numbers) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		
		if(numbers.length <= 2) {
			System.out.println("Array's length must be better than 2");
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max1) {
				max1 = numbers[i];
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max2 && numbers[i] != max1) {
				max2 = numbers[i];
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max3 && numbers[i] != max1 && numbers[i] != max2) {
				max3 = numbers[i];
			}
		}
		
		return max3;
	}
}
