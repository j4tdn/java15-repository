package Kiemtra;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap n: ");
		int[] arr = new int[sc.nextInt() - 1];
		sc.nextLine();
		
		System.out.print("Mang: ");
		for (int idx = 0; idx < arr.length; idx++) {
			arr[idx] = sc.nextInt();
		}
		System.out.printf("Missing value: ", getMissingNumber(arr));
	}
	 
	static int getMissingNumber(int[] arr) {
		int missingNum = 0;
		int idx = 0;
		
		Arrays.sort(arr);
		if (arr[0] != 1) {
			return 1;
		}
		if(arr[arr.length - 1] != arr.length + 1) {
			return arr.length + 1;
	
		}
		while(idx < arr.length - 1) {
			if(arr[idx + 1] - arr[idx] > 1) {
				missingNum = arr[idx] + 1;
				break;
			}
			else {
				idx++;
			}
		}
		return missingNum;
	}
}
