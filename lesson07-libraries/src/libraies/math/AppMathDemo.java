package libraies.math;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AppMathDemo {
	public static void main(String[] args) {
		
		//Math.min(0, 0)
		
		//round, roundUp, roundDown. roundCommercial
		double value = 234.34567d;
		System.out.println("Value: " + value);
		System.out.println("Rounding: " + Math.round(value));
		System.out.println("Rounding: " + Math.ceil(value)); //roundUp
		System.out.println("Rounding: " + Math.floor(value));//roundDown
		
		//bignumber, add, subtract, multiply, divide, rounding
		//BigInteger
		//BigDecimal
		
		BigDecimal a = BigDecimal.valueOf(234.34567);
		BigDecimal b = BigDecimal.valueOf(12.555);
		
		a = a.setScale(2, RoundingMode.HALF_UP);// làm tròn
		
		BigDecimal result = a.multiply(a.add(b)).divide(b, 2, RoundingMode.HALF_UP);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("result: " + result);
		
		
		// 123E^12
		double c = 1231421423452324d;
		System.out.println("c: " + c);
		
		BigDecimal huge = BigDecimal.valueOf(c);
		System.out.println("huge: " + huge);
		
		
		
		
	}
}
