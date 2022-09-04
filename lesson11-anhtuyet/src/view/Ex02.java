package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import been.CD;
public class Ex02 {
	public static void main(String[] args) {
		List<CD> CDs = getDataCD();
		CD addedCd = new CD(119,"F","NVA",15,1500d);
		System.out.println("================");
		
		addIf(addedCd, CDs, element -> element.getId() == addedCd.getId());
		System.out.println("List after add: " + CDs);
		
		System.out.println("===============");
		System.out.println("Number of CD in List:  " + CDs.size());
		
		System.out.println("=============");
		
		System.out.println("Total price CD in List: " + sumOfPrice(CDs));
		
		System.out.println("============");
		
		CDs.sort(Comparator.comparing(CD -> CD.getPrice(), Comparator.reverseOrder()));
		System.out.println("\nList after sort desc price: " + CDs);
		
		System.out.println("============================");
		 CDs.sort(Comparator.comparing(CD -> CD.getId()));
		 System.out.println("\nList after sort desc id: " + CDs);
	}
	private static List<CD> getDataCD() {
		List<CD> result = new ArrayList<>();
		result.add(new CD(111,"A", "QBA",15,1500D));
		result.add(new CD(112,"B", "QBB",16,1100D));
		result.add(new CD(113,"C", "QBC",17,1200D));
		result.add(new CD(114,"D", "QBD",18,1300D));
		result.add(new CD(115,"E", "QBE",19,1400D));
		result.add(new CD(116,"F", "QBF",20,1800D));
		result.add(new CD(117,"G", "QBG",21,1700D));
		result.add(new CD(118,"H", "QBH",22,1600D));
		return result;
	}
	private static boolean addIf(CD e, List<CD> source, Predicate<CD> condition) {
		for(CD element: source) {
			if(condition.test(element))
				return false;
		}
		source.add(e);
		return true;
	}
	private static double sumOfPrice(List<CD> source) {
		double result = 0;
		for(CD e: source) {
			result += e.getPrice();
		}
		return result;
	}
}
