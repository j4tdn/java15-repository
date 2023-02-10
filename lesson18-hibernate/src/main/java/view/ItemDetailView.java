package view;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import persistence.ItemDetail;
import persistence.ItemGroup;
import service.ItemDetailService;
import service.ItemDetailServiceImpl;

public class ItemDetailView {
	private static ItemDetailService itemDetailService;
	static {
		itemDetailService = new ItemDetailServiceImpl();
	}

	public static void main(String[] args) {
		System.out.println("Cau 4. Liet ke tat ca cac mat hang co chua thong tin kich co mat hang");
		
		List<ItemDetail> itemDetails = itemDetailService.getAll();
		printf(itemDetails);
	}
	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}
