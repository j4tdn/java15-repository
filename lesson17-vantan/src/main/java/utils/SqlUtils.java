package utils;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SqlUtils {
	//private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss");
	
	private SqlUtils() {
	}
	
	public static LocalTime sqlDate(Time time) {
		return time.toLocalTime();
	}
	public static Date sqlDate(LocalDate date){
		return java.sql.Date.valueOf(date);
	}

	
}
