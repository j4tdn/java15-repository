package view;

import java.util.Arrays;

import utils.Swap;

public class Ex01 {
	public static void main(String[] args) {
		int[] numbers1 = {1,2,3,4,3,1};
		
		int[] numbers3 = { 7, 8, 8, 8, 6, 2, 5, 1 };
		
		int[] a = deleteElement(numbers1);
		System.out.println(Arrays.toString(a));
		System.out.println("first > second? :" + compare(numbers3));
		System.out.println("=============");
		int[] b = newarr(numbers3);
		int n = b.length;
		sort(b);
		System.out.println("3rd place: " + b[n - 3]);
	}

	private static int[] deleteElement(int[] numbers) {
		int n = numbers.length;
		int[] tmps = new int[n];

		boolean[] checks = new boolean[n];
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					checks[i] = true;
					checks[j] = true;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			if (!checks[i]) {
				tmps[count++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(tmps, 0, count);
	}

	private static void sort(int[] source) {

		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				if (source[j] > source[j + 1]) {
					Swap.swap(source, j, j + 1);
				}
			}
		}
	}

	private static boolean compare(int[] numbers) {
		int n = numbers.length;
		int a = 0;
		int b = 0;
		for (int i = 0; i < n / 2; i++) {
			a += numbers[i];
		}
		for (int i = n / 2; i < n; i++) {
			b += numbers[i];
		}
		return a > b;
	}

	private static int[] newarr(int[] numbers) {
		int[] tmps = new int[numbers.length];
		int n = numbers.length;
		boolean[] checks = new boolean[n];
		int count = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					checks[j] = true;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			if (!checks[i]) {
				tmps[count++] = numbers[i];
			}
		}
		return Arrays.copyOfRange(tmps, 0, count);
	}
}
