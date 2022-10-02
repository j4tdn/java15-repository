package view;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex01 {
	public static void main(String[] args) {
		List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 3, 1);
		List<Integer> input2 = Arrays.asList(5, 7, 9, 10, 20, 9, 7, 7, 11);
		
		printProb1(convertToMap(input1));
		System.out.println("\n==================");
		printProb2(convertToMap(input2));
	}

	public static Map<Integer, Integer> convertToMap(List<Integer> source) {
		Map<Integer, Integer> result = new HashMap<>();
		for (Integer i : source) {
			if (result.containsKey(i)) {
				result.put(i, result.get(i) + 1);
			} else {
				result.put(i, 1);
			}
		}
		return result;
	}

	public static void printProb1(Map<Integer, Integer> source) {
		source.entrySet().stream().forEach(t -> {
			if (t.getValue() == 1)
				System.out.print(t.getKey() + " ");
		});
	}
	public static void printProb2(Map<Integer, Integer> source) {
		source.entrySet().stream().forEach(t -> {
			if (t.getValue() > 1)
				System.out.print(t.getKey() + " ");
		});
	}
}
