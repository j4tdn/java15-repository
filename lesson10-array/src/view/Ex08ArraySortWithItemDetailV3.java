package view;

import java.util.Arrays;
import java.util.Comparator;

import Model.DataModel;
import bean.ItemDetail;

public class Ex08ArraySortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		// ItemDetail implements Comparable
		Arrays.sort(items,new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				// TODO Auto-generated method stub
				return Double.compare(o2.getPrice(), o1.getPrice());
			}
		});
		
		System.out.println("1st sorted items" + Arrays.toString(items));
		
		//Refer --> 2nd way(Comparator)
		// Reduce code in T class
		// Catch error at compile
		// Comparator supports mutiple sorting function
	}
}
