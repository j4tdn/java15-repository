package immutable;

public class Ex02BestPractice {
	private static final int N = 2000000;
	public static void main(String[] args) {
		//best practice --> 100% using literal
		long start = System.currentTimeMillis();
		for(int i = 1; i <= N; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start) + "ms");
		//STACK: 100 ô nhớ
		//HEAP: 1 ô nhớ
		
		start = System.currentTimeMillis();
		for(int i = 1; i <= N; i++) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
		}
		System.out.println("duration: " + (System.currentTimeMillis() - start) + "ms");
		//STACK: 100 ô nhớ
		//HEAP: 100 ô nhớ --> tốn bộ nhớ (redundant memory for duplicate value)
		
		
		
	}
}
