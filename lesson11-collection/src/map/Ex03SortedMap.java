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
		Map<Integer, String> elements = findAll();
		
		print(elements);
		
	}
	
	private static void print(Map<Integer, String> elements) {
		for(Entry<Integer, String> element : elements.entrySet()){
			System.out.println(element);
		}
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> elements) {
		Set<Entry<Integer, String>> set = elements.entrySet();
		List<Entry<Integer, String>> sortedList = new ArrayList<>(set);
		
		sortedList.sort(Comparator.comparing(Entry::getValue));
		
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	private static Map<Integer, String> findAllUnsortedMap(){
		//HashMap : unorder, unsorted
		//TreeMap: sortedByKey -> key implements comparable<>
		//LinkedHashMap 
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(92, "Quảng Nam");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Quảng Bình");
		vnMotorBikeModel.putIfAbsent(43, "Liên Chiểu");
		return vnMotorBikeModel;
	}
	
	private static Map<Integer, String> findAll(){
		//HashMap : unorder, unsorted
		//TreeMap: sortedByKey -> key implements comparable<>
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>((k1,k2) -> k2 - k1);
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(92, "Quảng Nam");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Quảng Bình");
		vnMotorBikeModel.putIfAbsent(43, "Liên Chiểu");
		return vnMotorBikeModel;
	}
}
