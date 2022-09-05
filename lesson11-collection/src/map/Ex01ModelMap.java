package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.sun.source.tree.ContinueTree;

public class Ex01ModelMap {
	public static void main(String[] args) {
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(75, "Hue");
		vnMotorBikeModel.put(92, "Quang Nam");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(73, "Quang Binh");

		lookByKey(vnMotorBikeModel);
		lookByValue(vnMotorBikeModel);
	}

	private static void lookByValue(Map<Integer, String> map) {
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		Collection<String> values = map.values();
		System.out.println("size: " + vnMotorBikeModel.size());

		for (String value : values) {
			System.out.println(value + " ");
		}
		System.out.println();
	}

	private static void lookByKey(Map<Integer, String> map) {
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		Set<Integer> keySet = vnMotorBikeModel.keySet();
		System.out.println("size: " + vnMotorBikeModel.size());

		for (Integer key : keySet) {
			System.out.println(key + " ");
		}
		System.out.println();
	}
	private static void lookByEntry(Map<Integer, String> map) {
		Set<Entry<Integer, String>> entry = map.entrySet();
		for(Entry )
	}
}
