package datetime.exercises;

import java.util.Calendar;

import utils.DateUtils;

public class Ex07DatingTime {
	public static void main(String[] args) {
		Calendar star = DateUtils.getInstant(2022, Calendar.JULY, 10, 10, 10, 0);
		
		long starLove = star.getTimeInMillis() * 24 * 60 * 60 * 1000;
		 System.out.println(starLove);
		
		
		long end = Calendar.getInstance().getTimeInMillis() * 24 * 60 * 60 * 1000;
		 System.out.println( end);
		
	}
}
