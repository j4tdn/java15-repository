package datetime.exercises;

import java.util.Calendar;

public class Ex03 {
	public static void main(String[] args) {
		String[] cars = { "Chunhat", "Thuhai", "Thuba", "Thutu", "Thunam", "Thusau", "Thubay"  };
		Calendar c = Calendar.getInstance();
		int day =  c.get(Calendar.DAY_OF_WEEK) ; 
		
		System.out.println(day);
		
				System.out.println(cars[day]);
		
		
	}
}
