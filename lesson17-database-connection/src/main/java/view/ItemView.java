package view;

import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("----- 1. Get items by ig name -----");
		itemService.getItems("áo").forEach(System.out::println);
		System.out.println("\n\n");
	}
}
