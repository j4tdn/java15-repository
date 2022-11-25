package ex01;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		printMissIt();
	}
	
	private static void printMissIt() {
		System.out.print("Enter N: ");
		int n = Integer.parseInt(ip.nextLine());
		System.out.println("Enter list Miss IT");
		int[][] numbers = enter(n);
		print(numbers);
		HashMap<Integer, Contestant> contestants = new HashMap<Integer, Contestant>();
		for(int i = 0; i<n; i++) {
			int row = numbers[i][0];
			for(int j=1; j <= row; i++) {
				Contestant tmp = new Contestant(numbers[i][j], 0, 0, 0);
				if(!contestants.containsKey(tmp.getId())) {
					contestants.put(tmp.getId(), tmp);
				}
				Contestant tmpContestant = contestants.get(numbers[i][j]);
				switch(j) {
				case 1:
					tmpContestant.setFirstPlaceCounter(tmpContestant.getFirstPlaceCounter() + 1);
					break;
				case 2:
					tmpContestant.setSecondPlaceCounter(tmpContestant.getSecondPlaceCounter() + 1);
					break;
				case 3:
					tmpContestant.setThirdPlaceCounter(tmpContestant.getThirdPlaceCounter() + 1);
					break;
				default:
					break;
				}
			}
		}
		int max = 0;
		
	}
	
	private static int[][] enter(int n) {
		int[][] result = new int[n][4];
		for(int i = 0; i<result.length; i++) {
			for(int j=0; j<result[i][0]; j++) {
				result[i][j] = Integer.parseInt(ip.nextLine());
			}
		}
		return result;
	}
	
	private static void print(int[][] input) {
		for(int i = 0; i<input.length; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}
}
