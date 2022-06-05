package ex02;

import java.util.Random;
import java.util.Scanner;

public class GetMissingNumber {
	public static void main(String[] args) {
		int[] array = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println(getMissingNumber(array));
	}

	private static int getMissingNumber(int[] array) {
		int[] tmpArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < tmpArray.length; i++) {
			for (int j = 0; j < array.length; j++) {

			}
		}
		int result = 0;
		for (int i = 1; i < (array.length + 1); i++) {
			if (i != array[i]) {
				result = i;
				break;
			}
		}
		return result;
	}

}
