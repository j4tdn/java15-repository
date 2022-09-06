package map;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01ModelMap {
	public static void main(String[] args) {
	Map<Integer, String> vnMotorBikeModel = new HashMap<>();
	vnMotorBikeModel.put(43, "Đà nẵng");
	vnMotorBikeModel.put(92,"Quảng Nam");
	vnMotorBikeModel.put(73, "Quảng Bình");
	vnMotorBikeModel.put(74, "Quảng Trị");
    vnMotorBikeModel.put(75, "Thừa Thiên" );
    vnMotorBikeModel.putIfAbsent(43, "Lien chieu");
    System.out.println("Size: " + vnMotorBikeModel.size());
   
    loopByKey(vnMotorBikeModel);
    loopByValue(vnMotorBikeModel);
    loopByEntry(vnMotorBikeModel);
}
	private static void loopByEntry(Map<Integer, String> map) {
		  System.out.println("=== Loop By Entry ====");
		  
		  Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey() + " ," + entry.getValue());
		}
		System.out.println();
	}
	private static void loopByValue(Map<Integer, String> map) {
		Collection<String> values = map.values();
		   System.out.println("=== Loop By Values ====");
		    for(String value : values) {
		    	System.out.println(value + " ");
		    }
		    System.out.println();

	}
	private static void loopByKey(Map<Integer, String> map) {
		 Set<Integer> keySet = map.keySet();
		   System.out.println("=== Loop By Key ====");
		    for(Integer key : keySet) {
		    	System.out.println(key);
		    }
		    System.out.println();

	}
}
