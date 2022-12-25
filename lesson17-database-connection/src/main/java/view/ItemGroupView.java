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
		System.out.println("------ 1. Save Or Update ----------");
		itemGroupService.saveOrUpdate(new ItemGroup(1234, "Item Group 1423"));
		System.out.println("\n\n");
		
		/*
		List<ItemGroup> GET_ALL_IGS = itemGroupService.getAll();
		System.out.println("GET_ALL_IGS --> ");
		GET_ALL_IGS.forEach(System.out::println);
		*/
		
		System.out.println("-------- 2. Get IG by ID -------");
		ItemGroup GET_IG_BY_ID = itemGroupService.get(4);
		System.out.println("GET_IG_BY_ID --> " + GET_IG_BY_ID);
		System.out.println("\n\n");
		
		System.out.println("-------- 3. Get IG by name -------");
		
		String sqlName = "Thắt lưng";
		String sqlInjection = "...' OR '1=1";
		
		List<ItemGroup> GET_IG_BY_NAME = itemGroupService.search(sqlInjection);
		GET_IG_BY_NAME.forEach(System.out::println);
		System.out.println("\n\n");
		
		System.out.println("------- 4. Get IG(s) Details");
		itemGroupService.getItemGroupDetails().forEach(System.out::println);
		System.out.println("\n\n");
		
	}

}
