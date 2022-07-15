//package datetime.exercise;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import java.util.Locale;
//
//import utils.DateUtils;
//
//public class Ex04PrintSpecificDates {
//	public static void main(String[] args) {
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//		int month = Calendar.AUGUST;
//		int year = 2022;
//
//		Calendar c = DateUtils.getInstance(month, year);
//
//		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//		int datesInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
//
//		for (int day = 1; day <= datesInMonth; day++) {
//			c.set(Calendar.DAY_OF_MONTH, day);
//			String formatted = df.format(c.getTime()) + " " + DateUtils.getWdAsVnmese(c);
//			System.out.println(formatted);
//		}
//
//		System.out.println("===================");
//		// 08/07/2022
//		Calendar now = Calendar.getInstance(Locale.FRANCE);
//		now.set(2022, Calendar.JULY, 27);
//
//		// FirstDayNumOfWeek = current_date_number + fdow(sunday, monday) -
//		// current_week_date
//		now.add(Calendar.DAY_OF_MONTH, now.getFirstDayOfWeek() - now.get(Calendar.DAY_OF_WEEK));
//		System.out.println("first day of week: " + df.format(now.getTime()));
//
//		for (int i = 1; i <= 7; i++) {
//			String formatted = df.format(now.getTime()) + " " + DateUtils.getWdAsVnmese(now);
//			System.out.println(formatted);
//			now.add(Calendar.DAY_OF_MONTH, 1);
//		}
//	}
//
//}
