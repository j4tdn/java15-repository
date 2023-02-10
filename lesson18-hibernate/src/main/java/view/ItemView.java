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
		System.out.println("... *** Câu 2: Liệt kê tất cả các mặt hàng *** ...");
		List<Item> items = itemService.getAll();
		printf(items);
		
		System.out.println("\n *** ... Lazy Fetch *** ...");
		Item item = items.get(2);
		System.out.println("item --> " + item);
		System.out.println("item 2 - item group --> " + item.getItemGroup());
	}
	
	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}
