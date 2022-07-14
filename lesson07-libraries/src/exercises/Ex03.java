package exercises;

import java.util.Calendar;

public class Ex03 extends Ex02 {
	static Calendar c = Calendar.getInstance();
	public static void main(String[] args) {
		Day(c);
		DayofMonth(c);
		Sunday(c);
	}
	private static void Day(Calendar c) {
		int weekDay = c.get(Calendar.DAY_OF_WEEK);
		System.out.print("Hôm nay là ");
		switch (weekDay) {
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
			break;
		case 1:
			System.out.println("Chủ Nhật");
			break;

		}
	}
	private static void DayofMonth(Calendar c) {
		System.out.println("=================");
		int month = Calendar.MONTH + 1;
		int day = Ex02.day(month, c);
		for(int i = 1; i <= day; i++) {
			System.out.print( + i + " ");
			if(i % 10 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		System.out.println("Tuần trong tháng: " + c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Tuần trong năm: " + c.get(Calendar.WEEK_OF_YEAR));
	}
	private static void Sunday(Calendar c) {
		System.out.println("=====================");
		int month = Calendar.MONTH + 1;
		int day = Ex02.day(month, c);
		System.out.println("Các ngày chủ nhật trng tháng " + month + " là: ");
		for(int i = 1; i <= day; i++) {
			c.set(Calendar.DAY_OF_MONTH, i);
			if(c.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.print(i + "       ");
			}
		}
		
		
	}
}
