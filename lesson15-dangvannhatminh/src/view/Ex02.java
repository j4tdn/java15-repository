package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex02 {
	public static void main(String[] args) {
		String input1 = "aaaababbbddc";
		String input2 = "aaaaccdcec";
		Map<String, Integer> input1Map = convertToMap(input1.split(""));
		Map<String, Integer> input2Map = convertToMap(input2.split(""));
		printResult(input1Map, findMaxRepeatWord(input1Map));
		printResult(input2Map, findMaxRepeatWord(input2Map));
	}
	public static Map<String, Integer> convertToMap(String[] source) {
		Map<String, Integer> result = new HashMap<>();
		for (String i : source) {
			if (result.containsKey(i)) {
				result.put(i, result.get(i) + 1);
			} else {
				result.put(i, 1);
			}
		}
		return result;
	}
	public static int findMaxRepeatWord(Map<String,Integer> source)
	{
		int max = 0;
		for (Entry<String, Integer> entry : source.entrySet()) {
			max = Math.max(max, entry.getValue());
		}
		return max;
	}
	public static void printResult (Map<String, Integer> source, int max)
	{
		String[] result = source.entrySet().stream()
												.filter(t -> t.getValue() == max)
												.map(t -> t.getKey())
												.toArray(String[]::new);
		System.out.println(String.join(" , ", result));
	}
}
