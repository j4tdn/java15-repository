package immutable;

public class Ex02BestPractice {
	private static final int N = 100000;
	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		for(int i = 1; i<=N; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end-start));
		
		
		//STACK will create 100 memory area.
		//HEAP create 1
		long s = System.currentTimeMillis();
		for(int i = 1; i<=N; i++) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
		}
		long t = System.currentTimeMillis();
		System.out.println("duration: " + (t-s));
		//STACK will create 100 memory area.
		//HEAP create 100 --> redundant memory for duplicate value
		
	}
}
