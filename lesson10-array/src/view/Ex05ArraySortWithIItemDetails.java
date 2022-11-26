package view;

import java.util.Arrays;
import java.util.Comparator;

import Model.DataModel;
import bean.ItemDetail;

public class Ex05ArraySortWithIItemDetails {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				// TODO Auto-generated method stub
				return o1.getStoreId() - o2.getStoreId();
			}
		});
	}
}
