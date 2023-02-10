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
		System.out.println("Cau 1: Liệt kê tất cả các loại hàng");
		List<ItemGroup> igs = itemGroupService.getAll();
		printf(igs);
		System.out.println("Cau 3 : Liệt kê các mặt hàng - loại hàng");
		printf(igs.get(2).getItems());
		System.out.println("Cau 5 : Liệt kê số lượng mặt hàng theo loài hàng");
		List<ItemGroupDto> amountItemPerGroups = itemGroupService.getItemGroups();
		printf(amountItemPerGroups);
		System.out.println("Cau 6 : Thêm mới loại hàng");
		ItemGroup ig = new ItemGroup(24, "LoaiHang 24");
		itemGroupService.saveOrUpdate(ig);

	}
	
	private static <E> void printf(Collection<E> collection)
	{
		collection.forEach(System.out::println);
	}
}	
	
