package exercise;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Ex08 {
public static void main(String[] args) {
		
		// creating the date 1 with sample input date.
		Date date1 = new Date(2022, 7, 8);
		
		// creating the date 2 with sample input date.
		Date date2 = new Date(2015, 9, 27);
		
		// getting milliseconds for both dates
		long date1InMs = date1.getTime();
		long date2InMs = date2.getTime();
		
		// getting the diff between two dates.
		long timeDiff = 0;
		if(date1InMs > date2InMs) {
			timeDiff = date1InMs - date2InMs;
		} else {
			timeDiff = date2InMs - date1InMs;
		}
		
		// converting diff into days
		int daysDiff = (int) (timeDiff / (1000 * 60 * 60* 24));
		
		// print diff in days
		System.out.println("No of days diff is : "+daysDiff);
		
	}
}
