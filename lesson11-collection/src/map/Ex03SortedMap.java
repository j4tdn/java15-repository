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

	private static void sort(Map<Integer, String> elements) {

		// transfer map to list
		// Set<Entry<Integer, String>> set = elements.entrySet();
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements.entrySet());

		// sort list by Entry<K,V>
		sortedList.sort(Comparator.comparing(Entry::getValue));
		// transfer list to map

		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for (Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}

	}

	private static void print(Map<Integer, String> elements) {
		for (Entry<Integer, String> element : elements.entrySet()) {
			System.out.println(element);
		}
	}

	private static Map<Integer, String> findAllunsortedMap() {

		Map<Integer, String> vnMotorBikeModel = new HashMap<Integer, String>();
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(92, "Quảng Nam");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		return vnMotorBikeModel;
	}

	private static Map<Integer, String> findAll() {
		// HashMap:unsorted, unordered
		// TreeMap :sortedByKey -> key implements Comparable
		Comparator<Integer> keyComparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer k1, Integer k2) {
				return k1 - k2;
			}
		};
		Map<Integer, String> vnMotorBikeModel = new TreeMap<Integer, String>(keyComparator);
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(92, "Quảng Nam");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		return vnMotorBikeModel;
	}
}
