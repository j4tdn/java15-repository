package homework;

import java.util.Random;

public class Task01Power {
	public static void main(String[] args) {
		int testNumber = new Random().nextInt(1000);
		System.out.println("testnumber: " +testNumber);
		
		System.out.println("test number is power: " +checkPower(testNumber));
	}
	public static boolean checkPower(int x) {
		boolean isPower = false;
		int compareNumber = 2;
		for (int i = 0; i < (x/2); i++) {
			compareNumber *= 2;
			if(compareNumber == x) {
				isPower = true;
				break;
			}
		}
		return isPower;
	}
}
