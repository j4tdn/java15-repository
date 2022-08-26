package ex01;

import java.util.Arrays;
import java.util.Random;

public class EX01 {
	private static Random rd = new Random();

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10);
		}
		System.out.println("Original array: " + Arrays.toString(arr));
		System.out.println("----------------------");
		System.out.println("Array after remove loop elements: " + Arrays.toString(getUniqueElement(arr)));
		System.out.println("----------------------");
		System.out.println("avg5first is larger than avg5last: " + compareToAvg(arr));
		System.out.println("----------------------");
		insertionSort(arr);
		System.out.println("Array after sorted: " + Arrays.toString(arr));
		System.out.println("----------------------");
		System.out.println("The third lagest element in array is: " + getLargestElementByIndex(arr, 3));
	}

	private static int[] getUniqueElement(int[] a) {
		int[] result = new int[a.length];
		int tmp = 0;

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				result[tmp++] = a[i];
			}
		}
		return Arrays.copyOfRange(result, 0, tmp);
	}

	private static boolean compareToAvg(int[] a) {
		double avg5first = Arrays.stream(Arrays.copyOfRange(a, 0, 5)).average().getAsDouble();
		double avg5last = Arrays.stream(Arrays.copyOfRange(a, 5, a.length)).average().getAsDouble();
		System.out.println("avg5first: " + avg5first + " - avg5last: " + avg5last);
		return avg5first > avg5last;
	}

	private static void insertionSort(int[] a) {
		int pos = 0;
		int value = 0;

		for (int i = 0; i < a.length; i++) {
			value = a[i];
			pos = i;
			while (pos > 0 && a[pos - 1] > value) {
				a[pos] = a[pos - 1];
				pos = pos - 1;
			}
			a[pos] = value;
		}
	}

	private static int getLargestElementByIndex(int[] a, int index) {
		insertionSort(a);
		int n = a.length - 1;
		while (index >= 1) {
			if (a[n] == a[n - 1]) {
				n -= 1;
			} else {
				n -= 1;
				index--;
			}
		}
		return a[n + 1];
	}
}