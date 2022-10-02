package ex01;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Ex01ListElements {
	public static void main(String[] args) {
		Integer[] N = { 1, 2, 3, 4, 5, 6, 5, 5, 3, 1 };
		Integer[] N1 = { 5, 7, 9, 10, 20, 9, 1, 7, 11, 30 };
		System.out.println("Problem 1: ");
		problem1(N);
		System.out.println("\nProblem 2: ");
		problem2(N1);
	}

	private static void problem1(Integer[] elements) {
		Map<Integer, Integer> numMap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < elements.length; i++) {
			if (numMap.containsKey(elements[i])) {
				int count = numMap.get(elements[i]) + 1;
				numMap.put(elements[i], count);
			} else {
				numMap.put(elements[i], 1);
			}
		}
		for (Integer key : numMap.keySet()) {
			if (numMap.get(key) == 1) {
				System.out.print(key + " ");
			}
		}
	}

	private static void problem2(Integer[] elements) {
		Map<Integer, Integer> numMap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < elements.length; i++) {
			if (numMap.containsKey(elements[i])) {
				int count = numMap.get(elements[i]) + 1;
				numMap.put(elements[i], count);
			} else {
				numMap.put(elements[i], 1);
			}
		}
		for (Integer key : numMap.keySet()) {
			if (numMap.get(key) > 1) {
				System.out.print(key + " ");
			}
		}
	}
}
