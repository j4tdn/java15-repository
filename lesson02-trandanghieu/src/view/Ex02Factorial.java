package view;

public class Ex02Factorial {
	public static void main(String[] args) {
		
		System.out.println(Factorial(4)+Factorial(7)+Factorial(12)+Factorial(18));

	}

	private static long Factorial(int n) {
		long factorial = 1;
		if (n == 0 || n == 1) {
			return factorial;
		} else {
			for (int i = 2; i <= n; i++) {

				factorial = factorial * i;

			}
			return factorial;
		}
	}
}
