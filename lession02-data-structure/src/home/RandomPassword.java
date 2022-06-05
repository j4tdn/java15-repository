package home;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomPassword {
	private static String username = "admin";
	private static String pass = "147";
	private static Random rd = new Random();
	private static String[] storage = new String[1000];
	public static void main(String[] args) {
		String ipUsername = "admin";
		String ipPass = null;
		int br = 1;
		int currentIndex = 0;
	
		do {
			ipPass =  "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			
			if(isExists(storage, ipPass,currentIndex)) {
				continue;
			}
			
			storage[currentIndex++] = ipPass;
			sleep(1);
			System.out.print(ipPass + "	");
			if(br % 12 == 0) {
				System.out.println();
			}
			br++;
		}while(!signIn(ipUsername, ipPass));
		System.out.println();
		System.out.println("DANG NHAP THANH CONG");
	}
	private static boolean isExists(String[] storage, String ipPass, int curr) {
		for(int i = 0; i < curr; i++) {
			if(storage[i].equals(ipPass)) {
				return true;
			}
		}
		return false;
	}
	private static boolean signIn(String ipUsername, String ipPass) { 
		return ipUsername.equals(username) && ipPass.equals(pass);
	}
	private static void sleep(long milli) {
		try {
			TimeUnit.MILLISECONDS.sleep(milli);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
