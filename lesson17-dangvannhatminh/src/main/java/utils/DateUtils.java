package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	private static SimpleDateFormat sdf = null;

	private DateUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static LocalTime toST(java.sql.Time stime) {
		Objects.requireNonNull(stime, "stime cannot be null");
		return stime.toLocalTime();	
	}
	
	public static java.sql.Date toSDate(LocalDate ldate) {
		Objects.requireNonNull(ldate, "ldate cannot be null");
		return java.sql.Date.valueOf(ldate);
	}
	
	public static LocalDate toLocalDate(java.sql.Date dateS)
	{
		return dateS.toLocalDate(); 
	}

	public static Date toUDate(LocalDate lDate, String pattern) {
		Objects.requireNonNull(lDate, "ldate cannot be null");
		sdf = new SimpleDateFormat(pattern);
		Date uDate = null;
		try {
			uDate = sdf.parse(lDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return uDate;
	}
}
