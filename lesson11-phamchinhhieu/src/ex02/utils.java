package ex02;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import javax.sound.sampled.ReverbType;



public class utils {
	//private static List<ItemCD> items = new ArrayList<>();

	public utils() {
		// TODO Auto-generated constructor stub
	}

	public static int size(List<ItemCD> item) {
		return item.size();
	}

	public static double sumPrice(List<ItemCD> item) {
		double total = 0;
		for(ItemCD items: item) {
			total += items.getPrice();
		}
		return total;
	}

	public static List<ItemCD> sort(List<ItemCD> list, Comparator<ItemCD> comparator){
		list.sort(comparator);
		return list;
		
	}
	public static void add(List<ItemCD> items, ItemCD item) {
		if (!items.contains(item)) {
			items.add(item);
		}
	}
}