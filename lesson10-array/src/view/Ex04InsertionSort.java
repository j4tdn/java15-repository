package view;

import java.util.Arrays;

public class Ex04InsertionSort {
	public static void main(String[] args) {
		int[] a = {1,5,11,9,4,6};
		IS(a);
		System.out.println(Arrays.toString(a));
	}
	
	private static void IS(int[] a) {
		int j;
		for(int i = 1;i<a.length;i++) {
			int t = a[i];
			for(j = i-1;j>=0 && t < a[j];j--) {
				if(t<a[j]) {
					a[j+1] = a[j];
					a[j]=t;
				}
			}
			
			
		}
	}
	
}
