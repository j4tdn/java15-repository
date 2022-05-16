package view;

import java.util.Random;

public class RandomPassword {
	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] storage = new int[5];
		int x;
		int count = 0;
		do {
			x = rd.nextInt(20, 30);
			if(isExists(storage, x, count)) {
				continue;
			}
			storage[count++] = x;
			System.out.println(x);
			
		}while (count < 5);
	
		
	}
	private static boolean isExists(int[] storage, int x, int count) {
		for (int i = 0; i < count; i++) {
			if(storage[i] == x) {
				return true;
			}
		}
		return false;
	}
}
