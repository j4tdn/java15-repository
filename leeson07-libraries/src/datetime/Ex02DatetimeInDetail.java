package datetime;

import java.util.Calendar;
import java.util.Locale;

public class Ex02DatetimeInDetail {
	public static void main(String[] args) {
		System.out.println("default locale" + Locale.getDefault());
		Locale.setDefault(Locale.FRANCE);
		Locale.setDefault(new Locale("vi", "VN"));
		Calendar c = Calendar.getInstance();
		System.out.println("dayOfMonth: " + c.get(Calendar.DAY_OF_MONTH));
		System.out.println("dayOfYear: " + c.get(Calendar.DAY_OF_YEAR));
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(weekDay);

		int fdow = c.getFirstDayOfWeek();
		System.out.println("fdow: " + fdow);

	}

}
