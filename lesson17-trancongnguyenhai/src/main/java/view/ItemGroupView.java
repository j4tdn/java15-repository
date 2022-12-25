package view;

import java.util.List;

import persistence.ItemGroupDto;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemGroupDto> items = itemGroupService.getAmountItemEachItemGroup();
		System.out.println(items);
	}
}
