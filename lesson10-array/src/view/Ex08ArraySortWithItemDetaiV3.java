package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;
public class Ex08ArraySortWithItemDetaiV3 {
	public static void main(String[] args) {
		ItemDetail[] items= DataModel.getItemDetails();
		
		//ItemDetail implements Comparable<ItemDetail>
		Arrays.sort(items);
		System.out.println("1st Sorted Item: "+ Arrays.toString(items));
		//Comparator<ItemDetail>
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return Double.compare(i2.getPrice(), i1.getPrice());
			}
		});
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return Double.compare(i1.getStoreId(), i2.getStoreId());
			}
		});
		
		
		//refer--> 2nd way(Comparator)
		//+reduce code in T class
		// catch error at compile
		//+ Comparator supports multiple sorting function concurrency
	}
}
