package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01ModelMap {
	public static void main(String[] args) {
		// Map --> HashMap, TreeMap, LinkedHashMap
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(92, "Quang Nam");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(43, "Lien Chieu");
		// put duplicate key => override key

		System.out.println("size: " + vnMotorBikeModel.size());

		// Loop by Key, Value, Entry<K,V>;
		loopByKey(vnMotorBikeModel);
		loopByValue(vnMotorBikeModel);
		loopByEntry(vnMotorBikeModel);
	}

	private static void loopByEntry(Map<Integer, String> map) {
		System.out.println("===== Loop by Entry ===");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey() + ", " + entry.getValue() + " -- ");
		}
		System.out.println();
	}

	private static void loopByValue(Map<Integer, String> map) {
		System.out.println("===== Loop by Value ===");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

	private static void loopByKey(Map<Integer, String> map) {
		System.out.println("===== Loop by key ===");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.print(key + " " + map.get(key));
		}
		System.out.println();
	}
}
