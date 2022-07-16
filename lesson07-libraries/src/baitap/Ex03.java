package baitap;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class Ex03 {
	public static void main(String[] args) {
		dateee();
	}
	private static void dateee() {
		DateFormat df = new SimpleDateFormat("dd/MM/y");

		int count = 0;
		Calendar now = Calendar.getInstance();
		Date cDate1 = now.getTime();
		String cDateFormat1 = df.format(cDate1);
		System.out.print(cDateFormat1 + "    ");
		Calendar date = Calendar.getInstance();
		date.set(2002, Calendar.JUNE, 9);
//		while(true) {
//			count++;
//			date.add(Calendar.DAY_OF_MONTH, 1);
//			Date cDate = date.getTime();
//			String cDateFormat = df.format(cDate);
//			System.out.println(cDateFormat);
//
//			
//			if(cDateFormat.equals(cDateFormat1)) {
//				break;
//			}
//		}
		System.out.println("so ngay:" + count);
		count = 0;
		
		//c2
		LocalDate datestart = LocalDate.of(2002, Month.JUNE, 9);
		LocalDate datenow = LocalDate.now();
		while(true) {
			count++;
			LocalDate datestart1 = datestart.plusDays(1);
			System.out.println(datestart1);
			datestart = datestart1;
			if(datenow.equals(datestart)) {
				break;
			}
		}
		System.out.println("so ngay:" + count);

							
		

	}
}
