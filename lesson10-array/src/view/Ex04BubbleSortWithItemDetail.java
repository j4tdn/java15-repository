package view;

import java.util.Arrays;

import Model.DataModel;
import bean.ItemDetail;
import utils.CompareObjectHelper;
import utils.CompareStringHelper;
import utils.SortUtils;

public class Ex04BubbleSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		sort(items, new CompareObjectHelper() {
			
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				// TODO Auto-generated method stub
				return i1.getStoreId() - i2.getStoreId();
			}
		});
		System.out.println(Arrays.toString(items));
	}
	
	private static void sort(ItemDetail[] elements,CompareObjectHelper helper) {
		for (int round = 0; round < elements.length; round ++) {
			for (int i = 0;i < elements.length - round -1; i++) {
				if (helper.compare(elements[i], elements[i+1]) > 0) {
					SortUtils.swap(elements, i, i+1);
				}
			}
		}
	}
}
