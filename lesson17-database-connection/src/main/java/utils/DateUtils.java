package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

public class DateUtils {
	private static SimpleDateFormat sdf = null;

	private DateUtils() {

	}

	public static java.sql.Date toSDate(LocalDate ldate) {
		Objects.requireNonNull(ldate, "ldate cannot be null");
		return java.sql.Date.valueOf(ldate);
	}

	// 2020-10-5
	public static Date toUDate(LocalDate ldate, String pattern) {
		Objects.requireNonNull(ldate, "ldate cannot be null");
		sdf = new SimpleDateFormat(pattern);
		Date uDate = null;
		try {
			uDate = sdf.parse(ldate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return uDate;
	}
}
