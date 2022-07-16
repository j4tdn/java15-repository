package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import common.WeekDayType;

public class Ex02_WeekdayCalculator {
	private static Calendar c = Calendar.getInstance();
	public static void main(String[] args) {
		WeekDayType[] weekDateAsString = WeekDayType.values();
		Scanner sc = new Scanner(System.in);
		int day, month, year;

		do {
			System.out.print("Nhap ngay:");
			day = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap thang: ");
			month = Integer.parseInt(sc.nextLine());
			System.out.print("Nhap nam: ");
			year = Integer.parseInt(sc.nextLine());
			try {
				if(Check(day, month, year)) {
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		   LocalDate lc = LocalDate.now().withDayOfMonth(day).withMonth(month).withYear(year);

		c.set(year, month-1, day);
		System.out.println("Is it day number " + c.get(Calendar.DAY_OF_YEAR) + " of the year, " + (c.getActualMaximum(Calendar.DAY_OF_YEAR)- c.get(Calendar.DAY_OF_YEAR)) + " days left");
		System.out.println("Is is " + weekDateAsString[c.get(Calendar.DAY_OF_WEEK) - 1] + " number " + c.get(Calendar.WEEK_OF_MONTH) + " out of " + c.getActualMaximum(Calendar.WEEK_OF_MONTH)
								+ " in the " + (c.get(Calendar.MONTH) + 1) + " " + c.get(Calendar.YEAR));
		System.out.println("It is " + weekDateAsString[c.get(Calendar.DAY_OF_WEEK) - 1] + " number " + c.get(Calendar.WEEK_OF_YEAR) + "out of "+ c.getActualMaximum(Calendar.WEEK_OF_YEAR) + " in " + c.get(Calendar.YEAR));
		System.out.println("Year " + c.get(Calendar.YEAR) + " has " +  c.getActualMaximum(Calendar.DAY_OF_YEAR) + " days");
		System.out.println((c.get(Calendar.MONTH) + 1) + " has " + c.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
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
		if(day < 1 || day > c.getActualMaximum(Calendar.DAY_OF_MONTH))
			throw new Exception("Ngày không hợp lệ");
		return true;
		
	}

}


