package map;

import java.security.KeyStore.Entry;
import java.text.CollationKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex01ModelMap {

	public static void main(String[] args) {
		
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(92, "Quang Nam");
		
		System.out.println("size: " + vnMotorBikeModel.size());
		loopByKey(vnMotorBikeModel);
		loopByValue(vnMotorBikeModel);
		loopByEntry(vnMotorBikeModel);
	}
	
	private static void loopByEntry(Map<Integer, String> map) {
		System.out.println("========Loop By Entry========");
		Set<java.util.Map.Entry<Integer, String>> entrySet = map.entrySet();
		for ( java.util.Map.Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey()+ ", " + entry.getValue()+ " --- ");
		}
		System.out.println();
	}
	
	private static void loopByValue(Map<Integer, String> map ) {
		// loop by key, value , Entry<K, V>
		System.out.println("========Loop By value========");
				Collection<String> values =  map.values();
				for ( String value : values) {
					System.out.println( value +" ");
				}
				System.out.println();
	}
	
	private static void loopByKey(Map<Integer, String> map ) {
		// loop by key, value , Entry<K, V>
		System.out.println("========Loop By Key========");
				Set<Integer> keyset =  map.keySet();
				for ( Integer key : keyset) {
					System.out.println( key +" ");
				}
				System.out.println();
	}

}






