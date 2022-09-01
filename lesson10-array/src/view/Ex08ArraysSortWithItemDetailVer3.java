package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetailVer3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		//ItemDetail implements Comparable<ItemDetail>
		Arrays.sort(items);
		System.out.println("1st sorted items: " + Arrays.toString(items));
		
		//Comparator<ItemDetail>
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return Double.compare(i2.getPrice(), i1.getPrice());
			}
		});
	}
}
