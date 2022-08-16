package view;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Ex01 {
	public static void main(String[] args) {
		Integer [] numbers = { 1, 2, 3, 4, 3, 1};
		removeDuplicateElements(numbers, numbers.length);
		System.out.println(getThirdMax(numbers));
	}
	//
	private static void removeDuplicateElements (Integer numbers[] , int n) {
		LinkedHashSet<Integer> hashSet = new  LinkedHashSet<>(Arrays.asList(numbers));
		  numbers = hashSet.toArray(new Integer[0]);
		System.out.println(Arrays.toString(numbers));
	}
	// tìm số lớn  thứ 3 trong mảng
	private static int getThirdMax(Integer[] numbers) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		for(int i =0; i < numbers.length;i++) {
			if(numbers[i] > first) {
				first = numbers[i];
			}
		}
		for(int i =0; i < numbers.length;i++) {
				if(numbers[i] < first && numbers[i] > second) {
					second = numbers[i];
		}
	}
		for(int i =0; i < numbers.length;i++) {
			if(numbers[i] < second && numbers[i] > third) {
				third = numbers[i];
			}
		}
		return third;
	}
}
