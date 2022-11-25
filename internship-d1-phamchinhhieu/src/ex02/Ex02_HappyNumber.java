package ex02;

import java.util.HashSet;
import java.util.Set;

public class Ex02_HappyNumber {
	public static void main(String[] args) {
		System.out.println("19 is happyNumber:" + isHappyNumber(19));
		System.out.println("12 is happyNumber:"+isHappyNumber(12));
		System.out.println("14 is happyNumber:"+isHappyNumber(14));
	}

	private static boolean isHappyNumber(int number) {
		Set<Integer> choose = new HashSet<>();
		int sum = 0, temp;
	
		while (choose.add(number)) {  //nếu phần tử mới thêm vào trùng với phần tử trong set thì return false
			while (number > 0) {
				temp = number % 10;
				sum += temp * temp;
				number /= 10;
//				System.out.println(sum);
			}
			if (sum == 1)
				return true;
			
			else {
				number = sum;
				sum = 0;
			}
		}
		return false;
	}
}
