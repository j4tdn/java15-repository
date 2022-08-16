package view;

import java.util.Arrays;

import common.SortDir;
import utils.CompareIntHelper;
import utils.SortUtils;

public class Ex02BubbleSortWithInt {

	public static void main(String[] args) {
		int[] numbers = { 1, 5, 11, 9, 4, 6 };
		//lambda
		sort(numbers, (pre,next) -> pre < next);
		System.out.println(Arrays.toString(numbers));
		sort(numbers, (pre,next) -> pre > next);
		System.out.println(Arrays.toString(numbers));
		
	}
		
	
		
	
	
	private static void sort(int[] source, SortDir sortDir) {
		
		for(int round = 0; round < source.length -1 ; round++) {
			for ( int j = 0 ; j < source.length-round-1; j++) {
				if (sortDir.equals(sortDir.ASC) && source[j] > source[j+1]) {
					SortUtils.swap(source,j,j+1);
				}
			}
		}
	}
	
//	private static boolean compareAsc ( int pre, int next) {
//		return pre > next; 
//			
//	}
//	private static boolean compareDesc ( int pre, int next) {
//		return pre < next; 
//	}
	
	// default --> asc(tang dan)
	private static void sort(int[] source, CompareIntHelper helper) {
		
		for(int round = 0; round < source.length -1 ; round++) {
			for ( int j = 0 ; j < source.length-round-1; j++) {
				if (helper.compare(source[j], source[j+1])) {
					SortUtils.swap(source,j,j+1);
				}
			}
		}
	}

}
