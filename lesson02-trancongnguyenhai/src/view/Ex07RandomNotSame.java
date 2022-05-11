package view;

import java.util.Random;

public class Ex07RandomNotSame {
	public static void main(String[] args) {
		int[] array = new int[5];
		System.out.print("Input:");
		do {
			inputArray(array, 5);
		} while (isSame(array) == false);
		outputArray(array, 5);
	}

	private static boolean isSame(int[] array) {
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (array[i] == array[j]) {
					return false;
				}
			}
		}
		return true;
	}

	private static void inputArray(int arr[], int n) {
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(19, 31);
		}
	}

	private static void outputArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			if (i % 10 == 0) {
				System.out.print("\n");
			}
			System.out.print("\t" + arr[i]);
		}
	}
}
