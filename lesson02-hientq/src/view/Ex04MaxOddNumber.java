package view;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04MaxOddNumber {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] nums;
		int size = inputPositiveValueOnly("Nhap so luong gia tri muon thuc hien: ","Invalid number! Please try again!");
		nums = new int[size];
		for(int i = 0; i < nums.length; i++) {
			
			nums[i] = inputValue("Nhap phan tu thu "+i+": ","Invalid number! Please try again!");
		}
		int maxOddNum = findMaxOddNumber(nums);
		String result = maxOddNum == 0? "Khong co phan tu nao la so le!" : maxOddNum + " la phan tu so le lon nhat!";
		System.out.println(result);
		
	}
	
	private static int findMaxOddNumber(int[] nums) {
		int[] oddNums = new int[nums.length];
		int indexOfAnOddNum = -1;
		int maxOddNum;
		for (int i = 0; i < nums.length; i++) {
			if(isOddNumber(nums[i])) {
				oddNums[i] = nums[i];
				indexOfAnOddNum = i;
			}
		}
//		System.out.println(Arrays.toString(oddNums));
		if(indexOfAnOddNum == -1) {
			maxOddNum = 0;
			return maxOddNum;
		} else {
			maxOddNum = oddNums[indexOfAnOddNum];
			for(int i = 0; i < oddNums.length; i++) {
				if(oddNums[i] != 0) {
					if(oddNums[i] > maxOddNum) {
						maxOddNum = oddNums[i];
					}
				}
			}
		}
		return maxOddNum;
		
		
	}
	
	// Check odd number
	private static boolean isOddNumber(int n) {
		return n % 2 != 0;
	}
	
	// Validation only numberic value
	private static int inputValue(String promt, String error) {
		int n;
		while(true) {
			System.out.print(promt);
			String nInText = sc.nextLine();
			if(nInText.matches("-?\\d+")) {
				n = Integer.parseInt(nInText);
				break;
			} else {
				System.out.println(error);
			}
		}
		return n;
	}

	// Validation only positive value (n >= 0)
	private static int inputPositiveValueOnly(String promt, String error) {
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
}
