package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex05ArraysSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDeatails();
		
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				if(o1 == null) return -1;
				if(o2 == null) return 1;
				if( o1.getStoreId() != o2.getStoreId()) {
					return o1.getStoreId() - o2.getStoreId();
				}
				return o1.getItemId() - o2.getItemId();
			}
		});
		System.out.println(Arrays.toString(items));
	}
	
}
