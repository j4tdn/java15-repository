package view;

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
		List<ItemDetail> itemDetails = itemDetailService.getAll();
		System.out.println("-------- Câu 4: -------");
		itemDetails.forEach(System.out::print);
		
	}
}
