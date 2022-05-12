package view;

import java.util.Scanner;

public class Ex04MaxOddOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println(" Nhap so phan tu cua Mang:");
		n = sc.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap gia tri cho phan tu " + i);
			array[i] = sc.nextInt();

		}
		System.out.println(" Gia trị lẻ lớn nhất là:" + FindMax(FindArrayOdd(array)));

	}

	private static int[] FindArrayOdd(int[] numbers) {
		int[] odd = new int[numbers.length];
		int count = 0;
		for (int number : numbers) {
			if (number % 2 != 0) {
				odd[count] = number;
				count++;

			}
		}

		return odd;
	}

	private static int FindMax(int[] numbers) {

		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}

		}
		return max;

	}
}
