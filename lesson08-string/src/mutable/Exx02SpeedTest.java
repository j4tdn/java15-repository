package mutable;

import java.time.Duration;

public class Exx02SpeedTest {
	private static final int RUNNING = 100000;

	public static void main(String[] args) {
		String immutable = "";
		long start = System.currentTimeMillis();
		for (int i = 1; i < RUNNING; i++) {
			immutable += 1;
		}
		System.out.println("duration 01: " + (System.currentTimeMillis() - start) + "ms");

		StringBuilder mutable = new StringBuilder();
		start = System.currentTimeMillis();
		for (int i = 1; i < RUNNING; i++) {
			mutable.append(i);
		}
		System.out.println("duration 02: " + (System.currentTimeMillis() - start) + "ms");
	}
}
