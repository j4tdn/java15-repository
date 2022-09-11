package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ex03_SortedMap {
	public static void main(String[] args) {
		Map<Integer, String> elements =sort(findAllunsortedMap());
		
		print(elements);

	}
	
	private static void print(Map<Integer, String> elements) {
		for(Entry<Integer, String> element : elements.entrySet()) {
			System.out.println(element);
		}
	}
	private static Map<Integer, String> sort(Map<Integer, String> elements) {
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements.entrySet());
		
		//sort list by Entry<K, V>
		sortedList.sort(Comparator.comparing(Entry::getValue));
		
		//tranfer sorted list to map
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	private static Map<Integer, String> findAllunsortedMap(){
		//HashMap: unordered,unsorted
		//TreeMap: sortedByKey -> key implements Comparable<K>
		Comparator<Integer> keyComparator =(k1, k2) -> k2 - k1;
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>(keyComparator);
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(92, "Quang Nam");
		vnMotorBikeModel.put(92, "Quang Nam");
		return vnMotorBikeModel;
		
	}
	private static Map<Integer, String> findAll(){
		//HashMap: unordered,unsorted
		//TreeMap: sortedByKey -> kew implemrnts Comparable<K>
		Comparator<Integer> keyComparator =(k1, k2) -> k2 - k1;
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>(keyComparator);
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(92, "Quang Nam");
		return vnMotorBikeModel;
		
	}
}
