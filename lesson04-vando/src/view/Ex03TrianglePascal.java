package view;

public class Ex03TrianglePascal {
	static int factorial(int n) {
		int f;
		for (f = 1; n > 1; n--) {
			f *= n;
		}
		return f;
	}

	static int ncr(int n, int r) {
		return factorial(n) / (factorial(n - r) * factorial(r));
	}

	public static void main(String args[]) {
		int n, i, j;
		n = 5;

		for (i = 1; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" " + ncr(i, j));
			}
			System.out.println();
		}
	}
}
