package immutable;

public class Ex02BestPractice {
	private static final int N= 500000;
	// Nên dùng ==> Literal 
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (int i = 1; i<=N ; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		 start  = System.currentTimeMillis();
		//System.out.println("duration: " + (end - start) + "ms");
			System.out.println("duration: " + (System.currentTimeMillis() - start) + "ms");

		// Stack: 100
		//Heap: 1
		for (int i = 1; i<=N ; i++) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
			}
		System.out.println("duration: " + (System.currentTimeMillis() - start) + "ms");

	}
}
