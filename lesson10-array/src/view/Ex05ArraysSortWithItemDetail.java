package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex05ArraysSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				//b1: NULLFIRST
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
				//ORDER BY STOREID ACS, ItemId DSC
				int itemId1 = i1.getItemId();
				int itemId2 = i2.getItemId();
				
				return itemId2 - itemId1;
			}
		});
		System.out.println(Arrays.toString(items));
	}
}
