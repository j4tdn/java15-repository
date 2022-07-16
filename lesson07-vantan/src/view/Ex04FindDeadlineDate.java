package view;

import java.util.Calendar;

import common.Holyday;
import utils.DateUtils;

public class Ex04FindDeadlineDate {
	private static final int BUDGET = 4;
	
	public static void main(String[] args) {
		
		Calendar c = DateUtils.getInstance(2022, Calendar.AUGUST, 31);
		int implementDate = 0;
		
		
		while(true) {
			int weekDay = c.get(Calendar.DAY_OF_WEEK);
			boolean dayOff = (weekDay == Calendar.SATURDAY 
					|| weekDay == Calendar.SUNDAY || DateUtils.isHoliday(c, Holyday.getVmnHolyday()));
			
			if(!dayOff) {
				implementDate++;
				if(implementDate == BUDGET) {
					break;
				}
				
			}
			c.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println(DateUtils.format("EEEE dd/MM/yyyy", c));
	}
}
