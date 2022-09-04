package ex02.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import ex02.bean.CD;

public class CDStoreUtils {
	public CDStoreUtils() {

	}

	public static List<CD> addIf(List<CD> cds, CD item) {
		List<CD> result = cds;
		for (int i = 0; i < cds.size(); i++) {
			if (result.get(i).getId() == item.getId()) {
				return result;
			} else {
				if (i < result.size()) {
					continue;
				} else {
					result.add(item);
				}
			}

		}
		return result;
	}

	public static int getNumList(List<CD> cds) {
		return cds.size();
	}

	public static float sumCDs(List<CD> cds) {
		float sum = 0;
		for (CD cd : cds) {
			sum += cd.getPrice();
		}
		return sum;
	}
	
	
}
