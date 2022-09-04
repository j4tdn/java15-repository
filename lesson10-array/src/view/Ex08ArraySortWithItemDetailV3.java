package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraySortWithItemDetailV3 {
     public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		// ItemDetail implements Comparable<ItemDetail>
		Arrays.sort(items);
		
		System.out.println("1st sorted items : " + Arrays.toString(items));
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getPrice(), o1.getPrice());
			}
		});
		System.out.println("2nd sorted items :" + Arrays.toString(items));
		// Refer --> 2nd way (Comparator)
		// + Reduce code in T class
		// + Catch error at compile
		// + Comparator supports multiple sorting functions concurrent
	}
}
