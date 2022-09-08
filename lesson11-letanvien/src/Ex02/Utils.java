package Ex02;

import java.util.List;

public class Utils {
	private Utils() {
	};

	public static boolean addCD(List<CD> cds, CD item) {

		for (CD cd : cds) {
			if (cd.getId() == item.getId()) {
				return false;
			}
		}

		cds.add(item);
		return true;
	}

	public static int getAllQuantily(List<CD> cds) {
		return cds.size();
	}

	public static double getTotalPrice(List<CD> cds) {
		double result = 0;

		for (CD cd : cds) {
			result += cd.getPrice();
		}

		return result;
	}

	public static void printf(List<CD> cds) {
		for (CD cd : cds) {
			System.out.println(cd);
		}
	}
}