package view;

import java.util.Arrays;
import static java.util.Comparator.*;
import java.util.Objects;
import java.util.function.Function;


import java.io.Serializable;

import bean.ItemDetail;
import model.DataModel;

public class Ex07_ArraysSortWithItemDetailV2 {
	public static void main(String[] args) {
		ItemDetail[] items = DataModel.getItemDetail();
		//ItemDetail -> ItemDetail.getPrice() ==> ItemDetail::getPrice
		//Comparable<ItemDetail> comparator = Comparator.comparing(ItemDetail -> ItemDetail.getPrice());
		
		//Comparator<ItemDetail> comparator = Comparator.comparing(ItemDetail::getPrice);
		//Comparator<ItemDetail> comparator = comparing(ItemDetail::getPrice);
	//	Arrays.sort(items, comparing(ItemDetail::getPrice));
	//	System.out.println(Arrays.toString(items));

		/*
		public static <T, U extends Comparable<? super U>> Comparator<T> comparing(
        Function<? super T, ? extends U> keyExtractor) 
  		{
      Objects.requireNonNull(keyExtractor);
      return (Comparator<T> & Serializable)
          (c1, c2) -> keyExtractor.apply(c1).compareTo(keyExtractor.apply(c2));
  		}
  */		
		Arrays.sort(items, nullsFirst(
				
				comparing(ItemDetail::getStoreId, reverseOrder())
				.thenComparing(ItemDetail::getItemId, reverseOrder()))
				);
		System.out.println(Arrays.toString(items));
	}
}
