package exam;

import java.util.Random;

public class Task02MissingNumber {
	public static int getMissingNumber(int n) {
		int[] numbers = new int[n - 1];
		Random rd = new Random();
		for (int i = 0; i < n - 2; i++) {
			numbers[i] = rd.nextInt(n-1)+1;
		}
		int missingNumber = 1;
		for (int i = 0; i < numbers.length; i++) {
			
		}
	}
}
