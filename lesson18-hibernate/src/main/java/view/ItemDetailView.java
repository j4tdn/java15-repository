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
		System.out.println("... *** Câu 4: Liệt kê tất cả các mặt hàng chứa thông tin kích cỡ mặt hàng *** ...");
		List<ItemDetail> itemDetails = itemDetailService.getAll();
		printf(itemDetails);
	}

	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}
