package immutable;

public class Ex02BestPractice {
	private static final int N = 50000;
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for(int i = 0; i<N; i++) {
		String l1 = "Hello";
		String l2 = "Hello";
		}
		long end= System.currentTimeMillis();
		System.out.println("duration: " +(end -start) +"ms" );
		start = System.currentTimeMillis();
	for(int i = 0; i<N; i++) {
		String o1 = new String("Hello");
		String o2 = new String("Hello");
	}
	System.out.println("duration: " +(System.currentTimeMillis() - start)+ "ms" );
	}
}
