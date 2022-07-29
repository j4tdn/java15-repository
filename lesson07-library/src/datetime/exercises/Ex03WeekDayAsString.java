package datetime.exercises;

import java.util.Calendar;

public class Ex03WeekDayAsString {
	public static void main(String[] args) {
		String[] weekDateStrings = {"Chủ nhật", "Thứ 2", "Thứ 3",
				"Thứ 4", "Thứ 5", "Thứ 6", "Thứ 7"};
		// WeekDay: Sunday(1), Monday(2)...Saturday(7)
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JULY, 10);
		int dowAsInt = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("dowAsInt: " + dowAsInt);
		
		for(int i = 1; i <weekDateStrings.length; i++) {
			if(i == dowAsInt) {
				System.out.println(weekDateStrings[i-1]);
				break;
			}
		}
	}
}
