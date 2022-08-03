package libraries.dformat;

import java.text.DecimalFormat;
import java.util.Locale;

public class AppDecimalFormatDemo {
	public static void main(String[] args) {
		double value = 2342343123534.513d;
		System.out.println("value: "+value);
		
		// # 0:phần nguyên, thập phân
		// , : gom nhóm cho phần nguyên
		// . : ngăn cách cho phần nguyên và thập phân
		// tiêu chuẩn : phần nguyên    -> # ,
		//				phần thập phân -> . # 0\
		
		Locale.setDefault(Locale.ENGLISH);
		//Locale.setDefault(new Locale("da","DK"));
		
		String pattern = "#,###.000";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted: "+df.format(value));
	}
}