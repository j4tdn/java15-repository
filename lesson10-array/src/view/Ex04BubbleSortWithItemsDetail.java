package view;
import java.util.Arrays;

import bean.*;
import model.*;
import utils.CompareObjectHelper;
import utils.SortUtils;
public class Ex04BubbleSortWithItemsDetail {
	
	public static void main(String[] args) {
		ItemDetail[] items=DataModel.getItemDetails();
		
		sort(items, new CompareObjectHelper() {
			
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				if(i1==null) {
					return -1;
				}
				if(i2==null) {
					return 1;
				}
				int  storeId1=i1.getStoreId();
				int  storeId2=i2.getStoreId();
				
				//int  itemId1=i1.getItemId();
				//int  itemId2=i2.getItemId();
				if(storeId1!=storeId2) {
					return storeId1-storeId2;
				}
				
				if(storeId1==storeId2) {
					return storeId2-storeId1;
				}
				return storeId1-storeId2;
			}
		});
		System.out.println(Arrays.toString(items));
	}
	
	
	
	private static void sort(ItemDetail[] elements, CompareObjectHelper helper) {
		for (int round = 0; round < elements.length; round++) {
			for (int i = 0; i < elements.length - round - 1; i++) {
				if (helper.compare(elements[i], elements[i+1])> 0) {
					SortUtils.swap(elements, i, i + 1);
				}
			}
		}
	}
}
