package home;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomPassword {
	// SYSTEM
	private static String username = "admin";
	private static String password = "209";
	private static Random rd = new Random();
	private static String[] storage = new String[1000];

	public static void main(String[] args) {
		int breakLine = 1;
		int currentIndex = 0;
		String ipUsername = "admin";
		String ipPassword = null;
		do {
			ipPassword = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if (isExists(storage, ipPassword, currentIndex)) {
				continue;
			}

			storage[currentIndex++] = ipPassword;
			sleep(50);
			System.out.print(ipPassword + "   ");
			if (breakLine % 12 == 0) {
				System.out.println();
			}
			breakLine++;
		} while (!signIn(ipUsername, ipPassword));
		System.out.println("\nComplete to sign in!");
	}

	private static void sleep(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static boolean isExists(String[] storage, String ipPassword, int currentValidIndex) {

		// java.lang.NullPointerException
		// null.equals(value) -> exception
		// value.equals(null) -> ok
		for (int i = 0; i < currentValidIndex; i++) {
			if (storage[i].equals(ipPassword)) {
				return true;
			}
		}
		return false;
	}

	private static boolean signIn(String ipUsername, String ipPassword) {
		return username.equals(ipUsername) && password.equals(ipPassword);
	}

}
