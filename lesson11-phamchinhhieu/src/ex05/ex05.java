package ex05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ex05 {
	public static void main(String[] args) {
		Map<String, Integer> spendInfo = new HashMap<>();
		spendInfo.put("Di cho", 200000);
		spendInfo.put("Mua sam", 700000);
		spendInfo.put("An sang", 100000);
		spendInfo.put("Di choi", 1000000);
		Map<String, Integer> elements =spendInfo(spendInfo);
		Map<String, Integer> elements1 =sort(spendInfo);
		print(elements1);
	}
	private static Map<String, Integer> spendInfo(Map<String, Integer> spendin4){
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Entry<String, Integer> element : spendin4.entrySet()) {
			if(element.getValue() > 500000) {
				sortedMap.put(element.getKey(), element.getValue());
			}
		}
		return sortedMap;
	}
	private static void print(Map<String, Integer> elements) {
		for(Entry<String, Integer> element : elements.entrySet()) {
			System.out.println(element);
		}
	}
	private static Map<String, Integer> sort(Map<String, Integer> elements) {
		List<Entry<String, Integer>> sortedList = new ArrayList<>(elements.entrySet());
		
		//sort list by Entry<K, V>
		sortedList.sort(Comparator.comparing(Entry::getValue, Comparator.reverseOrder()));
		
		//tranfer sorted list to map
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		for(Entry<String, Integer> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	private static Map<String, Integer> sort1(Map<String, Integer> elements) {
		List<Entry<String, Integer>> sortedList = new ArrayList<>(elements.entrySet());
		
		//sort list by Entry<K, V>
		sortedList.sort(Comparator.comparing(Entry::getKey));
		
		//tranfer sorted list to map
		Map<String, Integer> element = new LinkedHashMap<>();
		for(Entry<String, Integer> entry : sortedList) {
			element.put(entry.getKey(), entry.getValue());
		}
		return element;
	}
}
