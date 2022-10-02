package view;

import java.util.HashSet;
import java.util.Set;

public class Ex03IsHappy {
	private static boolean isHappy(int n) {
		Set<Integer> test = new HashSet<Integer>();
		int squareSum, remain;
		while (test.add(n)) {
			squareSum = 0;
			while (n > 0) {
				remain = n % 10;
				squareSum += remain * remain;
				n /= 10;
			}
			if (squareSum == 1)
				return true;
			else
				n = squareSum;
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 7;
		System.out.print(isHappy(n));
	}
}
