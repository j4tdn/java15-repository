package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex03SortedMap {
	public static void main(String[] args) {
//		Map<Integer, String> elements = findAll();
		Map<Integer, String> elements = sort(findAllUnSortedMap());
		printf(elements);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> elements) {
		// transfer map to list
		Set<Entry<Integer, String>> set = elements.entrySet();
		List<Entry<Integer, String>> sortedList = new ArrayList<>(set);
		
		// sort list by Entry<K, V>
		sortedList.sort(Comparator.comparing(Entry::getValue));
		
		// transfer sorted list to map
		Map<Integer, String> sortedMap = new LinkedHashMap<Integer, String>();
		for(Entry<Integer, String> entry: sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	private static void printf(Map<Integer, String> elements) {
		for(Entry<Integer, String> element: elements.entrySet()) {
			System.out.println(element);
		}
	}
	
	private static Map<Integer, String> findAll(){	
		// HashMap: unordered, unsorted
		// TreeMap: sortedByKey --> key implements Comparable<K>
		// LinkedHashMap : ordered
		Comparator<Integer> keyComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer k1, Integer k2) {
				return k2 - k1;
			}
		};
		Map<Integer, String> vnMotorBikeModel = new TreeMap<Integer, String>(keyComparator);
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(92, "Quảng Nam");
		
		return vnMotorBikeModel;
	}
	
	private static Map<Integer, String> findAllUnSortedMap(){
		Map<Integer, String> vnMotorBikeModel = new TreeMap<Integer, String>();
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(92, "Quảng Nam");
		
		return vnMotorBikeModel;
	}
}
