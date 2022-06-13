package baitaplogic;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TimSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n");
		int n = Integer.parseInt(sc.nextLine());
		int l = 0;
		int count = 0;
		int[] nums = new int[100];
		do {
			l = new Random().nextInt(100)+1;
			if (compare(nums, l, count)) {
				continue;
			} else {
				sleep(100);
				System.out.print(l + " ");
				nums[count++] = l;
				if (count % 5 == 0) {
					System.out.println("\n");
				}
			}
		} while (n != l);
	}

	private static boolean compare(int[] a, int b, int c) {
		for (int i = 0; i < c; i++) {
			if (a[i] == b) {
				return true;
			}
		}
		return false;
	}
	private static void sleep(long milisecon) {
		try {
			TimeUnit.MILLISECONDS.sleep(milisecon);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
