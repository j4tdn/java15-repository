package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ex02 {
	public static void main(String[] args) {
		List<DiskCD> cds = getCD();

		System.out.println(addCD(cds, new DiskCD(5, " e ", "E", 6, 120000)));

		System.out.println("số lượng CD: " + cds.size());

		System.out.println("Tổng giá thành : " + sumPrice(cds));

		cds.sort(Comparator.comparing(DiskCD::getPrice).reversed());
		print(cds);
		
		System.out.println("======================");
		cds.sort(Comparator.comparing(DiskCD::getIdCD));
		print(cds);

	}

	private static List<DiskCD> getCD() {
		List<DiskCD> cds = new ArrayList<>();
		cds.add(new DiskCD(1, " a ", " A", 10, 112000));
		cds.add(new DiskCD(2, " b ", " B ", 9, 135000));
		cds.add(new DiskCD(3, " c ", " C", 19, 541000));
		cds.add(new DiskCD(4, " d ", " D ", 5, 150000));
		return cds;
	}

	private static boolean addCD(List<DiskCD> listCD, DiskCD cd) {
		if (listCD.contains(cd)) {
			return false;
		}
		listCD.add(cd);
		return true;
	}

	private static double sumPrice(List<DiskCD> listCDs) {
		double result = 0;
		for (DiskCD cd : listCDs) {
			result += cd.getPrice();
		}
		return result;
	}
	
	private static void print(List<DiskCD> cds) {
		for (DiskCD cd : cds ) {
			System.out.println(cd);
		}
	}
}