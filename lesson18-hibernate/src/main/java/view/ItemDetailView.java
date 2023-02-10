package view;

import java.util.Collection;

import service.ItemDetailService;
import service.ItemDetailServiceImpl;

public class ItemDetailView {
	private static ItemDetailService itemDetailService;
	static {
		itemDetailService = new ItemDetailServiceImpl();
	}

	public static void main(String[] args) {

		printf(itemDetailService.getAll());
	}

	private static <E> void printf(Collection<E> collections) {
		collections.forEach(System.out::println);
	}
}
