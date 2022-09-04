package view;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex05ManageCost {
	public static void main(String[] args) {
		Map<String, Double> manageCost = new HashMap<>();
		manageCost.put("ăn", 40000d);
		manageCost.put("uống", 20000d);
		manageCost.put("xăng", 30000d);
		manageCost.put("shopping", 600000d);

		overCost(manageCost);
	}

	private static void overCost(Map<String, Double> manageCost) {
		Set<Entry<String, Double>> entrySet = manageCost.entrySet();

		for (Entry<String, Double> entry : entrySet) {
			if (entry.getValue() > 500000)
				System.out.print(entry.getKey() + ", " + entry.getValue());
		}
	}
	
	private static void sortInPrice(Map<String, Double> manageCost) {
	}
}
