package view;

import java.util.Arrays;
import static java.util.Comparator.*;

import bean.ItemDetail;
import model.DataModel;

public class Ex06ArraysSortWithItemDetailV2 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetailsWithNull();
		
		// ORDER BY storeId ASC
		// Arrays.sort(items, (i1, i2) -> i1.getStoreId() - i2.getStoreId());
		
		/*
		 T: generic type
		 ?: wildcard
		 ? super T: T or parent of T
		 public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
		 	Function<? super T, ? extends U> function) {
	        return (Comparator<T> & Serializable)
	            (i1, i2) -> i1.getItemId().compareTo(i2.getItemId());
	     }
		 */
		// itemDetail -> itemDetail.getPrice() ==> ItemDetail::getPrice ==> method reference
		// ORDER BY storeId DESC, itemId ASC
		Arrays.sort(items, nullsLast(
						          comparing(ItemDetail::getStoreId, reverseOrder())
						     .thenComparing(ItemDetail::getItemId))
						   );
		System.out.println(Arrays.toString(items));
	}
}
