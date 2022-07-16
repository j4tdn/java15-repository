package baitap;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex02_WeekdayCalculator {
	private static Calendar c = Calendar.getInstance();
    private static LocalDate lc = LocalDate.now().withDayOfMonth(25).withMonth(9).withYear(2020);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap ngay:");
			int day = Integer.parseInt(sc.nextLine());
			System.out.println();
			System.out.print("Nhap thang: ");
			int month = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap nam: ");
			int year = Integer.parseInt(sc.nextLine());
			try {
				if(Check(day, month, year)) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		c.set(2020, Calendar.SEPTEMBER, 25);
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		System.out.println(c.get(Calendar.WEEK_OF_MONTH));
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_YEAR));
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("====================");
		System.out.println(lc.getDayOfYear());
		System.out.println(lc.lengthOfYear());
		System.out.println(lc.lengthOfMonth());
		System.out.println(lc.get(ChronoField.ALIGNED_WEEK_OF_MONTH));
		System.out.println(lc.get(ChronoField.ALIGNED_WEEK_OF_YEAR));
		
		
	}
	private static boolean Check(int day, int month, int year) throws Exception {
		if(month < 1 || month > 12) {
			throw new Exception("Tháng không hợp lệ");
		}
		c.set(Calendar.MONTH, month - 1 );
		c.set(Calendar.YEAR, year );
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		if(day < 1 || day > c.getActualMaximum(Calendar.DAY_OF_MONTH))
			throw new Exception("Ngày không hợp lệ");
		return true;
		
	}

}
