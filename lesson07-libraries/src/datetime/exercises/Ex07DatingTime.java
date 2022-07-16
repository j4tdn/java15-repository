package datetime.exercises;

import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex07DatingTime {
	public static void main(String[] args) {
            Calendar start = DateUtils.getInstance(8, Calendar.JULY, 2022,22, 5,5);
            Calendar now = Calendar.getInstance();
            System.out.println(now);
            Date now1 = new Date();
            System.out.println(now1);
            String duration= DateUtils.between(start,now);
            System.out.println("duration :" + duration);
            Calendar calendar = Calendar.getInstance();
           
            System.out.println( calendar.get(Calendar.WEEK_OF_YEAR));
            
 	}
}

