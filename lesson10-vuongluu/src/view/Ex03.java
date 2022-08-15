package view;

import java.util.Arrays;

import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex03 {
	public static void main(String[] args) {
		String[] strings = { "-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx" };
		sortAsc(strings, new CompareStringHelper() {

			@Override
			public int compare(String s1, String s2) {
				if (s1 == "Special") {
					return -1;
				}
				if (s2 == "Special") {
					return 1;
				}
				if (s1 == null) {
					return 1;
				}
				if (s2 == null) {
					return -1;
				}
				if (s1.matches("-\\d*") && s2.matches("-\\d*")) {
					return Integer.parseInt(s1) - Integer.parseInt(s2);
				}
				if (s1.matches("\\d+") && s2.matches("\\d+")) {
					return Integer.parseInt(s1) - Integer.parseInt(s2);
				}

				return s1.compareTo(s2);
			}
		});
		System.out.println("=========tang dan=========");
		System.out.println(Arrays.toString(strings));
		sortDesc(strings, new CompareStringHelper() {

			@Override
			public int compare(String s1, String s2) {
				if (s1 == "Special") {
					return -1;
				}
				if (s2 == "Special") {
					return 1;
				}
				if (s1 == null) {
					return 1;
				}
				if (s2 == null) {
					return -1;
				}
				if (s1.matches("-\\d*") && s2.matches("-\\d*")) {
					return Integer.parseInt(s1) - Integer.parseInt(s2);
				}
				if (s1.matches("\\d+") && s2.matches("\\d+")) {
					return Integer.parseInt(s1) - Integer.parseInt(s2);
				}

				return s1.compareTo(s2);
			}
		});
		System.out.println("=========giam dan=========");
		System.out.println(Arrays.toString(strings));

	}

	private static void sortAsc(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1]) > 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
	private static void sortDesc(String[] source, CompareStringHelper helper) {
		for (int round = 0; round < source.length; round++) {
			for (int i = 0; i < source.length - round - 1; i++) {
				if (helper.compare(source[i], source[i + 1]) < 0) {
					SortUtils.swap(source, i, i + 1);
				}
			}
		}
	}
}
