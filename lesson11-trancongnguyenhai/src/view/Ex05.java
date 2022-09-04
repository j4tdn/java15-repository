package view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ex05 {
	public static void main(String[] args) {
		Map<String, Integer> spendOneDay = new HashMap<>();
		spendOneDay.put("Breakfast", 30000);
		spendOneDay.put("Lunch", 25000);
		spendOneDay.put("Dinner", 26000);
		spendOneDay.put("Drink", 20000);
		spendOneDay.put("Go out with girl friend", 600000);
		getListSpendOverFiveHundred(spendOneDay);
		List<String> elements = sortByKey(spendOneDay);
		System.out.println("================SORT BY KEY==============");
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("===============SORT BY VALUE============");
		elements = sortByValue
				(spendOneDay);
		for (String element : elements) {
			System.out.println(element);
		}
	}

	private static void getListSpendOverFiveHundred(Map<String, Integer> map) {
		System.out.println("=======Spending Range Over 500k========");
		Collection<Integer> values = map.values();
		for (Integer value : values) {
			if (value > 500000) {
				System.out.println(getKey(map, value) + "-----" + value);
			}
		}
	}

	private static String getKey(Map<String, Integer> map, Integer value) {
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}

	private static List<String> sortByKey(Map<String, Integer> map) {
		List<String> sorted = new ArrayList<>(map.keySet());
		sorted.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		return sorted;
	}

	private static List<String> sortByValue(Map<String, Integer> map) {
		List<Integer> sorted = new ArrayList<>(map.values());
		sorted.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		List<String> listByKey = new ArrayList<>();
		for(Integer element : sorted) {
			listByKey.add(getKey(map, element));			
		}
		return listByKey;
	}
}
