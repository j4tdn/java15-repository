package view;

import java.util.Comparator;
import java.util.List;

import bean.NodeSpending;
import dsa.CustomHashTable;
import dsa.IHashTable;

public class Ex05 {
	public static void main(String[] args) {
		IHashTable spends = new CustomHashTable();
		spends.put("Mi tom", 30000d);
		spends.put("Ao quan", 520000d);
		spends.put("Tien dien", 530000d);
		spends.put("Tien nuoc", 610000d);
		List<NodeSpending> listSortByKey = spends.sortByKey(Comparator.comparing(node -> node.getKeyInfoSpending(),Comparator.reverseOrder()));
		List<NodeSpending> listSortByValue = spends.sortByKey(Comparator.comparing(node -> node.getValueMoney()));
		System.out.println("Sort DESC by Key: " + listSortByKey);
		System.out.println("Sort ASC by Value: " + listSortByValue);
		
	}
	
}
