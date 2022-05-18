package home;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomPassword {
	// SYSTEM
	private static String username = "admin";
	private static String password = "147";

	private static Random rd = new Random();
	private static String[] storage = new String[1000];

	public static void main(String[] args) {
		String ipUsername = "admin";
		String ipPassword = null;

		int breakLine = 1;
		int currentIndex = 0;

		do {
			ipPassword = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);

			if (isExists(storage, ipPassword, currentIndex)) {
				continue;
			}
			storage[currentIndex++] = ipPassword;
			
			sleep(50);
			// currentIndex++;

			System.out.print(ipPassword + "  ");
			if (breakLine % 12 == 0) {
				System.out.println();
			}
			breakLine++;
		} while (!signIn(ipUsername, ipPassword));
		
		System.out.println("Successfully Signed In Motherfucker HAHAHAHAHAHAHA");

	}

	private static void sleep(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// storage : 100
	private static boolean isExists(String[] storage, String ipPassword, int currentValidIndex) {
		for (int i = 0; i < currentValidIndex; i++) {
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