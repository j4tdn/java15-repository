package view;

import java.util.Scanner;

public class Ex04OddMax {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số phần tử: ");
		int element = Integer.parseInt(ip.nextLine());

		int array[] = new int[element];
		for (int i = 0; i < element; i++) {
			System.out.println("Nhập số thứ " + i + ": ");
			array[i] = Integer.parseInt(ip.nextLine());
		}
		for (int number : array) {
			System.out.print(number + " ");
		}
		System.out.println("\n==============================");
		System.out.println("So le lon nhat:"+ OddMax(array, element));
	}

	private static int OddMax(int arr[], int element) {
		int i, vt = -1;
		for (i = 0; i < element; i++) {
			if (arr[i] % 2 != 0) {
				vt = i;
				break;
			}
		}

		for (i = vt + 1; i < element; i++) {
			if (arr[i] % 2 != 0 && arr[i] > arr[vt]) {
				vt = i;
			}
		}
		return arr[vt];
	}

}