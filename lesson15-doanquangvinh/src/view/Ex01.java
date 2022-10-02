package view;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex01 {
	public static void main(String[] args) {
		Map<Integer, Integer> sortedMap = new HashMap<>();
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter length of numbers :");
		int length = ip.nextInt();
		for (int i = 0; i < length; i++) {
	//	System.out.print("Enter number" + i);
		int	number = ip.nextInt();
			if (sortedMap.containsKey(number)) {
			int	count = sortedMap.get(number);
				count++;
				sortedMap.put(number, count);
			} else {
				sortedMap.put(number, 1);
			}
		}
		for (java.util.Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}
