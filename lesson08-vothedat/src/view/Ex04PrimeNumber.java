package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04PrimeNumber {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int a = Integer.parseInt(ip.nextLine());
		int b = Integer.parseInt(ip.nextLine());
		int[] x = primenumber(number(a));
		int[] y = primenumber(number(b));
		int cnt = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (x[i] == y[j])
					cnt++;
			}
		}
		if(cnt == x.length && cnt == y.length) System.out.println("YES");
		else System.out.println("NO");
	}

	private static int[] number(int a) {
		int result[] = new int[1000];
		int rid = 0;
		for (int i = 2; i <= a; i++) {
			if (a % i == 0)
				result[rid++] = i;
		}
		return Arrays.copyOfRange(result, 0, rid);
	}

	private static int[] primenumber(int[] a) {
		int result1[] = new int[a.length];
		int rid1 = 0, count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int k = 2; k <= Math.sqrt(a[i]); k++) {
				if (a[i] % k == 0)
					count++;
			}
			if (count == 0)
				result1[rid1++] = a[i];
			count = 0;
		}
		return Arrays.copyOfRange(result1, 0, rid1);
	}
}
