package view;

import java.util.Collection;
import java.util.List;

import persistence.ItemDetail;
import service.ItemDetailService;
import service.ItemDetailServiceImpl;

public class ItemDetailView {
	private static ItemDetailService itemDetailService;
	
	static { 
		itemDetailService = new ItemDetailServiceImpl();
	}
	public static void main(String[] args) {
		List<ItemDetail> result = itemDetailService.getAll();
		printf(result);
	}
	private static <E> void printf(Collection<E> collection)
	{
		collection.forEach(System.out::println);
	}
}
