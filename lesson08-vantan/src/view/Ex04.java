package view;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		int m = 15;
		int n = 75;
		if (isEquivalenPrime(m, n)) {
			System.out.println("YESS");
		}else {
			System.out.println("NO");
		}
		System.out.println(isEquivalenPrime2(m, n));
		
	}
	//Hàm trả về số nguyên tố
	private static boolean isPrimeNumber(int number) {
		if(number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	//hàm trả về ước là số nguyên tố của 1 số
	private static int[] getSubmultiplePrimeNumber(int number) {
		int[] result  = new int[number];
		int count = 0;
		for (int i = 1; i <= number/2; i++) {
			if((number % i == 0) && isPrimeNumber(i)){
				result[count++] = i;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	//Hàm kiểm tra xem 2 số có phải là nguyên tố tương đương hay ko cách 1
	private static boolean isEquivalenPrime(int m, int n) {
		
		return (Arrays.equals(getSubmultiplePrimeNumber(m), getSubmultiplePrimeNumber(n)));
	}
	//cách 2
	private static boolean isEquivalenPrime2(int m, int n) {
		if(getSubmultiplePrimeNumber(n).length != getSubmultiplePrimeNumber(n).length) {
			return false;
		}
		for (int i = 0; i < getSubmultiplePrimeNumber(n).length; i++) {
			if(getSubmultiplePrimeNumber(n)[i] != getSubmultiplePrimeNumber(m)[i]) {
				return false;
			}
		}
		return true;
	}
}
