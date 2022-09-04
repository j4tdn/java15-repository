package Ex05;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Predicate;

public class Spending {
	public static void main(String[] args) {
		Map<String, Double> money = getSpending();		
		//cac khoan chi lon hon 3000
		for(Entry<String, Double> entry : money.entrySet()) {
			if(entry.getValue() > 1500) {
				System.out.println(entry.getKey()+ "  " + entry.getValue());
			}
			
		}
		System.out.println(money.get(""));
		
		
	}
	private static Map<String, Double> getSpending(){
		Map<String, Double> map = new HashMap<>();
		map.put("Tiền xăng", 1200d);
		map.put("Tiền nhà", 2000d);
		map.put("Tiền ăn", 5000d);
		map.put("Tiền nhậu", 2500d);
		map.put("Tiền cho", 1000d);
		map.put("Tiền tiêu vặt", 1400d);
		return map;		
		
	}
	private static void asc(Map<String, Double> map, Comparator<Double> comparator){
		
		
	}
	
	
}
