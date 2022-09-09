package view;

import static utils.Utils.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import static java.util.Comparator.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bean.AmountOfMoney;
import bean.SpendingInformation;

public class Ex05SpendingManagement {
	public static void main(String[] args) {
		Map<SpendingInformation, AmountOfMoney> information = getInformation();
		Map<SpendingInformation, AmountOfMoney> listed = listed(information);
		System.out.println(listed);
      List< AmountOfMoney> resultsDecrease = sortDecrease(information);
      for(AmountOfMoney result : resultsDecrease) {
    	  System.out.println(result);
      }
      List<SpendingInformation> resultsAscending = sortAscending(information);
      for(SpendingInformation result :resultsAscending) {
    	  System.out.println(result);
      }
	}

	public static Map<SpendingInformation, AmountOfMoney> listed(Map<SpendingInformation, AmountOfMoney> map) {
		Map<SpendingInformation, AmountOfMoney> listed = new HashMap<>();
		Set<Entry<SpendingInformation, AmountOfMoney>> entrySet = map.entrySet();
		for (Entry<SpendingInformation, AmountOfMoney> entry : entrySet) {
			if (entry.getValue().getMoney() > 500000) {
				listed.putIfAbsent(entry.getKey(), entry.getValue());
			}
		}
		return listed;

	}

	public static List<AmountOfMoney> sortDecrease(Map<SpendingInformation, AmountOfMoney> map) {

		
		Collection<AmountOfMoney> amountOfMoneys = map.values();
	
		List<AmountOfMoney> list = new ArrayList<>();
		for (AmountOfMoney amountOfMoney : amountOfMoneys) {
			list.add(amountOfMoney);
		}
		Comparator<AmountOfMoney> comparator = comparing(amountOfMoney -> amountOfMoney.getMoney());
		list.sort(comparator.reversed());
		
	return list;	
   	}
public static List<SpendingInformation> sortAscending(Map<SpendingInformation, AmountOfMoney> map) {

		
		Set<SpendingInformation> amountOfMoneys = map.keySet();
	
		List<SpendingInformation> list = new ArrayList<>();
		for (SpendingInformation amountOfMoney : amountOfMoneys) {
			list.add(amountOfMoney);
		}
		Comparator<SpendingInformation> comparator = comparing(amountOfMoney -> amountOfMoney.getExpenditures());
		list.sort(comparator);
		
	return list;	
   	}
	

}
