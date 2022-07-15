package ex01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;


public class Ex01 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Calendar loveDay = Calendar.getInstance();
		System.out.print("Nhập ngày bắt đầu hẹn hò: ");
		
		do {
			String loveDate = sc.nextLine();
			try {
				loveDay = convertToCalendar(loveDate);
				break;
			} catch (Exception e) {
				System.out.println("Invalid DateFormat (dd/mm/yyyy)");
			}
		} while (true);
		
		showDayOfLoveDate(loveDay);
		showCountLoveDay(loveDay);
		
		
	}
	
	private static void showCountLoveDay(Calendar loveDay) {
		LocalDate loveLocalDate = LocalDate.of(loveDay.get(Calendar.YEAR), (loveDay.get(Calendar.MONTH) + 1), loveDay.get(Calendar.DAY_OF_MONTH));
		LocalDate currentDate = LocalDate.now();
		
		Period period = Period.between(loveLocalDate, currentDate);
		System.out.println("=======Số ngày yêu nhau========");
		System.out.println(period.getYears() + " years, " 
				+ period.getMonths() + " months, " 
				+ period.getDays() + " days");
	}

	private static void showDayOfLoveDate(Calendar loveDay) {
		String[] daysInWeek = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy"};
		System.out.println("Ngày hẹn hò là ngày thứ: " + daysInWeek[(loveDay.get(Calendar.DAY_OF_WEEK) - 1)]);
		
	}

	static Calendar convertToCalendar(String sdate) throws ParseException {
		if(sdate.isEmpty()) {
			return null;
		}
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date date = df.parse(sdate);
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		return c;
	}
}