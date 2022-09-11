package map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ex03SortedMap {

	public static void main(String[] args) {
		Map<Integer, String> elements = sort(findAllUnsortedMap());
		print(elements);
	}
	// Các hàm của Map không hỗ trợ sort ==> đưa các Entry trong Map vào ListEntry rồi sort theo key, value 
	private static   Map<Integer, String> sort(Map<Integer, String> elements) {
		//transfer map to list
		//Set<Entry<Integer, String>> set = elements.entrySet();
		List<Entry<Integer, String>> sortedList = new ArrayList<>(elements.entrySet());
		// sort list by Entry
		sortedList.sort(Comparator.comparing(Entry::getValue));
		//transfer sorted list to map 
		Map<Integer, String> sortedMap = new LinkedHashMap<>();
		for(Entry<Integer, String> entry : sortedList) {
			sortedMap.put(entry.getKey(), entry.getValue());
		}
		return sortedMap;
	}
	
	private static void print(Map<Integer, String> elements) {
		for(Entry<Integer, String> element : elements.entrySet()) {
			System.out.println(element);
		}
	}
	
	private static Map<Integer, String> findAllUnsortedMap(){
		
		
		Map<Integer, String> vnMotorBikeModel = new HashMap<>();
		vnMotorBikeModel.put(43, "Đà nẵng");
		vnMotorBikeModel.put(92,"Quảng Nam");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
	    vnMotorBikeModel.put(75, "Thừa Thiên" );
	    return vnMotorBikeModel;
	}
	
	
	private static Map<Integer, String> findAll(){
		// HashMap: unordored, unsorted (khong thu tu)
		// TreeMap: mặc định sort theo key, yêu cầu key implements Conparable
		// Mặc đinh TreeMap sắp xếp tăng dần, muốn giảm dần ta override
		Comparator<Integer> keyComparator = (k1 , k2) -> k1 - k2;
			
			
		Map<Integer, String> vnMotorBikeModel = new TreeMap<>(keyComparator);
		vnMotorBikeModel.put(43, "Đà nẵng");
		vnMotorBikeModel.put(92,"Quảng Nam");
		vnMotorBikeModel.put(73, "Quảng Bình");
		vnMotorBikeModel.put(74, "Quảng Trị");
	    vnMotorBikeModel.put(75, "Thừa Thiên" );
	    return vnMotorBikeModel;
	}
}
