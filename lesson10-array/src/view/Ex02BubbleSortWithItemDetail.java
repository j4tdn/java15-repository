package view;

import java.util.Arrays;

import bean.ItemDetail;
import model.DataModel;
import utils.CompareObjectHelper;
import utils.SortUtils;

public class Ex02BubbleSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetailsWithNull();
		//null first
		//ASC by storeId
		//DESC by itemId od same storeId
		sort(items, new CompareObjectHelper() {
			
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
				
				return itemId2 - itemId1;
			}
		});
		
		System.out.println(Arrays.toString(items));
	}
	
	private static void sort(ItemDetail[] elements, CompareObjectHelper helper) {
		for(int round = 0; round < elements.length; round++) {
			for(int i = 0; i < elements.length - round - 1; i++) {
				if(helper.compare(elements[i], elements[i+1]) > 0) {
					SortUtils.swap(elements, i, i+1);
				}
			}
		}
	}
}
