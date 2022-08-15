package view;

import java.util.Arrays;

import utils.CompareIntHelper;
import utils.SortUtils;

public class Ex03SelectionSort {
	public static void main(String[] args) {
		int[] numbers = {1, 5, 11, 9, 4, 6};
		sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		sort(numbers,(pre,next) -> pre > next);
		System.out.println(Arrays.toString(numbers));
		
		sort(numbers,(pre,next) -> pre < next);
		System.out.println(Arrays.toString(numbers));
	}
	
	private static void sort(int[] source) {
		for(int round = source.length-1; round > 0; round--) {
			for(int i = 0; i < round; i++) {
				//tăng dần
				if(source[i] > source[round]) {
					SortUtils.swap(source, i, round);
				}
				//giảm dần
				//if(source[i] < source[round]) {
				//SortUtils.swap(source, i, round);
				//}
			}
		}
	}
	
	private static void sort(int[] source, CompareIntHelper helper) {
		for(int round = source.length-1; round > 0; round--) {
			for(int i = 0; i < round; i++) {
				if(helper.compare(source[i], source[round])) {
					SortUtils.swap(source, i, round);
				}
			}
		}
	}
}
