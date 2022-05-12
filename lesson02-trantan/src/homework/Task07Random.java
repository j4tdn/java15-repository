package homework;

import java.util.Arrays;
import java.util.Random;

public class Task07Random {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(random5times()));
	}

	private static int[] random5times() {
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(20, 30);
		}
		return numbers;
		//em không làm được ạ =((
	}		
}