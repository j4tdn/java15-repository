package map;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.TreeMap;



public class Ex03SortedMap {
	public static void main(String[] args) {
		Map<Integer, String>  elements = findAll();
		

	}
	private static void printf(Map<Integer, String> elements){
		
		for(Entry<Integer, String> elememt : elements.entrySet()) {
			System.out.println(elememt);
		}
	}

	private static Map<Integer, String> findAll() {
		Comparator<Integer>  keyComparator = (k1,k2)->k2-k1;
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>(keyComparator);
		vnMotorBikeModel.put(43, "Đà nẵng");
		vnMotorBikeModel.put(92, "Quảng nam");
		vnMotorBikeModel.put(73, "Quảng bình");
		vnMotorBikeModel.put(74, "Quảng trị");
		vnMotorBikeModel.put(75, "Thừa thiên huế");
		vnMotorBikeModel.putIfAbsent(43, "Lien chieu");
		 return vnMotorBikeModel;
	}
	private static Map<Integer, String> sort(Map<Integer, String> elements) {
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements.entrySet());
		sortedList.sort(Comparator.comparing(Entry::getValue));
		 Map<Integer, String> sortedMap = new LinkedHashMap<>();
		 for(Entry<Integer, String>  entry : sortedList) {
			 sortedMap.put(entry.getKey(), entry.getValue());
			 
		 }
		 return sortedMap;
				 
	}
	private static Map<Integer, String> findAllUnsortedMap() {
		
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Đà nẵng");
		vnMotorBikeModel.put(92, "Quảng nam");
		vnMotorBikeModel.put(73, "Quảng bình");
		vnMotorBikeModel.put(74, "Quảng trị");
		vnMotorBikeModel.put(75, "Thừa thiên huế");
		vnMotorBikeModel.putIfAbsent(43, "Lien chieu");
		 return vnMotorBikeModel;
	}
}