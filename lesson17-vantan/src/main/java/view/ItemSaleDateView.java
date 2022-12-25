package view;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemSaleDate;
import service.ItemSaleDateIplm;
import service.ItemSaleDateService;

public class ItemSaleDateView {
	private static ItemSaleDateService itemSaleDateService;
	
	static {
		itemSaleDateService = new ItemSaleDateIplm();
	}
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 12, 18);
	
		
		System.out.println(date.toString());
		List<ItemSaleDate> is = itemSaleDateService.get(date);
		
		is.forEach(System.out::println);
	}
}
