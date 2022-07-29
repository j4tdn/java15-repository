package immutable;

import java.util.Iterator;

public class Ex02BestPractice {
	private static final int N = 20000;
	public static void main(String[] args) {
		//best practice ==> 1--% using literal
		
		long start = System.currentTimeMillis();
		
		for (int i = 1; i <= N; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
			//Stack : 100
			//Heap : 1
		}
		
		System.out.println("duration:" +(System.currentTimeMillis()-start) +"ms");
		start = System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
			//Stack : 100
			//Heap : 100
		}
		System.out.println("duration:" +(System.currentTimeMillis()-start) +"ms");
	}
}
