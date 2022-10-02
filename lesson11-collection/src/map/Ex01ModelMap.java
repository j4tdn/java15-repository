package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex01ModelMap {
	public static void main(String[] args) {
		Map<Integer, String> vnMotoBikeModel = new HashMap<>();
		vnMotoBikeModel.put(43, "Đà Nẵng");
		vnMotoBikeModel.put(92, "Quảng Nam");
		vnMotoBikeModel.put(73, "Quảng Bình");
		vnMotoBikeModel.put(76, "Quảng Ngãi");
		vnMotoBikeModel.put(77, "Quy Nhơn");
		vnMotoBikeModel.putIfAbsent(77, "Liên Chiểu");
		
		
		System.out.println("size: " + vnMotoBikeModel.size());
		//Loop by Key, Value, Entry<K, V>
		
		loopByEnntry(vnMotoBikeModel);
		loopByValue(vnMotoBikeModel);
		
		}
	
	private static void loopByEnntry(Map<Integer, String> map) {
		System.out.println("===Loop By Entry");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		for(Entry<Integer, String> entry: entrySet) {
			System.out.println(entry + " ");
		}
		System.out.println();
	}
	private static void loopByValue(Map<Integer, String> map) {
		System.out.println("===Loop By Value");
		Collection<String> values = map.values();
		for(String value: values) {
			System.out.println(value + " ");
		}
		System.out.println();
	}
}
	
