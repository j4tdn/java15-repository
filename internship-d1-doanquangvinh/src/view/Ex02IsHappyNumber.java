package view;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex02IsHappyNumber {
	public static void main(String[] args) {
		System.out.print("Enter number :");
		int	n = new Scanner(System.in).nextInt();
		System.out.println(isHappyNumber(n));
		
	}

	public static boolean isHappyNumber(int n) {
		Set<Integer> nonDuplicateNumber = new LinkedHashSet<Integer>();
		
		while (n != 1) {
			int total = 0;
			int   tmp = n;
			while (tmp != 0) {
				total+= (tmp%10)*(tmp%10);
				tmp/=10;
				System.out.println(total);
			}
			n = total;
			
			if (nonDuplicateNumber.contains(n)) {
				return false;
			} else {
				nonDuplicateNumber.add(n);
			} 
		}
		return true;
	}
}
