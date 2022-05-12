package view;

import java.util.Scanner;

public class Ex04LargestOddNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("number of integer:");
		int input = ip.nextInt();
		int[] elements = new int[input];
		System.out.print("Enter number:");
		for (int i = 0; i < input; i++) {
			elements[i] = ip.nextInt();
			
		}
		System.out.println("The largest odd number is :" + LargestOddNumber(elements));

	}

	private static int LargestOddNumber(int[] input) {
		int max = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 1) {
				if (max < input[i]) {
					max = input[i];

				}
			}
		}
		return max;
	}
}

