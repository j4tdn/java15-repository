package exersises;

import java.time.DayOfWeek;
import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, 3);
		String dayOfWeeks[] = { "chủ nhật", "thứ hai", "thứ ba", "thứ tư", "thứ năm", "thứ sáu", "thứ bảy" };
		System.out.println(dayOfWeeks[dayOfWeek(calendar) - 1]);

	}

	public static int dayOfWeek(Calendar calendar) {
		return calendar.get(calendar.DAY_OF_WEEK);
	}

}
