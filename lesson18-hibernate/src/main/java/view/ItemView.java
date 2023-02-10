package view;


import java.util.Collection;
import java.util.List;

import persistence.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}

	public static void main(String[] args) {
		System.out.println("Cau 1: Liệt kê tất cả các loại hàng");
		List<Item> items = itemService.getAll();
		printf(items);
		
		System.out.print("\n Fetch Lazy ------------------");
		System.out.println(items.get(2).getItemGroup());
		
		
	}
	
	private static <E> void printf(Collection<E> collection)
	{
		collection.forEach(System.out::println);
	}
}	
	
