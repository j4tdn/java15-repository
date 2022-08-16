package view;

import java.util.Arrays;

public class Ex05QuickSort {
	public static void main(String[] args) {
		int[] a = {1,5,11,9,4,6};
		qsort(a, 0, 5);
		System.out.println(Arrays.toString(a));
	}
	
	private static void qsort(int[] a, int l, int r) {
		int i =l, j =r;
		int key = a[(i+j)/2];
		while(i<j) {
			while(a[i]<key) i++;
			while(a[j]>key) j--;
			if(i<=j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;j--;
			}
			if(i<r) qsort(a, i, r);
			if(j>l) qsort(a, l, j);
		}
		
		
	}
}
