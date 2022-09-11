package view;

import static utils.Ex02utils.*;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Scanner;
import java.util.Set;
import java.util.TimeZone;

public class Ex02 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
//		int year, month, day;
//		System.out.println("Enter year");
//		year = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter month");
//		month = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter day");
//		day = Integer.parseInt(sc.nextLine());
//		
		LocalDate date = getLocalDate(2022, 7, 29);
		//2
		System.out.println(getDayTime(date));
		//3
		System.out.println(getDayOfYear(date));
		//5
		System.out.println(getLengthYear(date));
		//6
		System.out.println(getLengthMonth(date));
	}
}
