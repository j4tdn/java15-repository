package homework;

public class Ex02SumFactorial {
	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
		long sum = Factorial(a) + Factorial(b) + Factorial(c) + Factorial(d);
		System.out.println("Tổng giai thừa là: " + sum);
	}

	public static long Factorial(int n) {
		long result = 1;

		for (int i = n; i > 0; i--) {
			result = result * i;
		}
		return result;
	}
}
