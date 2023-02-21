package view;

import java.util.Collection;
import java.util.List;

import dto.ItemGroupDto;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	private static ItemGroupService itemGroupService; 
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("Câu 1 : Liệt kê tất cả các loại hàng");
		System.out.println(itemGroupService.getAll());
		System.out.println("Caau5: Dem so luong");
		List<ItemGroupDto> amountOfItemsPerItemGroups = itemGroupService.getItemGroups();
		printf(amountOfItemsPerItemGroups);
		System.out.println("Câu 6 : Thêm mới loại hàng");
		ItemGroup ig = new ItemGroup(24, "LH24");
		

		
	}
	private static <E> void printf(Collection<E> collection) {
		collection.forEach(System.out::println);
	}
}
