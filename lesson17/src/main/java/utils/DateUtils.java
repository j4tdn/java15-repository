package utils;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class DateUtils {
   
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static java.sql.Time toSTime(LocalTime ltime){
		Objects.requireNonNull(ltime,"Time cannot be null");
		return java.sql.Time.valueOf(ltime);
	}
	public static java.sql.Date toSDate(LocalDate ldate){
		Objects.requireNonNull(ldate,"Date cannot be null");
		return java.sql.Date.valueOf(ldate);
	}
}
