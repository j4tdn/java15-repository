package view;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class AttackPassword {
	private static String pw = "000";
	public static void main(String[] args) {
		Random rd = new Random();
		String[] storage = new String[1000];
		String isPw = null;
		int count = 0;
		int breakline = 1;
		do {
			isPw = "" + rd.nextInt(10) + rd.nextInt(10) + rd.nextInt(10);
			if(exists(storage, count, isPw)) {
				continue;
			}
				storage[count++] = isPw;
				sleep(90);
				System.out.print(isPw + "  ");
				if(breakline % 10 == 0) {
					System.out.println();
				
				
			}
				breakline++;
		}while(!compare(isPw));
	}
	private static boolean compare(String x) {
		return x.equals(pw);
	}
	private static boolean exists(String[] storage, int count, String x) {
		for (int i = 0; i < count; i++) {
			if(storage[i].endsWith(x)) {
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
}
