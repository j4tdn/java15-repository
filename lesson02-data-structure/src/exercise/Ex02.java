package exercise;

public class Ex02 {
	public static void main(String[] args) {
		long sum;
		sum = factorialOf(4) + factorialOf(7) + factorialOf(12) + factorialOf(18);
		System.out.println(sum);
	}

	public static long factorialOf(int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
}
