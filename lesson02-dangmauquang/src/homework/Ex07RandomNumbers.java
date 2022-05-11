package homework;

import java.util.Random;
/**
 * @author dangm
 * Chưa làm 5 số khác nhau được
 */
public class Ex07RandomNumbers {
	public static void main(String[] args) {
		randomNumber();
	}
	public static void randomNumber() {
		Random rd = new Random();
		for (int i = 1; i <= 5; i++) {
			int a = rd.nextInt(20, 30);
			System.out.print(a + " ");
		}
	}

}
