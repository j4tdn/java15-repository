package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

public class Ex01 {
	private static boolean brokeUp = true;
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		LocalDate c = LocalDate.now();
		LocalTime nowTime = LocalTime.now();
		LocalTime starTime = LocalTime.now().withHour(0).withMinute(0).withSecond(0);
		LocalDate lcd = starDating();
		System.out.println("brokeUp???");
		brokeUp = ip.nextBoolean();
		if (brokeUp) {
			System.out.println(c);
		}else {
			System.out.println("Love star day " +lcd.getDayOfWeek());
			System.out.println(Period.between(lcd, c));
			System.out.println(Duration.between(starTime, nowTime));
		}
	}

	private static LocalDate starDating() {

		int year = 0, month = 0, date = 0;

		try {
			System.out.println("Enter year");
			year = Integer.parseInt(ip.nextLine());
			System.out.println("Enter month");
			month = Integer.parseInt(ip.nextLine());
			System.out.println("Enter day");
			date = Integer.parseInt(ip.nextLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		LocalDate c = LocalDate.of(year, month, date);
		return c;
	}
}
