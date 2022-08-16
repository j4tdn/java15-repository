package view;

import java.util.Arrays;

import bean.ItemDetail;
import model.DataModel;
import utils.CompareObjectHelper;

import utils.SortUtils;

public class Ex04BubbleSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetail();
		sort(items, new CompareObjectHelper() {
			
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				int storeId1 = i1.getStoreId();
				int storeId2 = i2.getStoreId();
				
				if(storeId1 != storeId2) {
					return storeId1 - storeId2;
				}
				int itemId1 = i1.getItemId();
				int itemId2 = i2.getItemId();
				
				return itemId2 - itemId1;
			}
		});
		System.out.println(Arrays.toString(items));
		
	}
	private static void sort(ItemDetail[] items, CompareObjectHelper hepler) {
		for(int round = 0; round < items.length  ; round++) {
			for ( int i = 0 ; i < items.length-round-1; i++) {
				if(hepler.compare(items[i], items[i+1]) > 0) {
					SortUtils.swap(items,i,i+1);
				}
			}
		}
	}
}
