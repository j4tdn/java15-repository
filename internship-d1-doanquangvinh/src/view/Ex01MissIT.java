package view;

import java.util.Iterator;
import java.util.Scanner;

public class Ex01MissIT {
	public static void main(String[] args) {

	}
    public static void scoreRecord(int n) {
    	int n = new Scanner(System.in).nextInt();
    	int score = 0;
    	for (int i = 0; i < n ; i++) {
			System.out.println("");
			for (int j = 0; j < 4; j++) {
				System.out.println("The " + j+1 + "Judge Enter Score :");
				score = new Scanner(System.in).nextInt();
			}
		}
    }
}
