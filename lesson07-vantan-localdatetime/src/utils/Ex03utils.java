package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

import bean.FirstAndLastDayOfWeek;

public class Ex03utils {
	public static Scanner sc = new Scanner(System.in);
	public static DateTimeFormatter df1 = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
	private static DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private Ex03utils() {

	}

	// XEM THỜI GIAN HIỆN TẠI Ở BÂT SKYF KHU VỰC
	public static String getDatetimeEveryWhere() {
		System.out.println("Enter timezone");
		String timezone = new Scanner(System.in).nextLine();
		LocalDateTime datetime = LocalDateTime.now(ZoneId.of(timezone));
		return df.format(datetime);

	}

	// XEM NGÀY CUỐI THÁNG
	public static String getLastDayOfMonth() {
		LocalDate date = LocalDate.now();
		return df1.format(date.withDayOfMonth(date.lengthOfMonth()));
	}

	// xem ngay dau va cuoi tuan
	public static FirstAndLastDayOfWeek gecGo() {
		LocalDate firstDay = LocalDate.now().with(WeekFields.of(Locale.FRANCE).getFirstDayOfWeek());

		LocalDate lastDay = firstDay.plusDays(6);

		FirstAndLastDayOfWeek andLastDayOfWeek = new FirstAndLastDayOfWeek(firstDay, lastDay);
		return andLastDayOfWeek;
	}

	public static int getWeekOfYear() {
		LocalDate date = LocalDate.now();
		TemporalField woy = WeekFields. of(Locale. getDefault()).weekOfWeekBasedYear();
		int weekNumber = date. get(woy);
		return weekNumber;
	}
	public static String getDay20() {
		LocalDate date = LocalDate.now().plusDays(20);
		return df1.format(date);
	}

	public static long getDayLive() {
		int year, month, date;
		String yearAsString, monthAsString, dateAsString = null;
		do {
			try {
				System.out.println("Enter birth year");
				yearAsString = sc.nextLine();
				System.out.println("Enter birth month");
				monthAsString = sc.nextLine();
				System.out.println("Enter birth day");
				dateAsString = sc.nextLine();
				if (yearAsString.matches("\\d+") && monthAsString.matches("\\d+") && dateAsString.matches("\\d+")) {
					break;
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();;
			}

		} while (true);
		year = Integer.parseInt(yearAsString);
		month = Integer.parseInt(monthAsString);
		date = Integer.parseInt(dateAsString);

		LocalDate birthDay = LocalDate.now().of(year, month, date);
		LocalDate now = LocalDate.now();

		// Period period = Period.between(birthDay, now);
		long dayLived = ChronoUnit.DAYS.between(birthDay, now);
		return dayLived;

	}
}
