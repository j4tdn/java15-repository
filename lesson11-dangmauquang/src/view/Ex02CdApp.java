package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import bean.Cd;

public class Ex02CdApp {
	public static void main(String[] args) {
		Cd cdX = new Cd(101, "Nhac vang", "Quang Linh", 14, 30000d);
		List<Cd> cds = getCds();
		addCd(cds, cdX);
		System.out.println("Size: " + cds.size());
		System.out.println("Sum price cd: " + sumPrice(cds));
		
		System.out.println("===================");
		sortInPrice(cds);
		System.out.println(cds);
		
		System.out.println("===================");
		sortInCdId(cds);
		System.out.println(cds);
	}

	private static List<Cd> getCds() {
		Cd cd1 = new Cd(101, "Nhac vang", "Quang Linh", 14, 30000d);
		Cd cd2 = new Cd(102, "Nhac vang", "Phi Nhung", 20, 50000d);
		Cd cd3 = new Cd(103, "Nhac tre", "Ho Quang Hieu", 16, 35000d);
		Cd cd4 = new Cd(104, "Nhac US", "Taylor Swift", 21, 60000d);
		Cd cd5 = new Cd(105, "Nhac tre", "Noo Phuoc Thinh", 12, 25000d);

		List<Cd> cds = new ArrayList<>();
		cds.add(cd1);
		cds.add(cd2);
		cds.add(cd3);
		cds.add(cd4);
		cds.add(cd5);

		return cds;
	}

	private static List<Cd> addCd(List<Cd> cds, Cd cdX) {
		if (!cds.contains(cdX)) {
			cds.add(cdX);
		} else {
			System.out.println("Cd is exists");
		}
		return cds;
	}

	private static double sumPrice(List<Cd> cds) {
		double sum = 0;

		for (Cd cd : cds) {
			sum += cd.getPrice();
		}

		return sum;
	}
	
	private static void sortInPrice(List<Cd> cds) {
		Collections.sort(cds, new Comparator<Cd>() {

			@Override
			public int compare(Cd o1, Cd o2) {
				return (int) (o1.getPrice() - o2.getPrice());
			}
			
		});
	}
	
	private static void sortInCdId(List<Cd> cds) {
		Collections.sort(cds, new Comparator<Cd>() {

			@Override
			public int compare(Cd o1, Cd o2) {
				return (o1.getCdId()) - o2.getCdId();
			}
			
		});
	}
}