package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DateTimeInDetail {

	public static void main(String[] args) {
		System.out.println("mui gio: "+ Locale.getDefault());
		
		Locale.setDefault(new Locale("vi","VN"));
		Calendar c = Calendar.getInstance();
		// Lấy ngày trong tháng hiện tại ra
		System.out.println("DayOfMonth: "+ c.get(Calendar.DAY_OF_MONTH));
		// xem slide
		// sunday = 1, monday =2,...saturday = 7
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("DayOfWeek: " + weekDay);
		
		//firstDayOfWeek
		int fdoW = c.getFirstDayOfWeek();
		System.out.println("fdoW: " + fdoW);
	}

}
