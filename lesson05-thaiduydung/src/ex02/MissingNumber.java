package ex02;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		System.out.println("Enter size: ");
		int n = new Scanner(System.in).nextInt();
		int[] a = new int[n - 1];
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			while (!flag) {
				flag = true;
				a[i] = new Random().nextInt(n) + 1;
				for (int j = 0; j < i; j++) {
					if (a[j] == a[i]) {
						flag = false;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(getMissingNumber(a));
	}

	private static int getMissingNumber(int[] a) {
		int sumOfArr = 0;
		for (int i : a) {
			sumOfArr += i;
		}
		int sumOfNumber = 0;
		for (int i = 1; i <= a.length + 1; i++) {
			sumOfNumber += i;
		}
		return sumOfNumber - sumOfArr;
	}
}