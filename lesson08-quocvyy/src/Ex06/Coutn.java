package Ex06;

import java.util.Scanner;

public class Coutn {
	public static void main(String[] args) {
		String s = " ";
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char[] arr = s.toCharArray();
		for(int i = 0; i <s.length();i++) {
			if(i == 100) {
				System.out.println(arr[i]);
			}
		}
	}

}
