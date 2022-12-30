package view;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("-----1. Get IG-DTO----");
		
		itemGroupService.getItemGroups().forEach(System.out::println);


	}
}
