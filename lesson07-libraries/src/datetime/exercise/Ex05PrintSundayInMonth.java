//package datetime.exercise;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//
//import utils.DateUtils;
//
//public class Ex05PrintSundayInMonth {
//	public static void main(String[] args) {
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//		int month = Calendar.AUGUST;
//		int year = 2022;
//		Calendar c = DateUtils.getInstance(month, year);
//		int datesInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
//		for (int day = 1; day <= datesInMonth;) {
//			c.set(Calendar.DAY_OF_MONTH, day);
//			if (c.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
//				String formatted = df.format(c.getTime()) + " " + DateUtils.getWdAsVnmese(c);
//				System.out.println(formatted);
//				day += 7;
//				continue;
//			}
//			day++;
//		}
//	}
//}
