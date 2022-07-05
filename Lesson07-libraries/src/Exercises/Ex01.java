package Exercises;

import java.util.Calendar;

public class Ex01 {
		public static void main(String[] args) {
	
			Calendar c = Calendar.getInstance();
		
			
			System.out.println(c);
			
		
			int day = c.get(Calendar.DAY_OF_MONTH);
			int month = c.get(Calendar.MONTH) + 1;
			int year = c.get(Calendar.YEAR);
			System.out.println("DMY: " + (day + "/" + month + "/" + year));
			
		
			
		}
	}

