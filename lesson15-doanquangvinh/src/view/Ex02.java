package view;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class Ex02 {
	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> sortedMap = new HashMap<>();
		Scanner ip = new Scanner(System.in);
		String target = ip.nextLine();
		int maxValue = Integer.MIN_VALUE;
		char maxKey = '0';
		int frequency = 0;
		if (target.matches("[a-zA-Z]+")) {
			for (int i = 0; i < target.length(); i++) {
				if (map.containsKey(target.charAt(i))) {
					frequency = map.get(target.charAt(i));
					frequency++;
					map.put(target.charAt(i), frequency);
				} else {
					map.put(target.charAt(i), 1);
				}
			}
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
		//	System.out.println(entry.getKey() + " " + entry.getValue());
			if (entry.getValue() >= maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
				sortedMap.put(entry.getKey(), entry.getValue());
			}
		}
		String mapAsString = sortedMap.entrySet().stream()
				                                  .map(k -> k.getKey() + " " + k.getValue())
				                                  .collect(Collectors.joining(","));
		System.out.println(mapAsString);
	}
}
