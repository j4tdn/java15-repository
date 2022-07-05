package exercise;

import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c1.set(2022, Calendar.JANUARY, 1, 0, 0, 0);
		c2.set(2022, Calendar.DECEMBER, 31, 23, 59, 59);
		
		long time1 = c1.getTimeInMillis();
		long time2 = c1.getTimeInMillis();
		
		long a = time1 - time2;
		
	}
}
