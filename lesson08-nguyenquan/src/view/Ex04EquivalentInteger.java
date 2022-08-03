package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04EquivalentInteger {
	public static void main(String[] args) {
		long m, n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the m: ");
		m = scanner.nextLong();
		System.out.println("Enter the n: ");
		n = scanner.nextLong();
		if (equivalentInteger(m, n)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	private static boolean equivalentInteger(long m, long n) {

		int length = 0;
		int ridm = 0, ridn = 0;
		long[] wishOfm = new long[10000];
		long[] wishOfn = new long[10000];
		for (long i = 1; i <= n; i++) {
			if (n % i == 0) {
				if (checkPrime(i)) {
					wishOfn[ridn++] = i;
				}
			}

		}

		for (long i = 1; i <= m; i++) {
			if (m % i == 0) {
				if (checkPrime(i)) {
					wishOfm[ridm++] = i;
				}
			}
		}

		wishOfm = Arrays.copyOfRange(wishOfm, 0, ridm);
		wishOfn = Arrays.copyOfRange(wishOfn, 0, ridn);

		if (ridm != ridn) {
			return false;
		}
		for (int i = 0; i < ridm; i++) {
			if (wishOfm[i] != wishOfn[i]) {
				return false;
			}

		}
		return true;

	}

	private static boolean checkPrime(long n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
