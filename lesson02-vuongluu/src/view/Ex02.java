package view;

public class Ex02 {
	public static void main(String[] args) {
		long sum = factorial(4) + factorial(7) + factorial(12) + factorial(8);
		System.out.println("Tong giai thua: " + sum);
		long sum1 = factorial1(4) + factorial1(7) + factorial1(12) + factorial1(8);
		System.out.println("tong giai thua:" + sum1);
	}

	private static long factorial(int s) {
		long s1 = 1;
		if (s == 0 && s1 == 1) {
			return s1;
		} else {
			for (int i = 2; i <= s; i++) {
				s1 *= i;
			}
			return s1;
		}

	}

	// recursion
	private static long factorial1(int s) {
		if (s > 0) {
			return s * factorial1(s - 1);
		} else {
			return 1;
		}
		}
}
