package libraries.dformat;

import java.text.DecimalFormat;
import java.util.Locale;

public class AppDecimalFormatDemo {
	public static void main(String[] args) {
		double value = 1778394985688.996d;
		System.out.println("value: " + value);
		// 0 # : phần nguyên , thập phân
		// , : gom nhóm cho phần nguyên
		//. :  ngăn cách cho phần nguyên và thập phần
		
	    String pattern = "#,###.0000";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted: " +   df.format(value));
		
	}

}
