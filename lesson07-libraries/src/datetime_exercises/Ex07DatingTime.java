package datetime_exercises;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import utils.DateUtils;

public class Ex07DatingTime {
	public class Ex05 {
		public static void main(String[] args) {
			Calendar start =DateUtils.getInstance(20, Calendar.APRIL, 2020, 10, 20, 30);
			
			Calendar now = Calendar.getInstance();
			
			String duration = DateUtils.between(start, now);
			System.out.println("duration: " + duration);
			
			
		}
	}
}
			
		
