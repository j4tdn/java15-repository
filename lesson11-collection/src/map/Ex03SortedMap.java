package map;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex03SortedMap {
	public static void main(String[] args) {
		Map<Integer, String> elements = findAll();
		
		print(elements);
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> elements) {
		// transfer map to list
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements.entrySet());
		
		//sort list by Entry<K,V>
		sortedList.sort(Comparator.comparing(Entry::getValue));
		
		//transfer sorted list to map
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry: sortedList) {
			elements.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	private static void print(Map<Integer, String> elements) {
		for(Entry<Integer, String> element: elements.entrySet()) {
			System.out.println(element);
		}
	}
	
	private static Map<Integer, String> findAll(){
		//HashMap: unordered, unsorted
		//TreeMap: sortedByKey -> key implements Comparable<K>
		Comparator<Integer> keyComparator = (k1, k2) -> k2 - k1;
			
		Map<Integer, String> vnMotoBikeModel = new HashMap<>();
		vnMotoBikeModel.put(43, "Đà Nẵng");
		vnMotoBikeModel.put(92, "Quảng Nam");
		vnMotoBikeModel.put(73, "Quảng Bình");
		vnMotoBikeModel.put(76, "Quảng Ngãi");
		vnMotoBikeModel.put(77, "Quy Nhơn");
		vnMotoBikeModel.putIfAbsent(77, "Liên Chiểu");
		return vnMotoBikeModel;
	}
}
