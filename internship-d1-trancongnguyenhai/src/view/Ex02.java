package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class Ex02 {
	public static void findWinner(String judgesSelection) {
		String[] judgesSelectes = judgesSelection.split("\\s+");
		Integer[] judgesSelectesInt = new Integer[judgesSelectes.length];
		for(int i = 0; i < judgesSelectes.length; i++) {
				judgesSelectesInt[i] = Integer.valueOf(judgesSelectes[i]);
		}
		
		HashMap<Integer, Integer> numMap = new HashMap<>();
		for(int i = 0; i < judgesSelectesInt.length; i++) {
			if(!numMap.containsKey(judgesSelectesInt[i])) {
				numMap.put(judgesSelectesInt[i], 1);
			} else {
				int count = numMap.get(judgesSelectesInt[i]) + 1;
				numMap.put(judgesSelectesInt[i], count);
			}
		}
		
		ArrayList<Integer> countNum = new ArrayList<Integer>(numMap.values().stream().sorted((o1, o2) -> o2 - o1).toList());
		System.out.println(countNum.get(0));
		
		
	}
	
	public static void main(String[] args) {
		String input = "4 \n"
					 + "3 5 2 1 \n"
					 + "3 12 5 2 \n"
					 + "2 1 2 \n"
					 + "3 2 1 5 \n";
		System.out.println(input);
		findWinner(input);
	}
}
