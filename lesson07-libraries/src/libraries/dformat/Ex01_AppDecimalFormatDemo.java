package libraries.dformat;

import java.text.DecimalFormat;

public class Ex01_AppDecimalFormatDemo {
	public static void main(String[] args) {
		double value = 23456789.456d;
		//0 #: phần nguyên, thập phân;
		// , :gom nhóm cho phần nguyên
		// . : ngắn cách
		//tiêu chuẩn: phần nguyên --> #,
		//			  phần thập phân --> . # 0
		
		String pattern = "#,###.##";
		DecimalFormat df = new DecimalFormat(pattern);
		System.out.println("formatted: " + df.format(value));
	}
}
