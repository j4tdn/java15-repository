package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01ModelMap {
	public static void main(String[] args) {
		// Map<K, V> --> HashMap, TreeMap, LinkedHashMap
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(92, "Quảng Nam");
		vnMotorBikeModel.putIfAbsent(43, "Liên Chiểu");

		System.out.println("size: " + vnMotorBikeModel.size());

		// Loop by Key, Value, Entry<K, V>
		loopByKey(vnMotorBikeModel);
		loopByValue(vnMotorBikeModel);
		loopByEntry(vnMotorBikeModel);
	}

	private static void loopByEntry(Map<Integer, String> map) {
		System.out.println("==== Loop By Entry ====");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey() + ", " + entry.getValue() + "  -- ");
		}
		System.out.println();
	}

	private static void loopByValue(Map<Integer, String> map) {
		System.out.println("==== Loop By Value ====");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	private static void loopByKey(Map<Integer, String> map) {
		System.out.println("==== Loop By Key ====");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.print(key + " ");
		}
		System.out.println();
	}
}