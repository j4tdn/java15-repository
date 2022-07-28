package immutable;

public class Ex02BestPractice {
	private static final int N = 500000;
	public static void main(String[] args) {
		
		//Best Practice ==> 100% using literal
		long start = System.currentTimeMillis();

		for(int i = 1; i<= N; i++ ) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		System.out.println("duration: " + (System.currentTimeMillis() - start) + "ms");

		// Stack: 100
		// Heap: 1
		
		for(int i = 1; i<= N; i++ ) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
		}

		// Stack: 100
		// Heap: 100
	}
}
