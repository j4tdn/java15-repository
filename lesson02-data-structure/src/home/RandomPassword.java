package home;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomPassword {
	// system
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
// 			currentIndex++;
			sleep(50);
			System.out.print(ipPassword + " ");
			if (breakLine % 12 == 0) {
				System.out.println();
			}
			breakLine++;
		} while (!signIn(ipUsername, ipPassword));
		
//		System.out.println(ipPassword);
		System.out.println("Đăng nhập thành công");
	}

	private static void sleep(long miliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(miliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// storage: 1000

	private static boolean isExists(String[] storage, String ipPassword, int currentValidIndex) {

		// java.lang.NullPointerExeption
		// null.equals(value) ==> NPE
		// value.equals(null) ==>

		for (int i = 0; i < currentValidIndex; i++) {
			if (password.equals(ipPassword)) {
				return true;
			}
		}
		return false;
	}

	private static boolean signIn(String ipUsername, String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
