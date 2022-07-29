package libraries.math;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class AppMathDemo {
	public static void main(String[] args) {
		double number = 235.2638d;
		System.out.println("Value: " + number);

		System.out.println("Rounding: " + Math.round(number));
		System.out.println("Rounding: " + Math.ceil(number));
		System.out.println("Rounding: " + Math.floor(number));

		// big number, add, subtract, multiply, divide, rounding
		// BigInteger
		// BigDecimal

		BigDecimal a = BigDecimal.valueOf(235.6374);
		BigDecimal b = BigDecimal.valueOf(12.555);

		a = a.setScale(2, RoundingMode.HALF_UP);
		b = b.setScale(2, RoundingMode.HALF_UP);

		BigDecimal result = a.multiply(a.add(b)).divide(b, 2, RoundingMode.HALF_UP);

		System.out.println(a);
		System.out.println(b);
		System.out.println(result);
		
		// 123E^24
		// ===> 
		double hugeValue = 876123872782736d;
		System.out.println("hugeValue: " + hugeValue);
		
		BigDecimal huge = BigDecimal.valueOf(hugeValue);
		System.out.println("Huge: " + huge);
	}
}
