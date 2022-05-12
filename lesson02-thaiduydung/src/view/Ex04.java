package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		System.out.print("Enter size of integers: ");
		int size = new Scanner(System.in).nextInt();
		//Create random array
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = new Random().nextInt(51);	
		}
		System.out.println("Original array: " + Arrays.toString(arr));
		// find the second largest
		int max1 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1 && arr[i] > max1) {
			
				max1 = arr[i];
			}
		}
		if (arr.length >= 2 && max1 != 0) {
			System.out.println("The second largest number in array: " + max1);
		} else {
			System.out.println("This array haven't the second largest number");
		}
	}
}