package libraries.dformat;

import java.text.DecimalFormat;

public class AppDecimalFormatDemo {
	public static void main(String[] args) {
		double value=2536425636545663d;
		System.out.println("Value: " + value);
		// 0 #: phần nguyên, thập phân
		// , : gom nhóm cho phần nguyên
		// . : ngăn cách phần nguyên và thập phân
		// tiêu chuẩn: phần nguyên --> # ,
		//				phần thập phân --> .# 0
		String pattern="#,###.##";
		DecimalFormat df= new DecimalFormat(pattern);
		System.out.println("formatted: " + df.format(value));
	}
}
