package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetaiV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		// ItemDetai implements Comparable<ItemDetail>
		Arrays.sort(items);
		
		System.out.println("1st sorted items: " + Arrays.toString(items));
		
//		Arrays.sort(items, new Comparator<ItemDetail>() {
//			@Override
//			public int compare(ItemDetail i1, ItemDetail i2) {
//				return Double.compare(i2.getPrice(), i1.getPrice());
//			}
//		});
//		
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return Double.compare(i2.getItemId(), i1.getItemId());
			}
		});
		System.out.println("2nd sorted items: " + Arrays.toString(items));

		
		//Refer --> 2nd way(Comparator)
		// + Reduce code in T class
		// + Catch error at compile
		// + Comparator supports multiple sorting functions concurrent
	}
}
