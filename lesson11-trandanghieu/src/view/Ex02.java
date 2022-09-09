package view;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.CDDisk;
import model.DataModel;

public class Ex02 {
	public static void main(String[] args) {
		List<CDDisk> list = DataModel.getListCD();
		CDDisk cd7 = new CDDisk(7, "Music CD", "BTS ", 7, 1.2f);
		System.out.println("=====ADD DIFFERENT ID====");
		addIfDifferentID(cd7, list, element -> element.getId() == cd7.getId());
		System.out.println(list);
		System.out.println("====== HOW MANY CDs IN LIST?=======");
		System.out.println(list.size() + " CDs in list");
		System.out.println("======SUM OF PRICE=====");
		System.out.println("sum of price: " + sumOfPrice(list));
		System.out.println("======SORT DESCENDING BY PRICE");
		list.sort(Comparator.comparing(CDDisk -> CDDisk.getPrice(), Comparator.reverseOrder()));
		System.out.println("descending by price: "+ list);
		
		System.out.println("======SORT ACENDING BY PRICE");
		list.sort(Comparator.comparing(CDDisk -> CDDisk.getId()));
		System.out.println("acending by id: "+ list);
		

	}

	private static boolean addIfDifferentID(CDDisk o, List<CDDisk> list, Predicate<CDDisk> condition) {
		for (CDDisk element : list) {
			if (condition.test(element))
				return false;
		}
		list.add(o);
		return true;
	}

	private static float sumOfPrice(List<CDDisk> list) {
		float sum = 0;
		for (CDDisk element : list) {

			sum = sum + element.getPrice();
		}
		return sum;
	}

}
