package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraySortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		// ItemDetaild must be implements Comparable<ItemDetail> 
		Arrays.sort(items);
		System.out.println("1st sorted items: " + Arrays.toString(items));
		
		// Comparator<ItemDetail>
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				return Double.compare(o2.getPrice(), o1.getPrice());
			}
		});
		
		// Refer --> 2nd way (Comparator)
		// + Reduce code in T class
		// + Catch error a compile
		// + Comparator support multiple sorting functions concurrent
	}
}
