package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01ModelMap {

	public static void main(String[] args) {
		Map<Integer, String> vnMotorbikeModel = new HashMap<>();
				vnMotorbikeModel.put(43, "Da Nang");
				vnMotorbikeModel.put(92, "Quang Nam");
				vnMotorbikeModel.put(75, "Hue");
				vnMotorbikeModel.put(74, "Quang Tri");
				vnMotorbikeModel.put(73, "Quang Binh");
				loopByKey(vnMotorbikeModel);
				
	}
	private static void loopByKey(Map<Integer, String> map) {
		System.out.println("+========== Loop By Key");
		Set<Integer> keySet = map.keySet();
		for(Integer key: keySet) {
			System.out.println(key + " ");
		}
		System.out.println();
	}

//	private static void loopByValue(Map<Integer, String> map) {
////		System.out.println("+========== Loop By Value");
////		Collection<Integer>  = map.keySet();
////		for(Integer key: keySet) {
////			System.out.println(key + " ");
////		}
////		System.out.println();
////	
//}
