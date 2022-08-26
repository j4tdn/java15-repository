package view;

import java.util.Arrays;
import static java.util.Comparator.*;
import bean.ItemDetail;
import model.DataModel;

public class Ex06ArraysSortWithItemDetailV2 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDeatails();
		
		//ORDER BY storedID ASC
		//Arrays.sort(items, (i1,i2) -> i1.getItemId() - i2.getItemId());
		
		//itemDetail -> itemDetail.getPrice() ==> ItemDetail::getPrice 
		//Comparator<ItemDetail> comparator = Comparator.comparing(itemDetail -> itemDetail.getPrice());
		
		//ORDER BY itemId ASC
		//Nếu bằng StoreId bằng nhau thì so sánh ItemId
		Arrays.sort(items, nullsFirst(
				comparing(ItemDetail::getStoreId, reverseOrder())
				.thenComparing(ItemDetail::getItemId, reverseOrder())
									)
				); 
		
		System.out.println(Arrays.toString(items));
	}
}
