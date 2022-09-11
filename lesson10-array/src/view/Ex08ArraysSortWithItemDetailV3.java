package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex08ArraysSortWithItemDetailV3 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
		
		//Itemdetail implement combarable<Itemdetail>
		Arrays.sort(items);
		
		System.out.println("1st asc sorted itemdetail " + Arrays.toString(items));
		
		Arrays.sort(items, new Comparator<ItemDetail>() {

			@Override
			public int compare(ItemDetail o1, ItemDetail o2) {
				return o1.getItemId() - o2.getItemId();
			}
		});
		System.out.println("1st asc sorted itemdetail " + Arrays.toString(items));
	}
}
