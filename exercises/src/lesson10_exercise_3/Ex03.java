package lesson10_exercise_3;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c",
				"b", "xx"};
		SortHandleNullLast(strings);
		System.out.println(Arrays.toString(strings));
		String s = "-122";
		System.out.println(Integer.parseInt(s));
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
				
				if(a[j] == "Special" ) {
					continue;
				}
				if(a[j+1] == "Special") {
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
}