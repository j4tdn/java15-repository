package immutable;

public class Ex02BestPractice {
	private static final int N=5000000;
	
	public static void main(String[] args) {
		//Best Practice ==> 100% using literal
		
		long start=System.currentTimeMillis();
		for(int i=1; i<=N; i++) {
			String l1="Hello";
			String l2="Hello";
		}
		long end=System.currentTimeMillis();
		System.out.println("Duration: "+ (end-start)+"ms");
		//HEAP:1
		//STACK:100
		
		start=System.currentTimeMillis();
		for(int i
				=1; i<=N; i++) {
			String o1= new String("Hello");
			String o2= new String("Hello");
			
		}
		System.out.println("Duration: "+ (System.currentTimeMillis()-start)+"ms");
		//HEAP:100
		//STACK:100 -> redundant memory for fuplicate value
	}
}
