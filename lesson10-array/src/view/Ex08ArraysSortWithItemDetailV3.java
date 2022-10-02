package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		//ItemDetail implement Comparable<ItemDetail>
		//Comparable
		Arrays.sort(items);
		System.out.println("1st sorted items: " + Arrays.toString(items));
		
		
		//Comparator<ItemDeatail>
		Arrays.sort(items, new Comparator<ItemDetail>() {
			@Override
			public int compare(ItemDetail i1, ItemDetail i2) {

				return Double.compare(i2.getPrice() ,i1.getPrice());
			}
		});
		/**Refer --> 2nd way(Comparator)
		 + Reduce code in T class
		 + Catch error at compile
		 + Comparator support multiple sorting function concurrent
		*/
	}
	
}
