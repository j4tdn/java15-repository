package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import common.WeekDayType;

public class Ex03 {
	private static DateFormat df1 = new SimpleDateFormat("d/M/y");

	public static void main(String[] args) {
		WeekDayType[] weekDateAsString = WeekDayType.values();
		DateFormat df = new SimpleDateFormat("d/M/y hh:mm:ss");
		Calendar c = Calendar.getInstance();
		c.setTimeZone(TimeZone.getTimeZone("Asia/Seoul"));
		System.out.println("Câu a: "+ c.get(Calendar.DAY_OF_MONTH) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR) + " "
				+ c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
		System.out.println("Câu b: " + "Ngay cuoi cung cua thang " + (c.get(Calendar.MONTH) + 1) + " la ngay: "
				+ c.getActualMaximum(Calendar.DAY_OF_MONTH));
		c.set(Calendar.DAY_OF_MONTH, 16);
		c.add((Calendar.DAY_OF_MONTH), c.getFirstDayOfWeek() - c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Câu c: " +"Cac ngay trong tuan nay la: ");
		for (int i = 1; i <= 7; i++) {

			String formatted = df1.format(c.getTime());
			System.out.println(formatted);
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("===========");
		c.set(Calendar.DAY_OF_MONTH, 16);
		String formatted = df1.format(c.getTime());
		System.out.println("Câu d: " + formatted + " dang la tuan thu " + c.get(Calendar.WEEK_OF_YEAR) + " trong nam");
		c.add(Calendar.DAY_OF_MONTH, 20);
		formatted = df1.format(c.getTime());
		System.out.println("Câu e: " + "20 ngay sau la ngay: " + formatted + " ; " + weekDateAsString[c.get(Calendar.DAY_OF_WEEK) - 1]);
		BirthDay();
	}
	private static void BirthDay() {

		int count = 0;
		Calendar now = Calendar.getInstance();
		Date cDate1 = now.getTime();
		String cDateFormat1 = df1.format(cDate1);
		Calendar date = Calendar.getInstance();
		date.set(2002, Calendar.JUNE, 9);
		count = 0;
		LocalDate datestart = LocalDate.of(2002, Month.JUNE, 9);
		LocalDate datenow = LocalDate.now();
		while(true) {
			count++;
			LocalDate datestart1 = datestart.plusDays(1);
			datestart = datestart1;
			if(datenow.equals(datestart)) {
				break;
			}
		}
		System.out.println("Câu f: " + "Toi da song duoc: " + count + " ngay" );
	}

}