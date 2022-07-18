package view;

import java.time.LocalDate;
import static utils.Dateutils.*;

public class WeekdayCalculator {
	public static void main(String[] args) {
		LocalDate date;
		do {
			try {
				System.out.println("nhập thời gian :");
				date = formatDate();
				validate(date);
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		System.out.println("It is day number " + date.getDayOfYear() + " of the year, "
				+ (date.lengthOfYear() - date.getDayOfYear()) + " days left");
		System.out.println("It is " + date.getDayOfWeek() + " number " + numberDayOfWeek(date, date.getDayOfYear())
				+ " out of " + numberDayOfWeek(date, date.lengthOfYear()) + " in " + date.getYear());
		System.out.println("It is " + date.getDayOfWeek() + " number " + numberDayOfWeek(date, date.getDayOfMonth())
				+ " out of " + numberDayOfWeek(date, date.lengthOfMonth()) + " in " + date.getMonth() + date.getYear());
		System.out.println("Year " + date.getYear() + " has " + date.lengthOfYear() + " days ");
		System.out.println(date.getMonth() +" " +date.getYear() +" has " + date.lengthOfMonth() +" days ");

	}
}
