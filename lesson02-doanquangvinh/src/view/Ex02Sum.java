package view;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex02Sum {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter your 1st elements :");
		int elements1 = ip.nextInt();
		System.out.println("Enter your 2nd elements :");
		int elements2 = ip.nextInt();
		System.out.println("Enter your 3rd elements :");
		int elements3 = ip.nextInt();
		System.out.println("Enter your 4th elements :");
		int elements4 = ip.nextInt();
		
		
		BigInteger result1 = caculateFactorial(elements1);
		System.out.println("1"+result1);
		BigInteger result2 = caculateFactorial(elements2);
		System.out.println("2"+result2);
		BigInteger result3 = caculateFactorial(elements3);
		System.out.println("3"+result3);
		BigInteger result4 = caculateFactorial(elements4);
		System.out.println("4"+result4);
		BigInteger total = result1.add(result2).add(result3).add(result4);
		System.out.println("Total of this Expression :" + total);
	}

	public static BigInteger caculateFactorial(long input) {
		long nFactorial = 1;
		BigInteger rsBigInteger = BigInteger.ONE;
		for (long i = nFactorial; i <= input; i++) {
			rsBigInteger = rsBigInteger.multiply(BigInteger.valueOf(i));
		}
		return rsBigInteger;
	}
}
