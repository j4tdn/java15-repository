package view;

import bean.ItemDetail;
import model.DataModel;
import utils.CompareObjectHelper;


public class Ex04BubleSortWithItemDetail {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDeatails();
		bbs(items, new CompareObjectHelper() {
			
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {
				// TODO Auto-generated method stub
				return 0;
			}
		});
	}
	
	private static void bbs(ItemDetail[] elements, CompareObjectHelper helper) {
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
