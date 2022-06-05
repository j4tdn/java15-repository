package exam;

import java.util.Random;

public class Ex02_MissNumber {
	public static void main(String[] args) {
		int[] arr1 = Random();
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Phan Tu can tim co gia tri: " + getMissingNumber(arr1));
	}

	private static int[] Random() {
		Random rd = new Random();
		int count = 0;
		int count1 = 0;
		int arr[] = new int[5];
		while (true) {
			int a = rd.nextInt(1, 7);
			for (int i = 0; i < count1; i++) {
				if (a == arr[i]) {
					count++; // nếu số random bị trùng thì tăng count;
					break;
				}
			}
			if (count == 0) {
				arr[count1] = a; // neu khong trùng thì gan so vao mang va tang bien dem;
				count1++;
			}
			if (count1 == 5) {
				break; // dem du 5 so thi dung
			}
			count = 0;
		}
		return arr;

	}

	private static int getMissingNumber(int[] arr1) {
		for (int i = 1; i <= arr1.length; i++) {
			int count = 0;
			for (int j = 0; j < arr1.length; j++) {
				if (i != arr1[j]) {
					count++;
				}
			}
			if (count == 5) {
				return i;
			}
		}
		return 0;
	}

}
