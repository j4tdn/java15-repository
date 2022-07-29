package immutable;

public class Ex02BestPractice {
	private static final int N = 200000;

	public static void main(String[] args) {
		// Best Practice ==> 100% using literal
		long start = System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		// STACK: 100
		// HEAP: 1
		start = System.currentTimeMillis();
		System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms"); // 1ms
		for (int i = 1; i <= N; i++) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
		}
		System.out.println("Duration: " + (System.currentTimeMillis() - start) + "ms"); // 2ms
		// STACK: 100
		// HEAP: 100 --> redundant memory for duplicate value
		
	}
}
