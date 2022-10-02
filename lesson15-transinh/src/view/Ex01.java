package view;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex01 {
	public static void addElement(Map<Integer, Integer> map, int element) {
		if (map.containsKey(element)) {
			int count = map.get(element) + 1;
			map.put(element, count);
		} else {
			map.put(element, 1);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số phần tử của mảng: ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Nhập các phần tử của mảng:");
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] = ", i);
			arr[i] = scanner.nextInt();
		}
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			addElement(map, arr[i]);
		}
		System.out.println("Các phần tử xuất hiện 1 lần:");
		for (Integer key : map.keySet()) {
			if(map.get(key)==1) {
				System.out.println(key);
			}
		}
		System.out.println("Các phần tử xuất hiện nhiều hơn lần:");
		for (Integer key : map.keySet()) {
			if(map.get(key)!=1) {
				System.out.println(key);
			}
		}
	}
}