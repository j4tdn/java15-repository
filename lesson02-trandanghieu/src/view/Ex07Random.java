package view;

import java.util.Random;
import java.util.Scanner;

public class Ex07Random {
	public static void main(String[] args) {
		randomNumbers(5);
	}

	private static int[] randomNumbers(int n) {
		int[] array = new int[n];
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			array[i] = 20 + rd.nextInt(30 - 20 + 1);
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					i--;
					break;
				}
			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		return array;
	}
}
