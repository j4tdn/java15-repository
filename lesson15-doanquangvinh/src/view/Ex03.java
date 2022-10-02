package view;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter random number :");
		int number = ip.nextInt();
		System.out.println(isHappyNumber(number));
	}

	public static boolean isHappyNumber(int number) {
		Set<Integer> nonDuplicateNumber = new LinkedHashSet<>();
		while (number != 1) {
			int tmp = number;
			int sum = 0;
			while (tmp > 0) {
				int digit = tmp % 10;
				sum += digit * digit;
				tmp = tmp / 10;
			}
			number = sum;
			if (nonDuplicateNumber.contains(number)) {
				return false;
			} else {
				nonDuplicateNumber.add(number);
			}
		}
		return true;
	}
}
