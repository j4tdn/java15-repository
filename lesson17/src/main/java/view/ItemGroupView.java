package view;

import service.ItemGroupService;
import service.ItemGroupServiceImp;

public class ItemGroupView {
	public static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImp();
	}

	public static void main(String[] args) {
        itemGroupService.getAll().forEach(System.out::println);
	}
}
