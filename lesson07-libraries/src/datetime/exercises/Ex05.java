package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex05 {
	private static DateFormat df = new SimpleDateFormat("EEEE dd-MMMM-yyyy");
	public static void main(String[] args) {
		sundayOfMonth(2022, 7);
	}
	private static void sundayOfMonth(int year, int month) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		int dOM = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		
		int count = 0;
		for (int i = 1; i <= dOM; i++) {
			cal.set(Calendar.DAY_OF_MONTH, i);
			if(cal.get(Calendar.DAY_OF_WEEK) == 1) {
				Date date = cal.getTime();
				String cdf = df.format(date);
				System.out.println(cdf);
				count++;
			}
		}
		
		System.out.println(count);
	}
}
