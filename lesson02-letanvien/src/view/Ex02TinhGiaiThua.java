package view;

public class Ex02TinhGiaiThua {

	public static void main(String[] args) {
		int a = 4;
		int b = 7;
		int c = 12;
		int d = 18;
		long aGiaiThua = factorial(a);
		long bGiaiThua = factorial(b);
		long cGiaiThua = factorial(c);
		long dGiaiThua = factorial(d);
		System.out.println("Factorial of a is : " + aGiaiThua);
		System.out.println("Factorial of b is : " + bGiaiThua);
		System.out.println("Factorial of c is : " + cGiaiThua);
		System.out.println("Factorial of d is : " + dGiaiThua);
		long FactorialTotal = aGiaiThua + bGiaiThua + cGiaiThua + dGiaiThua;
		System.out.println("Factorial Total : " + FactorialTotal);
	}

	public static long factorial(int n) {
		long giai_thua = 1;
		if (n == 0 || n == 1) {
			return giai_thua;
		} else {
			for (int i = 1; i <= n; i++) {
				giai_thua *= i;
			}
			return giai_thua;
		}
	}
}