package view;

import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int number =0;
		int n = 0;
		int[] tmps=new int[6];
		int i=0;
		do {
			number = 20 + rd.nextInt(10);
			if (!(compare(tmps,number))) {
				continue;
			}
			tmps[i++]=number;
			n++;
			System.out.println(number);
			if (n == 5) {
				break;
			}
		} while (true);
	}
	private static boolean compare(int[] tmp,int number) {
		for(int i=0;i<tmp.length;i++) {
			if (number==tmp[i]) {
				return false;
			}
		}
		return true;
	}

}
