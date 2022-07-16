package view;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import utils.DateTimeUtils;

public class Ex02WeekdayCalculator {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Input year: ");
		int year = ip.nextInt();
		System.out.print("Input month: ");
		int month = ip.nextInt();
		System.out.print("Input day: ");
		int day = ip.nextInt();
		LocalDate c = LocalDate.of(year, month, day);
		System.out.println("===========================");
		DateTimeUtils.dayOfWeekFromADay(c);
		DateTimeUtils.dayOfYear(c);
		DateTimeUtils.numberDayOfWeekInYear(c);
		DateTimeUtils.numberDayOfWeekInMonth(c);
		DateTimeUtils.numOfDaysInYear(c);
		DateTimeUtils.numOfDaysInMonth(c);
	}
}
