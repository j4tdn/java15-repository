package testbaitap;

import baitap.Vehicle;

public class Bai2 {
	public static void main(String[] args) {
		Vehicle vh1 = new Vehicle("huy", "ab", 50, 350000);
		Vehicle vh2 = new Vehicle("danh", "nvx", 150, 500000);
		Vehicle vh3 = new Vehicle("khanh", "spcup", 300, 1000000);
		
		System.out.println(vh1);
		System.out.println(vh2);
		System.out.println(vh3);
	}

}
