package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraySortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		//ItemDetail implement Comparable<ItemDetail>
		Arrays.sort(items);
		System.out.println("1st sorted item: " + Arrays.toString(items));
		
		//Comparator<ItemDetail> 
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
			
		});
		
		//Refer --> 2nd way(comparator)
		//+ reduce code in T class
		//+ catch error at compile
		//+ Comparator support multiple sorting fuction concurrency
	}
}
