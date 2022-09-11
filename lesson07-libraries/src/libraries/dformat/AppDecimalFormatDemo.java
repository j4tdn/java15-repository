package libraries.dformat;

import java.text.DecimalFormat;
import java.util.Locale;

public class AppDecimalFormatDemo {
	public static void main(String[] args) {
		double value = 12361863218.1633d;
		System.out.println("Value " + value);
		
		//# 0:phan nguyen, thap phan
		// , : gom nhom cho phan nguyen
		// . : ngan cach phan nguyen va phan thap phan
		// tieu chuan : phan nguyen -- > # ,
		//			  : phan thap phan --> . # 0
		
		Locale.setDefault(new Locale("da, DK"));
		String pattern  = "#,###.##";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted " + df.format(value));
	}
}
