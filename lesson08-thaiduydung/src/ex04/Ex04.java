package ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		long input1 = checkInput();
		long input2 = checkInput();
		
		if (Arrays.equals(primeFactorisation(input1), primeFactorisation(input2))) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
	
	private static long checkInput() {
		do {
			try {
				System.out.print("Enter a number: ");
				long input = sc.nextLong();
				return input;
			} catch (Exception e) {
				System.err.println("Input must be a number! Enter again: ");
				sc.nextLine();
			}
		} while (true);
	}
	
	private static long[] primeFactorisation(long input) {
		long[] primeArray = new long[20];
		int count = 0;
		int prime = 2;
		// lưu các thừa số nguyên tố vào mảng
		while (input > 1) {
			if (input % prime == 0) {
				input /= prime;
				primeArray[count++] = prime;
			} else {
				prime++;
			}
		}
		// kiểm ra các thừa số nguyên tố đã tồn tại trong mảng chưa?
		// nếu đã tồn tại thì gán = 1
		for (int i = 0; i < primeArray.length; i++) {
			for (int j = 0; j < primeArray.length; j++) {
				if (i != j && primeArray[i] == primeArray[j]) {
					primeArray[j] = 1;
				}
			}
		}
		// tạo một mảng để lưu kết quả
		long[] result = new long[primeArray.length];
		int length = 0;
		for (int i = 0; i < primeArray.length; i++) {
			if (primeArray[i] > 1) {
				result[length++] = primeArray[i];
			}
		}
		return Arrays.copyOfRange(result, 0, length);
	}
}