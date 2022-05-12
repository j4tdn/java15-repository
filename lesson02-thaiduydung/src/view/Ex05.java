package view;

public class Ex05 {
	public static void main(String[] args) {
		int N = 30, surplus , K = 0;
		int[] a = new int[50];
		do {
			surplus = N % 2;
			a[K] = surplus;
			K++;
			N = N / 2;
		} while (N > 0);
		System.out.print("binary range: ");
		for (int i = K - 1; i >= 0; i--)
			System.out.print(a[i]);
	}
}