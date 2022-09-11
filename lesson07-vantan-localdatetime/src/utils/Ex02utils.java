package utils;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Ex02utils {
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMMM-yyyy" );
	
	private Ex02utils() {
	}
	//1
	public static LocalDate getLocalDate(int year, int month, int date) {
		LocalDate datetime  = LocalDate.now().of(year, month, date);
		return datetime;
	}//2
	public static String getDayTime(LocalDate lcd) {
		DayOfWeek dOW = lcd.getDayOfWeek();
		return df.format(lcd)+ " is a " + dOW;
	}
	//3
	public static String getDayOfYear(LocalDate date) {
		int lengthOfYear = date.lengthOfYear();
		int dayOfYear = date.getDayOfYear();
		return "It is day number " + dayOfYear + " of the year, " + (lengthOfYear - dayOfYear) 
				+ " left days ";
	}
	//5
	public static String getLengthYear(LocalDate date) {
		return "Year " +date.getYear()+ " has " + date.lengthOfYear() + " days";
	}
	public static String getLengthMonth(LocalDate date) {
		return date.getMonth() + " " + date.getYear() + " has " + date.lengthOfMonth() + " days";
	}
	
}
