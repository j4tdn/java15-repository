package mutable;

public class Ex02SpeedTest {
	private static final int RUNNING = 100000;

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String immutable = "";
		for (int i = 1; i < RUNNING; i++) {
			
		immutable += i;

	}
	System.out.println("duration 01 : " + (System.currentTimeMillis() - start)+ "ms");
	
	StringBuilder mutable = new StringBuilder();
	start = System.currentTimeMillis();
	for(int i = 1; i < RUNNING; i++) {
		mutable.append(i);
	}
	System.out.println("duration 02: " + (System.currentTimeMillis() - start) + "ms");
}
}
