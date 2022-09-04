package Ex02;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import static java.util.Comparator.*;
import java.util.List;
import java.util.function.Predicate;

public class utils {
	private utils() {
	}
	
	public static int getAmount(List<Cd> list) {
		return list.size();
	}
	public static double totalPrice(List<Cd> list) {
		double total = 0;
		for(Cd ls : list) {
			total += ls.getPrice();
		}
		return total;
	}
	public static void Des(List<Cd> list) {
		Collections.sort(list, nullsFirst(comparing(Cd::getPrice, reverseOrder())) );
	}
	
	
}
