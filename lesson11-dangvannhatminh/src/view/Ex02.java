package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import bean.CD;

public class Ex02 {

	public static void main(String[] args) {

		List<CD> CDs = getDataCD();
		CD addedCD = new CD(111, "Name A", "NVFFF", 15, 1500d);	
		System.out.println("==============================================");
		
		addIf(addedCD, CDs, element -> element.getCdCode() == addedCD.getCdCode());
		System.out.println("List after add : " + CDs);
		
		System.out.println("==============================================");
		
		System.out.println("Number of CD in List: " + CDs.size());
		
		System.out.println("==============================================");
		
		System.out.println("Total price CD in List: " + sumOfPrice(CDs));
		
		System.out.println("==============================================");
		
		CDs.sort(Comparator.comparing(CD -> CD.getPrice(), Comparator.reverseOrder()));
		System.out.println("List after sort desc price : " + CDs);
		
		System.out.println("==============================================");

		CDs.sort(Comparator.comparing(CD -> CD.getCdCode()));
		System.out.println("List after sort asc cd code: " + CDs);

	}

	private static List<CD> getDataCD() {
		List<CD> result = new ArrayList<>();
		result.add(new CD(101, "Name A", "NVA", 15, 1500d));
		result.add(new CD(102, "Name F", "NVK", 52, 12500d));
		result.add(new CD(103, "Name T", "NVQ", 32, 15500d));
		result.add(new CD(104, "Name B", "NVV", 64, 15200d));
		result.add(new CD(105, "Name C", "NVW", 74, 15050d));
		result.add(new CD(106, "Name E", "NVN", 23, 15010d));
		result.add(new CD(107, "Name D", "NVQ", 51, 1200d));
		result.add(new CD(108, "Name L", "NVE", 28, 16600d));
		return result;
	}

	private static boolean addIf(CD e, List<CD> source, Predicate<CD> condition) {
		for (CD element : source) {
			if (condition.test(element))
				return false;
		}
		source.add(e);
		return true;
	}

	private static double sumOfPrice(List<CD> source) {
		double result = 0;
		for (CD e : source) {
			result += e.getPrice();
		}
		return result;
	}
}
