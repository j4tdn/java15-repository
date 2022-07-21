package utils;

import static utils.Dateutils.optional;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

import exception.InvalidException;

public class Dateutils {
	public Dateutils() {
		
	}
	public static boolean isHoliday(Calendar checkedCal, Calendar[] holidays) {
		int dayOfMonth = checkedCal.get(Calendar.DAY_OF_MONTH);
		int month = checkedCal.get(Calendar.MONTH);
		for (Calendar holiday: holidays) {
			if (dayOfMonth == holiday.get(Calendar.DAY_OF_MONTH)
					&& month == holiday.get(Calendar.MONTH)) {
				return true;
			}
		}
		return false;
	}
	public static Calendar getTime(int date, int month) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, month);
		c.set(Calendar.DAY_OF_MONTH, date);
		return c;
	}
	public static LocalTime formatTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		Scanner sc = new Scanner(System.in);
		System.out.println("input time(HH:mm:ss):");
		String input = sc.nextLine();
		LocalTime time = LocalTime.parse(input, dtf);
		return time;
	}

	public static LocalDate formatDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("input time(dd/MM/yyyy):");
		String input = sc.nextLine();
		LocalDate time = LocalDate.parse(input, dtf);
		return time;
	}

	public static String lastDayofthemonth() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		date = LocalDate.of(date.getYear(), date.getMonth(), date.lengthOfMonth());
		String result = date.format(formatter);
		return result;
	}

	public static void startAndEndOfWeek() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();

		c.add(Calendar.DAY_OF_MONTH, Calendar.SATURDAY - c.get(Calendar.DAY_OF_WEEK));

		System.out.println("ngay cuối tuần:" + dateFormat.format(c.getTime()));
		c.add(Calendar.DAY_OF_MONTH, -6);
		System.out.println("ngay đầu tuần:" + dateFormat.format(c.getTime()));

	}


	public static String format(String pattern, Date date) {
		return new SimpleDateFormat(pattern).format(date);
	}
	public static void check(LocalDate startDate, LocalDate endDate) {
		if (endDate.isBefore(startDate)) {
			throw new IllegalArgumentException("start date cannot exceed end date !!!");
		}

	}

	public static void validate(LocalDate date) {
		if (date.getMonthValue() > 12 || date.getMonthValue() < 1) {

			throw new InvalidException("số tháng không hợp lệ");

		}
		if (date.getDayOfMonth() < 1 || date.getDayOfMonth() > date.lengthOfMonth()) {
			throw new InvalidException("số ngày không hợp lệ");

		}

	}

	public static int numberDayOfWeek(LocalDate date, int day) {
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int count = 0;

		for (int i = 1; i <= day; i++) {
			if (day < 70) {
				date = LocalDate.of(date.getYear(), date.getMonth(), i);
			} else {
				date = LocalDate.ofYearDay(date.getYear(), i);
			}

			if (date.getDayOfWeek() == dayOfWeek) {
				count++;

			}

		}
		return count;

	}

	public static String thePresentTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		LocalDateTime date = LocalDateTime.now();
		String result = date.format(formatter);

		return result;
	}
	public static void thebirth() {
		
		LocalDate date = formatDate();
		Period period = Period.between(date,LocalDate.now());
		System.out.println(
				 optional(period.getYears(), "years")
				+ optional(period.getMonths(), "months")
				+ optional(period.getDays(), "days"));
	
	}
	public static Calendar getInstance(int date, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		return c;
	}
	public static void twentyMoreDays() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.now();
		date =LocalDate.ofYearDay(date.getYear(), date.getDayOfYear()+20);
		String result = date.format(formatter);
		System.out.println(result);
		System.out.println(date.getDayOfWeek());
	}
	public static int today() {
		
		int count = 0;
		
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.set(Calendar.DAY_OF_YEAR, 1);
		int  number = calendar.get(Calendar.DAY_OF_WEEK);
		for(int i = 1; i<day; i++) {
			calendar.set(Calendar.DAY_OF_YEAR, i);
			 if(number == calendar.get(Calendar.DAY_OF_WEEK)) {
				count++;  
			 }
		}
		if(calendar.get(Calendar.DAY_OF_WEEK)<number) {
			count++;
		}
			return count;
	}

	public static String optional(long dmy, String unit) {
		return dmy > 0 ? (dmy + " " + unit + " ") : " ";
	}
}