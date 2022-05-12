package view;

public class Ex02Factorial {
	public static void main(String[] args) {
		float sum = 0;
		sum = factorialOf(4) + factorialOf(7) + factorialOf(12) + factorialOf(18) ;
		System.out.println(sum);
	}
	private static long factorialOf(int num) {
		long result = 1;
		for (int i = 1; i <= num; i++) {
			result = result * i;
		}
		return result;
	}
}
