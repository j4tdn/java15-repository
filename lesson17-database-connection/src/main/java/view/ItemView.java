package view;

import service.ItemGroupService;
import service.ItemGroupServiceImp;
import service.ItemService;
import service.ItemServiceImp;

public class ItemView {
	private static ItemService itemService;
   
	static {
		itemService = new ItemServiceImp();
		
	}

	public static void main(String[] args) {
       System.out.println("1. Get items by ig name");
       itemService.getItems("áo").forEach(System.out::println);
       System.out.println("\n\n");
       System.out.println("2.");
       
     
	}
}
