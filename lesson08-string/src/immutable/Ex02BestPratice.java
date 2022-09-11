package immutable;

public class Ex02BestPratice {
	private static final int N = 1000000000;
	public static void main(String[] args) {
		//Best pratice ==> 100% using litaral
		long start = System.currentTimeMillis();
		
		for (int i = 1; i <= N; i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		
		
		System.out.println("duration " + (System.currentTimeMillis()- start) + " ms");
		//Stack 100
		//heap 1
		
		for (int i = 1; i <= N; i++) {
			String o1 = new String("Hello");
			String o2 = new String("Hello");
		}
		//Stcak 100
		//heap 100 -->redudant memory 
		System.out.println("duration " + (System.currentTimeMillis() - start) + " ms");
	}
}
