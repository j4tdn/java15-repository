package mutable;

public class Ex02_SpeedTest {
	private static final int RUNNING =10000;
	public static void main(String[] args) {
		String immutable = "";
		long start = System.currentTimeMillis();
		for(int i = 1; i <= RUNNING; i++) {
			immutable += i;
		}
		System.out.println("duration: " + (System.currentTimeMillis() - start) + "ms");
	
		StringBuilder mutable = new StringBuilder();
		start = System.currentTimeMillis();
		for(int i = 1; i <= RUNNING; i++) {
			mutable.append(i);
		}
		System.out.println("duration: " + (System.currentTimeMillis() - start) + "ms");
	
	
		
	}
}
