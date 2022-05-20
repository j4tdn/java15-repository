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
		String ipUserName = "admin";
		String ipPassword = null;
		int breakLine = 1;
		int currentIndex = 0;
		

		do {
			ipPassword = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if (IsExists(storage, ipPassword, currentIndex)) {
				continue;
			}
			storage[currentIndex++] = ipPassword;
			sleep(50);
			System.out.print(ipPassword + "   ");
			if (breakLine % 12 == 0) {
				System.out.println();
			}
			breakLine++;

		} while (!signIn(ipUserName, ipPassword));
		System.out.println("DANG NHAP THANH CONG");

	}
	

	private static void sleep(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	private static boolean IsExists(String[] storage, String ipPassword, int currentIndexValid) {
		for (int i = 0; i < currentIndexValid; i++) {
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
