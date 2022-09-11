package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04 {
	private static DateFormat df = new SimpleDateFormat("EEEE dd/MMMM/yyyy");
	public static void main(String[] args) {
//		DateFormat df = new SimpleDateFormat(" EE dd/MM/yyyy");
//
//		Calendar c = Calendar.getInstance();
//
//		int dayOfW = c.get(Calendar.DAY_OF_WEEK);
//		System.out.println(dayOfW);
//
//		for (int i = dayOfW; i < dayOfW + 7; i++) {
//			c.set(Calendar.DAY_OF_WEEK, i);
//			Date cdate = c.getTime();
//			String cdfm = df.format(cdate);
//			System.out.println(cdfm);
//
//		}
		dayOfMonth(2022, 7);

	}
	private static void dayOfMonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);
		int dOM = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for (int i = 1; i <= dOM; i++) {
			c.set(Calendar.DAY_OF_MONTH, i);
			Date date = c.getTime();
			String dfm = df.format(date);
			
			System.out.println(dfm);
		}
	}
}
