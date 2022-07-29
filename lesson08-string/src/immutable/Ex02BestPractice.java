package immutable;

import java.util.Iterator;

public class Ex02BestPractice {
	private static final int N = 50000;

	public static void main(String[] args) {
		// best practice ==> 100% using literal

		for (int i = 1; i <= N; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}

		long start = System.currentTimeMillis();

		for (int i = 1; i <= N; i++) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
		}
		long end = System.currentTimeMillis();
		System.out.println("duration:" + (end - start) + "ms");
	}
}
