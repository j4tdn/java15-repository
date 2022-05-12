package view;

import java.util.Random;
import java.util.Scanner;

public class Ex07RandomNumber {
	private static Scanner sc = new Scanner(System.in);

	// Validation only positive value (n >= 0)
	private static int inputPositiveValueOnly(String promt, String error) {
		int n;
		while (true) {
			System.out.print(promt);
			String nInText = sc.nextLine();
			if (nInText.matches("\\d+")) {
				n = Integer.parseInt(nInText);
				break;
			} else {
				System.out.println(error);
			}
		}
		return n;
	}

	/**
	 * Hàm trả về một mảng có size = amount, mỗi phần từ là random từ min -> max
	 * @param amount
	 * @param min
	 * @param max
	 * @return Array gồm các phần tử số nguyên là random number từ min -> max
	 */
	private static int[] generateRandomNums(int amount, int min, int max) {
		int[] randomNums = new int[amount];
		for(int i = 0; i < randomNums.length; i++) {
			randomNums[i] = new Random().nextInt(max - min + 1) + min;
			if(i > 0) {
				for(int j = 0; j <= i - 1; j++) {
					if(randomNums[j] == randomNums[i]) {
						i--;
					}
				}
			}
		}
		return randomNums;
	}
	public static void main(String[] args) {
		int min = 20, max = 30;
		int size = inputPositiveValueOnly("Nhap so luong random number: ", "Invalid number! Please try again!");
		int[] randomNums = generateRandomNums(size, min, max);
		for(int x : randomNums) {
			System.out.print(x+" ");
		}
	}
}
