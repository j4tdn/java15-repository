package ex02;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsFirst;
import static java.util.Comparator.reverseOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Ex02 {
	public static void main(String[] args) {

		List<ItemCD> items = getItems();
		ItemCD itemX = new ItemCD(6, "CD11", "Phuong Ly", 1234d);
		System.out.println("size: " + items.size());
		utils.add(items, itemX);
		System.out.println("So luong CD: " + utils.size(items));
		System.out.println("Gia CD: " + utils.sumPrice(items));
		utils.sort(items,nullsFirst(comparing(ItemCD::getPrice, reverseOrder())));
		System.out.println(items.toString());
		utils.sort(items,nullsFirst(comparing(ItemCD::getIdCD)));
		System.out.println(items.toString());
		
		

	}

	private static List<ItemCD> getItems() {
		ItemCD item1 = new ItemCD(1, "CD1", "Hieu", 2234d);
		ItemCD item2 = new ItemCD(2, "CD2", "Son Tung", 7234d);
		ItemCD item3 = new ItemCD(3, "CD3", "MONO", 5234d);
		ItemCD item4 = new ItemCD(4, "CD4", "Den Vau", 1234d);
		List<ItemCD> items = new ArrayList<>();
		items.add(item1);
		items.add(item2);
		items.add(item3);
		items.add(item4);
		return items;
	}

}
