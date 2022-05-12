package view;

import java.util.Scanner;

public class Ex02Factorial {
	private static Scanner sc = new Scanner(System.in);
	/**
	 * Function input value tu ban phim va return ve ket qua
	 * @param promt
	 * @param error
	 * @return
	 */
	private static int inputValueInto(String promt, String error) {
		int n;
		while (true) {
			System.out.print(promt);
			String nInText = sc.nextLine();
			if (nInText.matches("\\d+")) {
				n = Integer.parseInt(nInText);
				break;
			} else {
				System.out.println(error);
			}
		}
		return n;
	}
	/**
	 * Function return giai thua cua tham so n
	 * @param n
	 * @return
	 */
	private static long factorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	public static void main(String[] args) {
		long sum = 0;
		int length = inputValueInto("Nhap so luong so hang muon tinh tong: ", "Invalid number! Please try again!");
		int[] nums = new int[length];
		String outputText = "S = ";
		for(int i = 0; i < length; i++ ) {
			nums[i] = inputValueInto("Nhap so hang thu "+(i+1)+": ", "Invalid number! Please try again!");
			sum += factorial(nums[i]);
			
			outputText = i != 0? outputText.concat(" + "+nums[i]+"!") : outputText.concat(nums[i]+"!");
		}
		System.out.println(outputText+" = "+sum);
		
	}
}
