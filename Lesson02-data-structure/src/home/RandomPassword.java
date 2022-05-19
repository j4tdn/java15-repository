package home;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class RandomPassword {
  //SYSTEM
	private static String username = "admin";
	private static String password = "147";
    private static Random rd = new Random();
    private static String[] storage = new String[1000];
    
	public static void main(String[] args) {
	  String ipUsername = "admin";
	  String ipPassword = null;
	  int breakline = 1; // vi de breakline = 0 thi no se xuong 
      int currentIndex = 0;
	  do {
		ipPassword = " " + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
		
		if (isExist(storage,ipPassword, currentIndex)) {
			continue;
		}
		storage[currentIndex++] = ipPassword;
		sleep(50);
		//currentIndex++;
		
		System.out.print(ipPassword + "   ");
		if (breakline %12 == 0) {
			System.out.println();
		}
		breakline++;
	} while (!signIn(ipUsername,ipPassword));
	
	  System.out.println("Dang nhap thanh cong" );
	}
	private static void sleep(long milliseconds) {
		try {
			TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static boolean isExist(String[]storage , String ipPassword ,int currentValidIndex ) {
		for (int i = 0; i < currentValidIndex; i++) {
			if(storage[i].equals(ipPassword)) {
				return true;
			}
		}
		return false;
	}
	private static boolean signIn(String ipUsername , String ipPassword) {
		return ipUsername.equals(username) && ipPassword.equals(password);
	}
}
