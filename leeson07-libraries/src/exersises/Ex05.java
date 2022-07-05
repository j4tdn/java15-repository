package exersises;

import java.time.DayOfWeek;
import java.util.Calendar;

public class Ex05 {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(sunDayOfMoth(calendar));
		System.out.println();
	}
	 public static int sunDayOfMoth(Calendar calendar) {
		 dayOfMonth(calendar);
		 int dayOfWeek =calendar.get(Calendar.DAY_OF_WEEK);
		 int dayOfMonth = 0;;
		 int count = 0;
		 calendar.set(Calendar.DAY_OF_MONTH, 0);
		 while(true) {
			 dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
			 dayOfMonth++;
			calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
			if(Calendar.DAY_OF_WEEK == 1) {
				count ++;
			}
			if(dayOfMonth> dayOfMonth(calendar) ) {
				break;
			}
			
			 
			 
		 }
		 
		 return count;
		 
	 }
	 public static int dayOfMonth(Calendar calendar) {
			switch (calendar.get(calendar.MONTH) + 1) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				if (check(calendar)) {
					return 29;
				}

				else {
					return 28;
				}
			default:
				System.out.println("so thang khong hop le");
				return 0;

			}
		}

		public static boolean check(Calendar calendar) {
			if (calendar.get(Calendar.YEAR) % 400 == 0) {
				return true;

			}
			if (calendar.get(Calendar.YEAR) % 4 == 0 && calendar.get(Calendar.YEAR) % 100 != 0) {
				return true;
			}
			return false;

		}
	}


