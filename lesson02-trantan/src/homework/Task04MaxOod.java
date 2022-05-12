package homework;

import java.util.Scanner;

public class Task04MaxOod {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		
		System.out.println("Max odd number: "+findMaxOod(numbers));
	}
	public static int findMaxOod(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter number: ");
			numbers[i] = sc.nextInt();
		}
		int maxOod = numbers[0];
		for (int number : numbers) {
			if (number % 2 != 0 && number > maxOod) {
				maxOod = number;
			}
		}
		return maxOod;
	}
}
