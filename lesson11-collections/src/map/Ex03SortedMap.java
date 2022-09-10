package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Ex03SortedMap {
	public static void main(String[] args) {
		Map<Integer, String> data = sort(findAll());
		
		print(data);
		
		
	}
	private static void print(Map<Integer, String> elements)
	{
		for(Entry<Integer, String> e : elements.entrySet())
		{
			System.out.println(e);
		}
	}
	
	private static Map<Integer, String> sort(Map<Integer, String> elements)
	{
		// transfer ap to list
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements.entrySet());
		
		//sort list by Entry<K,V>
		sortedList.sort(Comparator.comparing(Entry::getValue));
		
		//transfer sorted list to map
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		
		for(Entry<Integer, String> entry: sortedList)
		{
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		
		return sortedMap;
	}
	
	private static Map<Integer,String> findAllUnsortedMap()
	{
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		
		// không thể put key null
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(92, "Quang Nam");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(43, "Lien Chieu");
		return vnMotorBikeModel;
	}
	
	
	private static Map<Integer,String> findAll()
	{
		// HashMap: unordered, unsorted
		// TreeMap: sortedByKey -> key implements Comparable<>
		
		
		Comparator<Integer> keyComparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer k1, Integer k2) {
				return k2-k1;
			}
		};
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>(keyComparator);
		
		// không thể put key null
		vnMotorBikeModel.put(43, "Da Nang");
		vnMotorBikeModel.put(73, "Quang Binh");
		vnMotorBikeModel.put(74, "Quang Tri");
		vnMotorBikeModel.put(92, "Quang Nam");
		vnMotorBikeModel.put(75, "Thua Thien Hue");
		vnMotorBikeModel.put(43, "Lien Chieu");
		return vnMotorBikeModel;
	}
}
