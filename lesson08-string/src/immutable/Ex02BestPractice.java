package immutable;

public class Ex02BestPractice {
	private static final int N = 1000000;
	public static void main(String[] args) {
		//Best Practice ==> 100% using literal
		long start = System.currentTimeMillis();
		for (int i = 1; i <= N; i++) {
			String l1 = "hello";
			String l2 = "hello";
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + 
				(System.currentTimeMillis() - start) + "ms");
		//literal
		
		//STACK: 100
		//HEAD: 1(tr¨´ng nhau)
		
		for (int i = 1; i <= N; i++) {
			String o1 = new String("hello");
			String o2 = new String("hello");
		}
		System.out.println("duration: " + 
				(System.currentTimeMillis() - start) + "ms");
		//object
		//STACK: 100
		//HEAD: 100 -->redundant memory for duplicate value
	}
}
