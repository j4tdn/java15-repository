package view;

import java.util.HashMap;
import java.util.Set;

public class Ex02 {
	public void countString(String str) {
		int size = str.length();
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		int maxDisplay = 0;

		for (char ch : arr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> set = map.keySet();

		for (char k : set) {
			if (maxDisplay == 0 || map.get(k) > maxDisplay) {
				maxDisplay = map.get(k);
			}
		}

		for (Character k : map.keySet()) {
			if (map.get(k).equals(maxDisplay)) {
				System.out.print(k + " ");
			}
		}
	}

	public static void main(String[] args) {
		String str = "aaaababbbddc";
		Ex02 object = new Ex02();
		object.countString(str);
	}

}