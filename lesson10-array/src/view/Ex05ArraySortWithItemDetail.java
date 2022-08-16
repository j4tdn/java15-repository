package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex05ArraySortWithItemDetail {
     public static void main(String[] args) {
    	 ItemDetail[] items = DataModel.getItemDetails();
    	 
    	 Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				// Null first
				if (i1 == null) {
					return -1;
				}
				if (i2 == null) {
					return 1;
				}
				// ORDER BY STORE ASC , itemId DESC
				int storeId1 = i1.getStoreId();
				int storeId2 = i2.getStoreId();
				if (storeId1 != storeId1) {
					return storeId1 - storeId2;
				}
				// IF STORE ID1 = STORE ID2 , itemid Asc
				int itemId1 = i1.getItemId();
				int itemId2 = i2.getItemId();
				return itemId1 - itemId2;
			}
		});
    	 System.out.println(Arrays.toString(items));
	}
}
