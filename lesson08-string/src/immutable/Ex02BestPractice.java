package immutable;

public class Ex02BestPractice {
	private static final int N=50;
	public static void main(String[] args) {
		//literal
		long start  = System.currentTimeMillis();
		for(int i = 1; i<= N;i++) {
			String l1 = "Hello";
			String l2 = "Hello";
		}
		long end = System.currentTimeMillis();
		System.out.println("duration: " + (end - start) + "ms");
		//STACK: 50 ô nhớ tạo ra
		//HEAP: 1
		//object
		System.out.println("=================================");
		
		start  = System.currentTimeMillis();
		for(int i = 1; i<= N;i++) {
			String o1 = new String ("Hello");
			String o2 = new String ("Hello");
			System.out.println("duration: " + (System.currentTimeMillis() - start) + "ms");
		}
		//STACK: 100
		//HEAP: 100 -- redudant memory for duplopcate value
	}
}
