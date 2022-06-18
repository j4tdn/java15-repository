package homework;

public class Ex03 {
	public static void main(String args[]) {
		int n, i, j;
		n = 7;

		for (i = 1; i <= n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" " + ncr(i, j));
			}
			System.out.println();
		}
	}
		public static int viwer(int n) {
			int a;
			for (a = 1; n > 1; n--) {
				a *= n;
			}
			return a;
		}

		public static int ncr(int n, int k) {
			return viwer(n) / (viwer(n - k) * viwer(k));
		}

		
	}

