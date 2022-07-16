package view;

import java.util.Calendar;
import java.util.Date;

import common.Holiday;
import utils.DateUtils;

public class Ex04 {
	private static final int BUDGET = 110;

	public static void main(String[] args) {
		Calendar c = DateUtils.getInstance(7, Calendar.JUNE, 2022);
		
		int implemetedDates=0;
		while(true) {
			int weekday=c.get(Calendar.DAY_OF_WEEK);
			
			boolean isDayOff=(weekday==Calendar.SATURDAY 
					|| weekday==Calendar.SUNDAY
					||	DateUtils.isHoliday(c, Holiday.getVnmseHolidays()));
			if(!isDayOff) {
				implemetedDates++;
				if(implemetedDates==BUDGET){
					break;
				}
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("Deadline: "+DateUtils.formatDate("dd/MM/yyyy", c));
		
	}
}
