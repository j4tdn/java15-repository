package view;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import bean.ExpenditureDetail;

public class Ex05ExpenditureApp {
	public static void main(String[] args) {
		Map<ExpenditureDetail, Double> spending = function();
        enumarate(spending);
       // arrangement(spending);
        arrangementv2(spending);
	}

	private static Map<ExpenditureDetail, Double> function() {
		Map<ExpenditureDetail, Double> consumption = new HashMap<>();
		consumption.put(new ExpenditureDetail("Utility bill"), 2200000.0d);
		consumption.put(new ExpenditureDetail("Taxes bill"), 1200000.0d);
		consumption.put(new ExpenditureDetail("Life Insurance"), 350000.0);
		consumption.put(new ExpenditureDetail("Internet "), 300000.500d);
		return consumption;
	}

	private static void enumarate(Map<ExpenditureDetail, Double> result) {
		Set<java.util.Map.Entry<ExpenditureDetail, Double>> entrySet = result.entrySet();
		for (java.util.Map.Entry<ExpenditureDetail, Double> entry : entrySet) {
			if (entry.getValue() > 500000.0d) {
				System.out.println(entry.getKey() + " ," + entry.getValue() + " ");
			}
		}
	}
	private static void arrangement(Map<ExpenditureDetail, Double> result) {
		List<Map.Entry<ExpenditureDetail, Double>> list = new ArrayList<>(result.entrySet());
		Collections.sort(list , new Comparator<Map.Entry<ExpenditureDetail, Double>>() {

			@Override
			public int compare(java.util.Map.Entry<ExpenditureDetail, Double> o1,
					java.util.Map.Entry<ExpenditureDetail, Double> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue()) ;
			}
			
		});
		for (java.util.Map.Entry<ExpenditureDetail, Double> entry : list) {
			System.out.println("Key :" + entry.getKey() + "Value :" + entry.getValue());
		}
	}
	private static void arrangementv2(Map<ExpenditureDetail, Double> result) {
		List<Map.Entry<ExpenditureDetail, Double>> list = new ArrayList<>(result.entrySet());
		Collections.sort(list , new Comparator<Map.Entry<ExpenditureDetail, Double>>() {

			@Override
			public int compare(java.util.Map.Entry<ExpenditureDetail, Double> o1,
					java.util.Map.Entry<ExpenditureDetail, Double> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey()) ;
			}
			
		});
		for (java.util.Map.Entry<ExpenditureDetail, Double> entry : list) {
			System.out.println("Key :" + entry.getKey() + "Value :" + entry.getValue());
		}
	}
}
