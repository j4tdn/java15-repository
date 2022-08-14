package view;

import java.util.Arrays;
import java.util.Comparator;

import bean.ItemDetail;
import model.DataModel;

public class Ex06ArraySortWithItemDetailV2 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetails();
//		Arrays.sort(items, (i1, i2) -> {
//			if(i1 == null)
//			{
//				return -1;
//			}
//			if(i2 == null )
//			{
//				return 1;
//			}
//			// ORDER BY storeID ASC, itemId DESC
//			if(i1.getStoreId() != i2.getStoreId()) 
//			{
//				return i1.getStoreId() - i2.getStoreId();
//			}
//			return i2.getItemId() - i1.getItemId(); 
//		});
//		System.out.println(Arrays.toString(items));
		// order by storeId desc, itemId asc , null first
		
//		Comparator<ItemDetail> comparator = Comparator.comparing((ItemDetail itemDetail) -> itemDetail.getStoreId())
//														.thenComparing(itemDetail -> itemDetail.getPrice());
//		
//		comparator = comparator.thenComparing(itemDetail -> itemDetail.getPrice());
		Arrays.sort(items, Comparator.nullsFirst(
				Comparator.comparing((ItemDetail itemDetail) -> itemDetail.getStoreId(), Comparator.reverseOrder())
				.thenComparing(itemDetail -> itemDetail.getPrice())) 
				);
		System.out.println(Arrays.toString(items));
	}
}
