package home;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomPassword {
	private static String username = "admin";
	private static String password = "147";

	private static Random rd = new Random();

	private static String[] storage = new String[1000];

	public static void main(String[] args) {
		String inUsername = "admin";
		String ipPassword = null;
		int currentIndex = 0;
		int breakLine = 1;

		do {
			ipPassword = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if (isExists(storage, ipPassword,currentIndex)) {
				continue;
			}
			storage[currentIndex++] = ipPassword;
			
			sleep(50000);
			System.out.print(ipPassword + " ");
			if (breakLine % 12 == 0) {
				System.out.println();
			}
			breakLine++;
		} while (!signIn(inUsername, ipPassword));
	}
	private static void sleep(long millseconds) {
		try {
			TimeUnit.MICROSECONDS.sleep(millseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static boolean isExists(String[] storage, String ipPassword, int currenIndex) {
		for (int i = 0; i < currenIndex; i++) {
			if (storage[i].equals(ipPassword)) {
				return true;
			}
		}
		return false;
	}

	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
