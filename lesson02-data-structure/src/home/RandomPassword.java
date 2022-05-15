package home;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomPassword {
	// SYSTEM
	private static String username = "admin";
	private static String password = "147";
	private static String[] storagePassword = new String[1000];
	
	public static void main(String[] args) {
		Random rd = new Random();
		String ipUsername = "admin";
		int breakLine = 1;
		String ipPassword = null;
		int currentIndex = 0;
		do {
			ipPassword = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if(isExists(storagePassword, ipPassword, currentIndex)) {
				continue;
			}
			storagePassword[currentIndex++] = ipPassword;
			sleep(50);
			System.out.print(ipPassword + "  ");
			if(breakLine % 12 == 0) {
				System.out.println();
			}
			breakLine++;
		}while(!signIn(ipUsername, ipPassword));
		
		System.out.println("\nAccess granted!!");
	}

	private static boolean isExists(String[] storagePassword, String ipPassword, int currentIndex) {
		// TODO Auto-generated method stub
		for(int i = 0; i < currentIndex; i++) {
			if(storagePassword[i].endsWith(ipPassword)) {
				return true;
			}
		}
		return false;
	}
	
	private static void sleep(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static boolean signIn(String ipUsername, String ipPassword) {
		// TODO Auto-generated method stub
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
