package view;

import java.time.LocalDate;
import java.time.Month;

import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		
		LocalDate orderDate = LocalDate.of(2020, Month.DECEMBER, 17);
		System.out.println("1. Get items by order date");
		itemService.getItems(orderDate).forEach(System.out::println);
		
		int orderYear = 2020;
		System.out.println("\n\n2. Get items by sell number");
		itemService.getTop3(orderYear).forEach(System.out::println);
	}
}
