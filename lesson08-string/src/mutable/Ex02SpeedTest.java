package mutable;

public class Ex02SpeedTest {
	private static final int RUNNING = 100000;
	
	public static void main(String[] args) {
		String immutable = "";
		for (int i = 0; i <= RUNNING; i++) {
			immutable +=i;
			
		}
		System.out.println("duration 01: " +(System.currentTimeMillis() - start) + "ms");
	}
}
