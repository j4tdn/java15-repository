package ex03;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		int number = 4;
		System.out.println(happyNumber(number));

	}

	private static boolean happyNumber(int number) {
		Set<Integer> loop = new HashSet<>();
		int sum = 0, remain;
		//System.out.println(inLoop.add(5)); true
	//	System.out.println(inLoop.add(5)); false
		while (loop.add(number)) {  //nếu phần tử mới thêm vào trùng với phần tử trong set thì return false
			while (number > 0) {
				remain = number % 10;
				sum += remain * remain;
				number /= 10;  
			}
			if (sum == 1)
				return true;
			
			else {
				number = sum;
			}
		}
		return false;
	}

}
