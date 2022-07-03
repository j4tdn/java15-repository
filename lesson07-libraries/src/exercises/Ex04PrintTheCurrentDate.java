package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex04PrintTheCurrentDate {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		//date --> string
		Date date = new Date();
		String dateFormat = df.format(date);
		System.out.println("date format: " + dateFormat);
		
	}
}
