package view;

import java.util.Arrays;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
			
		
		Arrays.sort(items);
		
		System.out.println("1st sorted items: " + Arrays.toString(items));
	}
}
