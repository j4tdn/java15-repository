package view;

import java.util.Arrays;

import utils.CompareIntHelper;
import utils.SortUtils;

public class Ex02BubbleSortWithInt {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 11, 9, 4, 6};
		//sort(numbers);
		
		
		//anonymous class
		CompareIntHelper helper = new CompareIntHelper() {
			
			@Override
			public boolean compare(int pre, int next) {
				return pre > next;
				//return pre < next;
			}
		};
		
		//sort(numbers, helper);
		
		//anonymous function
		//gọi là landa
		sort(numbers,(pre,next) -> pre < next);
		System.out.println(Arrays.toString(numbers));
		
		sort(numbers,(pre,next) -> pre > next);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void sort(int[] source) {
		for(int round = 0; round < source.length; round++) {
			for(int i = 0; i < source.length - round - 1; i++) {
				//tăng dần
				if(source[i] > source[i+1]) {
					SortUtils.swap(source, i, i+1);
				}
				//giảm dần
				//if(source[i] > source[i+1]) {
				//SortUtils.swap(source, i, i+1);
				//}
			}
		}
	}
	
	private static void sort(int[] source, CompareIntHelper helper) {
		for(int round = 0; round < source.length; round++) {
			for(int i = 0; i < source.length - round - 1; i++) {
				if(helper.compare(source[i], source[i+1])) {
					SortUtils.swap(source, i, i+1);
				}
			}
		}
	}
	
	private static boolean compareAsc(int pre, int next) {
		return pre > next;
	}
	
	private static boolean compareDesc(int pre, int next) {
		return pre < next;
	}
}
