package ex02;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ex02 {
	public static void main(String[] args) {
		String str1 = "aaaababbbddc";
		String str2 = "aaaaccdcec";
		Map<String, Integer> mapStr1 = changeToMap(str1);
		Map<String, Integer> mapStr2 = changeToMap(str2);
		print(mapStr2, getMaxChar(mapStr2));
	}

	private static Map<String, Integer> changeToMap(String array) {
		String[] elements = array.split("");
		Map<String, Integer> numMap = new TreeMap<String, Integer>();
		for (int i = 0; i < elements.length; i++) {
			if (numMap.containsKey(elements[i])) {
				int count = numMap.get(elements[i]) + 1;
				numMap.put(elements[i], count);
			} else {
				numMap.put(elements[i], 1);
			}
		}
		return numMap;
	}

	public static int getMaxChar(Map<String, Integer> map) {
		int result = 0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			result = Math.max(result, entry.getValue());
		}
		return result;
	}

	public static void print(Map<String, Integer> map, int max) {
		String[] result = map.entrySet()
				.stream()
				.filter(t -> t.getValue() == max)
				.map(t -> t.getKey())
				.toArray(String[]::new);
		System.out.println(String.join(", ", result));
	}
}
