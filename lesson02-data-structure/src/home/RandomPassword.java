package home;

import java.util.Random;

public class RandomPassword {
	private static String username = "admin";
	private static String password = "147";
	private static Random rd = new Random();
	private static String[] storage = new String[1000];

	public static void main(String[] args) {
		String ipUsername="admin";
		String ipPassword = null;
		int breakLine = 1;
		int  currentIndex =0;
		do {
			ipPassword=""+ rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			System.out.print(ipPassword+"   ");
		
			if (isExists(storage, ipPassword) ) {
				continue;

				storage [ currentIndex++] = ipPassword;
				System. out . print (ipPassword + "				") ;
				if (breakLine % 12 == 0) {
				System. out . println() ;
				breakLine++ ;
				
				} while(!signIn(ipUsername, ipPassword) ) ;
				// storage: 1000
	private static boolean isExists (String[] storage, String ipPassword) {
				for (String password: storage) {
				if (password . equals(ipPassword) ) {
				return true;
				}
			}return false;
	}
	private static boolean signIn(String ipUsernam, String ipPassword) {
		return ipUsernam.equals(username) && ipPassword.equals(password);
	}
}
