package view;

import java.util.List;

import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupView {
	private static ItemGroupService itemGroupService = new ItemGroupServiceImpl();
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("1. Save or update");
		itemGroupService.saveOrUpdate(new ItemGroup(1234, "Loai Hang 1234"));
		
		/*
		List<ItemGroup> GET_ALL_IGS =  itemGroupService.getAll();
		System.out.println("GET_ALL_IGS -->"
		GET_ALL_IGS.forEach(System.out::println);
		*/
		
		System.out.println("\n\n 2. Get IG by ID ");
		ItemGroup GET_IG_BY_ID = itemGroupService.get(10);
		System.out.println("GEt_IG_BY_ID -->" + GET_IG_BY_ID);
		
		System.out.println("\n\n 3. Search IG by name");
		String sqlName = "Thắt Lưng";
		String sqlInjection = "...' OR '1=1";
		List<ItemGroup> igsByName = itemGroupService.search(sqlInjection);
		igsByName.forEach(System.out::println);
		
	}
}
