package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01Review {
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("date: " +date);
		
		System.out.println("===========");
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println("cal: " +cal);
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("current year: "  +year);
		
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("current day:" +dayOfMonth);
		
		System.out.println("===============");
		
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String dateAsString = "02/07/2022";
		try {
			Date parsedConvert = df.parse(dateAsString);
			System.out.println("parsedDate:" +parsedConvert);
			
			Calendar parsedCal = Calendar.getInstance();
			parsedCal.setTime(parsedConvert);
			System.out.println("parsedCal" +parsedCal);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
