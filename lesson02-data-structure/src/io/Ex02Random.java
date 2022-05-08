package io;

import java.util.Random;

public class Ex02Random {
		public static void main(String[] args) {
			Random rd = new Random();
			int number = rd.nextInt(26,35);
			System.out.println(number);
			
			String[] tk = {"Lan", "Hue", "Ha", "Huy"};
			String t= tk[rd.nextInt(tk.length)];
			System.out.println(t);
		}
}
