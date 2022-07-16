package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
	public static void main(String[] args) {
		// showTime();
		// showLastDayOfMonth();
		// showFirstDayAndLastDayOfWeek();
		// showDayInWeekOfYear();
		// nextDay();
	}

	// Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	private static void showTime() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println("Thời gian hiện tại:" + date);

	}

	// In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	private static void showLastDayOfMonth() {
		Date today = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);

		calendar.add(Calendar.MONTH, 1);
		calendar.set(Calendar.DAY_OF_MONTH, 1);
		calendar.add(Calendar.DATE, -1);

		Date lastDayOfMonth = calendar.getTime();

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Ngày cuối tháng: " + df.format(lastDayOfMonth));
	}

	// Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	private static void showFirstDayAndLastDayOfWeek() {
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		DateFormat dateformat = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(dateformat.format(date.getTime()));
		for (int i = 0; i < 6; i++) {
			date.add(Calendar.DATE, 1);
		}
		System.out.println(dateformat.format(date.getTime()));
	}

	// Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	private static void showDayInWeekOfYear() {
		Date today = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(today);
		int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Tuần thứ:" + weekOfYear);
	}

	// Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	private static void nextDay() {
		Calendar date = Calendar.getInstance();
		date.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		DateFormat dateformat = new SimpleDateFormat("EEE dd/MM/yyyy");
		System.out.println(dateformat.format(date.getTime()));
		for (int i = 0; i < 20; i++) {
			date.add(Calendar.DATE, 1);
		}
		System.out.println(dateformat.format(date.getTime()));

	}
	// Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
	private static void calculatorDay() {
		
	}
}
