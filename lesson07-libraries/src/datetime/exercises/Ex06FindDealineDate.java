package datetime.exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex06FindDealineDate {
	private static DateFormat df = new SimpleDateFormat("EEEE dd/MM/yyyy");
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, Calendar.JUNE, 7);
		int count = 0;
		while(count < 110) {
			cal.add(Calendar.DAY_OF_WEEK, 1);
			if(cal.get(Calendar.DAY_OF_WEEK) != Calendar.SATURDAY &&
					cal.get(Calendar.DAY_OF_WEEK) != Calendar.SUNDAY ) {
				count++;
				if(count == 110) {
					
					System.out.println(df.format(cal.getTime()));
				}
			}
		}
	}
}
