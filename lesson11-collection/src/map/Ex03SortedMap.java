package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
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
	
	private static Map<Integer, String> sort(Map<Integer , String> elements) {
		Set<Entry<Integer, String>> set = elements.entrySet();
	    List<Entry<Integer, String>> unsortedList = new ArrayList(set);
	    // sort list by Entry<K,V>
	    unsortedList.sort(Comparator.comparing(Entry :: getValue));
	    // transfer sorted list to map
	    Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
	    for (Entry<Integer, String> entry : unsortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
	    return sortedMap;
	}

	private static void print(Map<Integer, String> elements) {
		for (Entry<Integer, String> element : elements.entrySet()) {
			System.out.println(element);
		}
	}

	private static Map<Integer, String> findAllUnsortedMap() {
        
		Map<Integer, String> vnMotorBikeModel = new TreeMap<Integer, String>(); 
		vnMotorBikeModel.put(92, "Quang Nam");
		vnMotorBikeModel.put(75, "Hue");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(43, "Da Nang");
		

		return vnMotorBikeModel;
	}

	private static Map<Integer, String> findAll() {
		// HashMap : unodered , unsorted
		// TreeMap : sortedByKey -> key implements Comparable<>
		// Map<Entry<K,V>> --> key implements Comparable<K>
		// LinkedHashMap
		Comparator<Integer> keComparator = (k1, k2) -> k2 - k1;
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>(keComparator);
		vnMotorBikeModel.put(92, "Quang Nam");
		vnMotorBikeModel.put(75, "Hue");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(43, "Da Nang");
		// vnMotorBikeModel.put(null, "Undefined");
		return vnMotorBikeModel;
	}
}
