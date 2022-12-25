package view;

import java.time.LocalDate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;
	private static ItemGroupService igService;
	
	static {
		itemService = new ItemServiceImpl();
		igService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("==> Cau 1: ");
		LocalDate date = LocalDate.of(2020, 12, 18);
		System.out.println(itemService.getItems(date));
		
		System.out.println("==> Cau 2: ");
		System.out.println(igService.getItemGroups());
		
		System.out.println("==> Cau 3: ");
		Integer year = 2020;
		System.out.println(itemService.getTop3ItemsToSring(year));
		
		System.out.println("==> Cau 4: ");
		System.out.println(itemService.getItemsGroupByIG());
	}
}
