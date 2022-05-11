package view;

import java.util.Random;
import java.util.Scanner;

public class Ex04MaxOddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Length of array: ");
		int n = ip.nextInt();
		int[] array = new int[n];
		inputArray(array, n);
		outputArray(array, n);
		System.out.println("\n");
		System.out.print("Max Odd Number is: " + MaxOddNumber(array, n));
	}

	private static int MaxOddNumber(int[] array, int lengthOfArray) {
		int minOdd = 0;
		for (int i = 0; i < lengthOfArray; i++) {
			if (array[i] % 2 != 0 && array[i] > minOdd) {
				minOdd = array[i];
			}
		}
		return minOdd;
	}

	private static void inputArray(int arr[], int n) {
		Random rd = new Random();
		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(100);
		}
	}

	private static void outputArray(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			if (i % 10 == 0) {
				System.out.print("\n");
			}
			System.out.print("\t" + arr[i]);
		}
	}

}
