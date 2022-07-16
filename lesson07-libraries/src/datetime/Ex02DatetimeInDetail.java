package datetime;

import java.util.Calendar;

public class Ex02DatetimeInDetail {
	public static void main(String[] args) {
           Calendar c = Calendar.getInstance();
           
           System.out.println("Day of Month :" + c.get(Calendar.DAY_OF_MONTH));
           System.out.println("Day of Year :" + c.get(Calendar.YEAR));
           // slides
           int dayinMonth = c.get(Calendar.DAY_OF_MONTH);
           System.out.println(dayinMonth);
           
	}
}
