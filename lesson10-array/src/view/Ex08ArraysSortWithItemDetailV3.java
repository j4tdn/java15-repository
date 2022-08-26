package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDeatails();
		
		//ItemDetail implements Comparable<ItemDetail>;
		Arrays.sort(items);
		System.out.println("1 : "+Arrays.toString(items));
		
		//Comparator<ItemDetail>
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				return Double.compare(o1.getPrice(), o2.getPrice());
			}
		});
		System.out.println("2 : "+Arrays.toString(items));
		//Comparable: when u sort Object, you must override Function compareTo of Comparable that <T> implements
		//Refer --> 2nd way(Comparator)
		//+Reduce code in T class
		//+Catch error at compile
		//+Comparator supports multiple sorting functions concurrent
	}
}
