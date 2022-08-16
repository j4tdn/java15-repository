package ex02;

import java.util.Arrays;

public class Sort {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		sort(strings, new CompareStringHelper() {

			@Override
			public int compare(String s1, String s2) {
				//DESC
				if (s2 == "Special") {
					return -1;
				}
				
				if (s1 == null) {
					return -1;
				}
				// s1!=null
				if (s2 == null) {
					return 1;
				}
				
				return s2.compareTo(s1);
			}
		});
		System.out.println("giảm dần: "+Arrays.toString(strings));
	
		sort(strings, new CompareStringHelper() {

			@Override
			public int compare(String s1, String s2) {
				//ASC
				if (s2 == "Special") {
					return 1;
				}
				
				if (s1 == null) {
					return 1;
				}
				// s1!=null
				if (s2 == null) {
					return -1;
				}
				
				return s1.compareTo(s2);
			}
		});
		System.out.println("tăng dần: "+Arrays.toString(strings));
		
	}

	// using strategy pattern
	// So sánh string --> sử dụng hàm compareTo
	private static void sort(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				// if (source[i].compareTo(source[i + 1]) > 0) {
				if (helper.compare(source[i], source[i + 1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
}