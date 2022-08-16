package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex06ArraySortWithItemDetailP2 {
    public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				// TODO Auto-generated method stub
				return i1.getStoreId() - i2.getStoreId();
			}
		});
		System.out.println(Arrays.toString(items));
	}
}
