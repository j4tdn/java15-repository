package view;

import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class Ex02 {
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2022, 7,15);

		int weekOfYear = localDate.get(WeekFields.of(Locale.getDefault()).weekOfYear());
		System.out.println(weekOfYear);
	}
}
