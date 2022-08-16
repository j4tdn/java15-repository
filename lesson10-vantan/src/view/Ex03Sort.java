package view;

import java.util.Arrays;

import utils.CompareStringHelper;

import static utils.CrudUtils.*;

public class Ex03Sort {
	public static void main(String[] args) {
		String[] squences ={"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
				//{"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		sortHandleNullFirst(squences, new CompareStringHelper() {
			
			@Override
			public int compare(String s1, String s2) {
				
				if(s1 == null) {
					return -1;
				}
				if(s2 == null) {
					return 1;
				}
				if(s1.equals("Special")) {
					return 1;
				}
				if(s2.equals("Special")) {
					return -1;
				}
				if(s1.matches("-\\d+") && s2.matches("-\\d+")) {
					return Integer.parseInt(s2) - Integer.parseInt(s1);
				}
				if(s1.matches("\\d+") && s2.matches("\\d+")) {
					return Integer.parseInt(s2) - Integer.parseInt(s1);
				}
				
				return s2.compareTo(s1);
								
			}
				
				
		});
		System.out.println(Arrays.toString(squences));

	}
	private static void sortHandleNullFirst(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {				
				if(helper.compare(source[i], source[i+1]) > 0) {
					swap(source, i, i+1);
				}
				
			}
		}
		
	}
	private static void sortHandleNullLast(String[] source, CompareStringHelper helper) {
	for (int round = 0; round < source.length; round++) {
		for (int i = 0; i < source.length - round - 1; i++) {
			if(helper.compare(source[i], source[i+1]) < 0) {
				swap(source, i, i+1);
				}
			}
		}
	}
}
