package view;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex01_CRUD {
	public static void main(String[] args) {
		int[] numbers = { 1, 9, 5, 36, 12, 33 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		int[] aa = add(numbers, 2, 6);
		for (int i = 0; i < aa.length; i++) {
			System.out.print(aa[i] + " ");
		}
		System.out.println();
		System.out.println();
		int[] aaa = remove(numbers, 3);
		for (int i = 0; i < aaa.length; i++) {
			System.out.print(aaa[i] + " ");
		}
	}

	private static int[] add(int[] elements, int pos, int newValue) {
		int[] a = new int[elements.length + 1];
		for (int i = 0; i < a.length; i++) {
			if (i < pos) {
				a[i] = elements[i];
			} else if (i == pos) {
				a[i] = newValue;
			} else {
				a[i] = elements[i - 1];
			}
		}
		return a;

	}

	private static int[] remove(int[] elements, int pos) {
		int[] a = new int[elements.length];
		for (int i = 0; i < a.length; i++) {
			a[i] = elements[i];
		}
		for (int i = pos; i < a.length - 1; i++) {
			a[i] = elements[i + 1];
		}
		return Arrays.copyOfRange(a, 0, a.length - 1);
	}
}
