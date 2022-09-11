package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex03SortedMap {
	public static void main(String[] args) {
		Map<Integer, String> elements = sort(findAllUnsortedMap());
		
		print(elements);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> elements) {
		// transfer map to unsorted list
		List<Entry<Integer, String>> sortedList = new LinkedList<>(elements.entrySet());
		
		// sort list by Entry<K, V>
		sortedList.sort(Comparator.comparing(Entry::getValue));
		
		// transfer sorted list to map
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	private static void print(Map<Integer, String> elements) {
		for (Entry<Integer, String> element: elements.entrySet()) {
			System.out.println(element);
		}
	}
	
	private static Map<Integer, String> findAllUnsortedMap() {
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(92, "Quảng Nam");
		return vnMotorBikeModel;
	}

	private static Map<Integer, String> findAll() {
		// HashMap: unordered, unsorted
		// TreeMap: sortedByKey -> key implements Comparable<K>
		// LinkedHashMap: ordered
		
		// Map<Entry<K, V> --> Comparator<Entry<K, V>>
		Comparator<Integer> keyComparator = (k1, k2) -> k2 - k1;
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>(keyComparator);
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(92, "Quảng Nam");
		return vnMotorBikeModel;
	}

}