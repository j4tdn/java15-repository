package view;

import java.util.Random;

public class Ex07Random {
	public static void main(String[] args) {
		int[] results = new int[5];
		results = random();

		System.out.print("Random is the number:");

		for (int i = 0; i < 5; i++) {
			System.out.print(results[i]);
			System.out.print(" ");
		}
	}

	private static int[] random() {
		int count = 0;
		int i = 0;
		
		boolean check = true;
		int[] elements = new int[5];
		Random rd = new Random();
		while (count != 5) {
			
			int number ;
		    number = rd.nextInt(20, 30);
			
			for (int j = 0; j < 5; j++) {
				if (number == elements[j]) {
					check = false;
					break;
				}
				check = true;
			}
			if (check) {
				elements[count] = number;
				count++;
			}

		}
		
		return elements;
	}
}
