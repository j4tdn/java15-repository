package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01ModelMap {
	public static void main(String[] args) {
		// Map --> HashMap , TreeMap and LinkedHashMap
         Map<Integer, String> vnMotorBikeModel = new HashMap<>();
         vnMotorBikeModel.put(92, "Quang Nam");
         vnMotorBikeModel.put(75, "Hue");
         vnMotorBikeModel.put(74, "Quang Tri");
         vnMotorBikeModel.put(73, "Quang Binh");
         vnMotorBikeModel.put(43, "Da Nang");
         System.out.println("size : " + vnMotorBikeModel.size());
         // Loop by Key  , Value , Entry<V,K>
        loopByKey(vnMotorBikeModel);
        loopByValue(vnMotorBikeModel);
        loopByEntry(vnMotorBikeModel);
	}
	private static void loopByEntry(Map<Integer, String> map) {
		System.out.println("========================================");
		 Set<java.util.Map.Entry<Integer, String>> entrySet   = map.entrySet();
		 for (java.util.Map.Entry<Integer, String> entry : entrySet) {
			System.out.print(entry.getKey() + " ," + entry.getValue() + "--");
		}
		 System.out.println();
	}
	private static void loopByValue(Map<Integer, String> map) {
		System.out.println("========================================");
		   Collection<String> values = map.values();
	         for (String value : values) {
				System.out.print(value + " ");
			}
	         System.out.println("");
	}
	
	
	
	private static void loopByKey(Map<Integer, String> map) {
		System.out.println("========================================");
		   Set<Integer> keySet = map.keySet();
	         for (Integer key : keySet) {
				System.out.print(key + " ");
			}
	         System.out.println("");
	}
}
