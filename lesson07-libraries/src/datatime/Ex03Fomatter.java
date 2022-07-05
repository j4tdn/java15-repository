package datatime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03Fomatter {
	public static void main(String[] args) {
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss ");  // date/month/year hour/minute/second
		//DateFormat df= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a "); // date/month/year hour/12/minute/second am/pm
		
		//date --> string
		Date date= new Date();
		String dateFomat=df.format(date);
		System.out.println("dateFormat: "+ dateFomat);
		
		
		
		
		
		//calendar-->string
		Calendar c= Calendar.getInstance();
		Date cDate=c.getTime();
		String cDateFormat = df.format(cDate);
		System.out.println("cdate format: "+ cDateFormat);
	}
}
