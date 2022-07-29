package libraries.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AppMathDemo {
	public static void main(String[] args) {
		// round , roundUp , roundDown , roundCommercial
		double value = 235.5638d;
		System.out.println("Value :" + value);

		System.out.println("Rounding : " + Math.round(value));
		System.out.println("Rounding : " + Math.ceil(value)); // roundUp
		System.out.println("Rounding : " + Math.floor(value)); // roundDown
		// big number , add , subtract , multiply , divide , rounding
		// BigInteger
		// BigDecimal

		BigDecimal a = BigDecimal.valueOf(235.6344);
		BigDecimal b = BigDecimal.valueOf(12.555);
		a = a.setScale(2, RoundingMode.HALF_UP);
		
		BigDecimal result = a.multiply(a.add(b)).divide(b,2,RoundingMode.HALF_UP);
		System.out.println("result " + result);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		// 123E^24
		// ===> split 
		double hugeValue = 1231218517589175d;
		System.out.println("huge value : " + hugeValue);
		BigDecimal huge = BigDecimal.valueOf(hugeValue);
		System.out.println("huge :" + huge);
	}
}
