package libraries.dformat;

import java.text.DecimalFormat;
import java.util.Locale;

public class AppDecimalFormatDemo {
	public static void main(String[] args) {
		double value = 8293899410.38102d;
		System.out.println("value: " + value);
		
		// 0 # : phần nguyên, phần thập phân
		// , : gom nhóm cho phần nguyên
		// . : ngăn cách phần nguyên và phần thập thân
		// tiêu chuẩn: phần nguyên 		--> # ,
		// 			   phần thập phân 	--> . # 0
		
		String pattern = "#,###.0000000000";
		Locale.setDefault(new Locale("da", "DK"));
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted: " + df.format(value));
	}
}
