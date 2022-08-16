package view;

import java.util.Arrays;

import utils.CompareIntHelper;

public class Ex02BubleSortWithInt {
	public static void main(String[] args) {
		int[] a = {1,5,11,9,4,6};
		
//		CompareHelper helper = new CompareHelper() {
//			
//			@Override
//			public boolean compare(int pre, int next) {
//				
//				return pre > next;
//			}
//		};
		
		//instance about lambda expression
	//	CompareHelper helperAsc = (pre, next) ->  pre > next;
		
		
		
		bbs(a, (pre, next) ->  pre > next);
		
		System.out.println(Arrays.toString(a));
		
	}
	//Strategy Pattern
	//callback function
	private static void bbs(int[] a, CompareIntHelper helper) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-1-i;j++) {
				if(helper.compare(a[j], a[j+1])) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
	}
}
