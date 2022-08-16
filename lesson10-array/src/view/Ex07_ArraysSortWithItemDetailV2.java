package view;

import java.util.Arrays;
import static java.util.Comparator.*;

import bean.ItemDetail;
import model.DataModel;

public class Ex07_ArraysSortWithItemDetailV2 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetail();
		Arrays.sort(items, nullsFirst(
				
				comparing(ItemDetail::getStoreId, reverseOrder())
				.thenComparing(ItemDetail::getItemId, reverseOrder()))
				);
		System.out.println(Arrays.toString(items));
	}
}
