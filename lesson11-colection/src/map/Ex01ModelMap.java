package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01ModelMap {
	public static void main(String[] args) {
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Đà Nẵng");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
		vnMotorBikeModel.put(75, "Huế");
		vnMotorBikeModel.put(92, "Quảng Nam");
		
		loopByKey(vnMotorBikeModel);
		loopByValue(vnMotorBikeModel);
		loopByEntry(vnMotorBikeModel);
		
		
	}
	private static void loopByEntry(Map<Integer, String> map) {
		System.out.println("size: " +map.size());
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println(entry.getKey() + " , " + entry.getValue() + " -- ");
		}
	}
		
	
	private static void loopByValue(Map<Integer, String> map) {
		System.out.println("size: " +map.size());
		// Loop by Key, Value, Entry<K, V>
		System.out.println(" === Loop by Value ====");
		Collection<String> keySet =  map.values();
		for (String key: keySet) {
			System.out.println(key + " ");
		}
	}
	
	private static void loopByKey(Map<Integer, String> map) {
		System.out.println("size: " +map.size());
		// Loop by Key, Value, Entry<K, V>
		System.out.println(" === Loop by key ====");
		Set<Integer> keySet =  map.keySet();
		for (Integer key: keySet) {
			System.out.println(key + " ");
		}
	}
}
