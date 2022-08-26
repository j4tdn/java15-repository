package view;

import java.util.Arrays;

import bean.ItemDetail;
import model.DataModel;
import utils.CompareObjectHelper;


public class Ex04BubleSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDeatails();
		
		//null first
		//ASC by storeID
		//DESC by itemID of same storeID
		sort(items, new CompareObjectHelper() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				if(i1 == null) return -1;
				if(i2 == null) return 1;
				return i1.getStoreId() - i2.getStoreId();
			}
		});
		
		System.out.println(Arrays.toString(items));
	}
	
	private static void sort(ItemDetail[] elements, CompareObjectHelper helper) {
		for(int i = 0; i<elements.length;i++) {
			for(int j = 0; j<elements.length-1-i;j++) {
				if(helper.compare(elements[j], elements[j+1]) > 0) {
					ItemDetail temp = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = temp;
				}
				
			}
		}
	}
}
