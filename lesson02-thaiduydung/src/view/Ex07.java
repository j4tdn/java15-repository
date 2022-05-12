package view;

import java.util.Random;


public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] arr = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = 20 + rd.nextInt(11);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(sieve(arr)[i] + " ");
		}
	}

	public static int[] sieve(int[] oldArray) {
		Random rd = new Random();
		int[] newArray = oldArray;
		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray.length; j++) {
				if (i != j && newArray[i] == newArray[j]) {
					newArray[i] = 20 + rd.nextInt(11);
				}
			}
		}
		return newArray;
	}
}