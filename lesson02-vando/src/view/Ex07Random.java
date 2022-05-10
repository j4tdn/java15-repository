package view;

import java.util.ArrayList;
import java.util.Random;

public class Ex07Random {
	
	public static ArrayList generate(int number) {
		ArrayList tmp = new ArrayList();
		int count = 0;
		int value;
		boolean flag;

		while (count < number) {
			flag = false;
			value = (int) (Math.random() * (30 - 20 + 1) + 20);
			for (int i = 0; i < tmp.size(); i++) {
				if (((Integer) tmp.get(i)).intValue() == value) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				tmp.add(value);
				count++;
			}
		}
		return tmp;
	}

	public static void main(String[] args) {

		ArrayList arrInt = generate(5);
		System.out.print(arrInt);
	}
	
}
