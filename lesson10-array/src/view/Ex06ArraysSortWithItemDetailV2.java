package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex06ArraysSortWithItemDetailV2 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		Arrays.sort(items, new Comparator<ItemDetail>() {
			// ORDER BY storeId ASC
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return i1.getStoreId() - i2.getStoreId();
			}

		});

		Comparator<ItemDetail> comparator = new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				return i1.getStoreId() - i2.getStoreId();
			}
		};
		System.out.println(Arrays.toString(items));
	}
}
