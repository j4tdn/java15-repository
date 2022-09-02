package map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01ModelMap {
	public static void main(String[] args) {
		// Map --> HashMap, TreeMap, LinkedHashMap
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(92, "Quảng Nam");
		vnMotorBikeModel.put(75, "Thừa Thiên Huế");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(73, "Quảng Bình");

		System.out.println("size: " + vnMotorBikeModel.size());
		// Loop by Key, Value, Entry<K,V>
		loopByKey(vnMotorBikeModel);
		loopByValue(vnMotorBikeModel);
	}

	private static void loopByEntry(Map<Integer, String> map) {
		System.out.println("=======Loop By Entry=========");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		
		

	}
	
	private static void loopByValue(Map<Integer, String> map) {
		System.out.println("=======Loop By Values=========");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value + " ");
		}
	}
	
	private static void loopByKey(Map<Integer, String> map) {
		System.out.println("=======Loop By Key=========");
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			System.out.print(key + " ");
		}
	}

}
