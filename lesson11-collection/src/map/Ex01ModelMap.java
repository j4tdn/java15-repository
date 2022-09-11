package map;

import java.util.Collection;
import java.util.HashMap;
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
		
		
		System.out.println("size " + vnMotorBikeModel.size());
		System.out.println("==============LOOP BY KEY===================");
		loopByKey(vnMotorBikeModel);
		System.out.println("=============LOOP BY VALUE==============");
		loopByValue(vnMotorBikeModel);
		
	}
	private static void loopByValue(Map<Integer, String> map) {
		Collection<String> values =  map.values();
		for(String value : values) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
	private static void loopByKey(Map<Integer, String> map) {
		Set<Integer> keySet =  map.keySet();
		for(Integer key : keySet) {
			System.out.print(key + " ");
		}
		System.out.println();
	}
	private static void loopByEntry(Map<Integer, String> map) {
		Set<java.util.Map.Entry<Integer, String>> entrys = map.entrySet();
	}
}
