package utils;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class DateUtils {
   
	public DateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static java.time.LocalTime toJTime(Time time){
		Objects.requireNonNull(time,"Time cannot be null");
		return time.toLocalTime();
	}
	public static java.sql.Date toSDate(LocalDate ldate){
		Objects.requireNonNull(ldate,"Date cannot be null");
		return java.sql.Date.valueOf(ldate);
	}
}
