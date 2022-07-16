package view;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Scanner;

public class Ex01UtiRelationship {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Calendar loveDay = Calendar.getInstance();
		System.out.print("Enter date start dating: ");
		do {
			String loveDate = sc.nextLine();
			try {
				loveDay = convertToCalendar(loveDate);
				break;
			} catch (Exception e) {
				System.out.println("Invalid DateFormat(dd/mm/yyyyy)");
			}
		} while (true);
		showCountLoveDay(loveDay);
		showCountOfLoveDay(loveDay);
	}
	
	private static void showCountOfLoveDay(Calendar loveDay) {
		String[] dayInWeek = { "Thứ Hai", "Thứ Ba", "Thứ Tư", "Thứ Năm", "Thứ Sáu", "Thứ Bảy", "Chủ Nhật" };
		System.out.println("what day is the date: " + dayInWeek[(loveDay.get(Calendar.DAY_OF_WEEK) - 1)]);
	}

	private static void showCountLoveDay(Calendar loveDay) {
		LocalDate lovelocalDate = LocalDate.of(loveDay.get(Calendar.YEAR), (loveDay.get(Calendar.MONTH) + 1),
				loveDay.get(Calendar.DAY_OF_MONTH));
		LocalDate curentDate = LocalDate.now();

		Period period = Period.between(lovelocalDate, curentDate);
		System.out.print("Number of days in love: ");
		System.out.println(period.getYears() + "years, " + period.getMonths() + "months, " + period.getDays() + "days");
	}


	static Calendar convertToCalendar(String sdate) throws ParseException {
		if (sdate.isEmpty()) {
			return null;
		}
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
		Date date = df.parse(sdate);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
}
