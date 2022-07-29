package libraries.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AppMathDemo {
	public static void main(String[] args) {
		// round, roundUp, rounDown, roundCommercial
		double value = 235.5638d;
		System.out.println("Value: " + value);
		
		System.out.println("Round: " + Math.round(value));
		System.out.println("RoundUp: " + Math.ceil(value));
		System.out.println("RoundDown: " + Math.floor(value));

		// big number, add, subtract, multiply, divide, rounding
		// BigInteger
		// BigDecimal
		
		BigDecimal a = BigDecimal.valueOf(235.6344);
		BigDecimal b = BigDecimal.valueOf(12.555);
		
		 a = a.setScale(2, RoundingMode.HALF_UP);
		
		BigDecimal result = a.multiply(a.add(b).divide(b, 2, RoundingMode.HALF_UP));
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("result: " + result);
		
		double hugeValue = 12312345678944d;
		System.out.println("hugeValue: " + hugeValue);
		
		BigDecimal huge = BigDecimal.valueOf(hugeValue);
		System.out.println("huge: " + huge);
	}
}