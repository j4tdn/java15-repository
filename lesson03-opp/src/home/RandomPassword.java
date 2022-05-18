package home;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomPassword {
	// SYSTEM
	private static String username = "admin";
	private static String password = "147";
	
	private Random rd = new Random();
	// null , null , null, null ....

	
   public static void main(String[] args) {
	   String ipUsername = "admin";
	   String ipPassword = null;
	   
	   int breakLine = 1;
	   int currentIndex = 0;
	   
	do {
		ipPassword = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
	   
		if (isExists(storage, ipPassword)) {
			continue;
		}
		
		storage[currentIndex++] = ipPassword;
		
		sleep(50);
		System.out.println(ipPassword + "  ");
	    if (breakLine % 12 == 0) {
	    	System.out.println();
	    }
	    breakLine++;
	    } while(!signIn(ipUsername, ipPassword));
	System.out.println("Đăng nhập thành công !!!");
}

	private static void sleep(long milliseconds) {
		try {
		TimeUnit.MILLISECONDS.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
   // storage: 1000
   private static boolean isExists(String[] storage, String ipPassword, int currentValidIndex) {
	   for (int i = 0; i < currentValidIndex; i++) {
		   if (password.equals(password)) {
			   return true;
		   }
	   }
	   return false;
   }
   
   private static boolean signIn(String ipUsername, String ipPassword) {
	   return ipUsername.equals(username) && ipPassword.equals(password);
   }
}
