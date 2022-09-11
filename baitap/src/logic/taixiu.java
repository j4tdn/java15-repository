package logic;

import java.util.Random;

public class taixiu {
	private static Random rd = new Random();
	public static void main(String[] args) {
		int xx1 = rd.nextInt(5) + 1;
		int xx2 = rd.nextInt(5) + 1;
		int xx3 = rd.nextInt(5) + 1;
		
		int sum = xx1 + xx2 + xx3;
		
		System.out.println(sum);
		if(sum > 10) {
			System.out.println("TÀI RỒI NHA");
		}if(sum <= 10) {
			System.out.println("XỈU RỒI NHA");
		}
	}
}
