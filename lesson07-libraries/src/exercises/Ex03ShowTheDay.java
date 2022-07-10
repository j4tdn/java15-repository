package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import common.WeekDayType;

public class Ex03ShowTheDay {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
		Date cDate = c.getTime();
		String cDateFormat = df.format(cDate);
		System.out.println("Thời gian hiện tại: " + cDateFormat);
		
		// Step 1
		switch (weekDay) {
		case 1:
			System.out.println("Chủ Nhật");
			break;
		case 2:
			System.out.println("Thứ Hai");
			break;
		case 3:
			System.out.println("Thứ Ba");
			break;
		case 4:
			System.out.println("Thứ Tư");
			break;
		case 5:
			System.out.println("Thứ Năm");
			break;
		case 6:
			System.out.println("Thứ Sáu");
			break;
		case 7:
			System.out.println("Thứ Bảy");
		}
		
		// Step 2
		WeekDayType[] weekDays = WeekDayType.values();
		
		System.out.println(weekDays[weekDay -1]);
	}
}
