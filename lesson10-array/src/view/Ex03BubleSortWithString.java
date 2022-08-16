package view;

import java.util.Arrays;

import utils.CompareStringHelper;

public class Ex03BubleSortWithString {
	public static void main(String[] args) {
		String[] sequences = {"Alex",null,null, "Terry", "Rivaldo", "Blue", "Zill"};
		SortHandleNullLast(sequences);
		System.out.println(Arrays.toString(sequences));
		System.out.println("==========Using Strategy==========");
		String[] items = {null,"Item 1", "Item 3", "Item 2", "Item 4", "Item 11"};
		bbs(items, new CompareStringHelper() {
			
			@Override
			public int compare(String pre, String next) {
				//S1: NULL first
				if(pre == null) return -1;
				if(next == null) return 1;
				//S2: ASC
				return pre.compareTo(next);
			}
		});
		System.out.println(Arrays.toString(items));
	}
	
	//using Strategy pattern
	private static void bbs(String[] a, CompareStringHelper helper) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-1-i;j++) {
				if(helper.compare(a[j], a[j+1]) > 0) {
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
	}
	
	//compare String using function compareTo
	//handle null value --> using null first, null last : replace null to first or last
	//after objects different null -> sort
	private static void SortHandleNullFirst(String[] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-1-i;j++) {
				//step 1: handle null last
				if(a[j] == null ) {
					continue;
				}
				if(a[j+1] == null) {
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					continue;
				}
					
				//step 2: objects different null -> sort
				if(a[j].compareTo(a[j+1])>0) {
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
	}
	
	private static void SortHandleNullLast(String[] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-1-i;j++) {
				//step 1: handle null first
				if(a[j+1] == null ) {
					continue;
				}
				if(a[j] == null) {
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					continue;
				}
					
				//step 2: objects different null -> sort
				if(a[j].compareTo(a[j+1])<0) {
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
	}
	
	//compare String using function compareTo
	private static void bbs(String[] a) {
		for(int i = 0; i<a.length;i++) {
			for(int j = 0; j<a.length-1-i;j++) {
				if(a[j].compareTo(a[j+1])>0) {
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
			}
		}
	}
	
	//private static void selectionSortKeepCurrentPositionNullValue(...) xem code a Quyen
}
