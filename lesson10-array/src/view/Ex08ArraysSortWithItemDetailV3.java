package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		// ItemDetail implements Comparable<ItemDetail>
		Arrays.sort(items);
		System.out.println("1st sorted items: " + Arrays.toString(items));
	
		// Comparator<ItemDetail>
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return Double.compare(i2.getPrice(), i1.getPrice());
			}
		});
		
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return i1.getItemId() - i2.getItemId();
			}
		});
		
		// Refer --> 2nd way(Comparator)
		// + Reduce code in T class
		// + Catch error at compile
		// + Comparator supports multiple sorting functions concurrent
	}
}