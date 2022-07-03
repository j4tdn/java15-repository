package exercises;

import java.util.Calendar;

public class Ex03ShowTheDay {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
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
	}
}
