package view;

import java.util.Collection;
import java.util.List;

import dto.ItemGroupDto;
import persistence.Item;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("-------- Câu 1: Liệt kê tất cả các loại hàng -------");
		List<ItemGroup> itemGroups = itemGroupService.getAll();
		printf(itemGroups);
		
		System.out.println("-------- Câu 3: Liệt kê tất cả các mặt hàng của loại hàng-------");
		ItemGroup ig = itemGroups.get(2);
		List<Item> items = ig.getItems();
		printf(items);
		
		System.out.println("-------- Câu 5: Liệt kê số lượng các mặt hàng của loại hàng-------");
		List<ItemGroupDto> amountItemOfItemGroups = itemGroupService.getItemGroups();
		printf(amountItemOfItemGroups);
		
//		System.out.println("-------- Câu 6: Thêm mới loại hàng-------");
//		ItemGroup igNew = new ItemGroup(2023, "Loai Hang 2023");
//		itemGroupService.saveOrUpdate(igNew);
		
	}
	
	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}
