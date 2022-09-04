package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetail();
		
		//Arrays.sort(items);
		//System.out.println("1st sorted items: " + Arrays.toString(items));
		//Comparator<ItemDetail>
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return Double.compare(i1.getPrice(), i2.getPrice());
			}
		});
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return i1.getItemId() - i2.getItemId();
			}
		});
		
	}
}
