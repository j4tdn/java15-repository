package map;

import java.security.Key;
import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01_ModelMap {
	public static void main(String[] args) {
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(92, "Quang Nam");

		System.out.println("size: " + vnMotorBikeModel.size());
		//Look by key, value, Entry<K, V>\
		loopByKey(vnMotorBikeModel);
		loopByValue(vnMotorBikeModel);
		
	}
//	private static void loopByEntry (Map<Integer, String> map) {
//		System.out.println("=== Loop by Entry ===");
//		Set<Entry<Integer, String>> entrySet = map.entrySet();
//		for(Entry<Integer, String> entry : entrySet) {
//			System.out.println(entry.);
//		}
//	}
	private static void loopByValue(Map<Integer, String> map) {
		System.out.println("=== Loop by value ===");
		//Collection<String> values = map.values();
		for( String key: map.values()) {
			System.out.print(key + " ");
		}
	}
	
	private static void loopByKey(Map<Integer, String> map) {
		
		System.out.println("=== Loop by key ===");
		//Set<Integer> keySey = map.keySet();
		for( Integer key: map.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();

	}
}

