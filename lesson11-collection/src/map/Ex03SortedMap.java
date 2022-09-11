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
		Map<Integer, String> elements = findAllUnsortedMap();
		
		Map<Integer, String> elements2 = sort(elements);
		
		print(elements2);
		
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> element) {
		//Set<Entry<Integer, String>> set =  element.entrySet();
		List<Entry<Integer, String>> sortedList = new ArrayList<>( element.entrySet());
		sortedList.sort(Comparator.comparing(Entry::getValue));
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		
		for(Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	private static void print(Map<Integer, String> elements) {
		for(Entry<Integer, String> element : elements.entrySet()) {
			System.out.println(element);
		}
	}
	private static Map<Integer, String> findAllUnsortedMap() {
		
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();

		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(92, "Quang Nam");
	
		return vnMotorBikeModel;
	}
	private static Map<Integer, String> findAll() {
		//hashmap: un-order, un-sorted
		//treemap:sorted by key
		Comparator<Integer> keyComparator =((k1, k2) -> k1-k2);
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>(keyComparator);

		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(92, "Quang Nam");
	
		return vnMotorBikeModel;
	}
}
