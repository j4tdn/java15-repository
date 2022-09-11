package view;

import java.util.Arrays;
import static java.util.Comparator.*;

import bean.ItemDetail;
import model.DataModel;

public class ArraysSortWithItemDetailV2 {
	public static void main(String[] args) {
		 ItemDetail[] items = DataModel.getItemDetails();
		 
//		 Arrays.sort(items, new Comparator<ItemDetail>() {
//
//			@Override
//			public int compare(ItemDetail i1, ItemDetail i2) {
//				return i1.getStoreId() - i2.getItemId();
//			}
//		});
		 Arrays.sort(items, nullsFirst(comparing(ItemDetail::getStoreId, reverseOrder())
				 .thenComparing(ItemDetail::getItemId)));
		 System.out.println(Arrays.toString(items));
	}
}
