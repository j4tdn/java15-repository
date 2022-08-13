package view;

import java.util.Arrays;

import bean.ItemDetail;
import common.CompareStringHelper;
import common.compareObjectHelper;
import model.DataModel;
import ultis.SortUtils;

public class Ex05_BubbleSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetail();

		sort(items, new compareObjectHelper() {
			
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				if(i1 == null) {
					return -1;
				}
				if(i2 == null) {
					return 1;
				}
				int storeId1 = i1.getStoreId();
				int storeId2 = i2.getStoreId();
				if(storeId1 != storeId2) {
					return storeId1 - storeId2;
				}
				int itemId1 = i1.getItemId();
				int itemId2 = i2.getItemId();
				return itemId1 - itemId2;
			}
		});
		System.out.println(Arrays.toString(items));
	}

	private static void sort(ItemDetail[] source, compareObjectHelper helper) {
		for (int i = 0; i < source.length; i++) {
			for (int j = 0; j < source.length - i - 1; j++) {
				if (helper.compare(source[j], source[j + 1]) > 0) {
					SortUtils.swap(source, j, j + 1);
				}
			}
		}
	}
}
