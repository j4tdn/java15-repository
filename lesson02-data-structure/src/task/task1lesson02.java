package task;

import java.util.Scanner;

public class task1lesson02 {
	private static int ham(int n) {
		if (n == 0 || n == 1)
			return 0;
		int x = n / 2;
		int y = n % 2;
		if (y == 1)
			return 1;
		return ham(x);
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so:\t");
		int n = ip.nextInt();
		int k = ham(n);
		if (k == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
