package ex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Calendar c1 = Calendar.getInstance();
		Scanner ip = new Scanner(System.in);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println("Enter your love start date(dd/MM/yyyy):");
			String in = ip.nextLine();
			ip.close();
			Date date = dateFormat.parse(in);
			c.setTime(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long time = c.getTimeInMillis();
		long time1 = c1.getTimeInMillis();
		long second = (time1 - time) / (1000);
		long min = second / 60;
		long hour = min / 60;
		long day = hour / 24;
		long month = day / 30;
		long year = month / 12;
		System.out.println("-----Your love time-----");
		System.out.println(year + "years        " + month + "months        " + day + "days         " + hour + "hours     "
				+ min + "mins     " + second + "seconds");
	}
}
