package utils;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {
	public ThreadUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void printCurrendThreadName() {
		System.out.println("current thead #" + Thread.currentThread().getName());
	}

	public static void startThread() {
		System.out.println(Thread.currentThread().getName() + " is running ...");
	}

	public static String getThreadName() {
		return Thread.currentThread().getName();
	}

	// virtual task with a certain time
	public static void task(long time, TimeUnit unit) {
		try {
			unit.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void join(Thread thread) {
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
