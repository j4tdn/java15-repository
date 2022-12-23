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
		System.out.println("-----1. Save Or Update ------");
		itemGroupService.saveOrUpdate(new ItemGroup(1234, "LoaiHang 1423"));
		System.out.println("\n\n");
		
		/*
		List<ItemGroup> GET_ALL_IGS = itemGroupService.getAll();
		System.out.println("GET_ALL_IGS --> ");
		GET_ALL_IGS.forEach(System.out::println);
		*/
		
		System.out.println("------2. Get IG by ID ----------");
		ItemGroup GET_IG_BY_ID = itemGroupService.get(4);
		System.out.println(GET_IG_BY_ID);
		System.out.println("\n\n");
		
		System.out.println("------3. Search IG by name ----------");
		String sqlInjection = "...' OR '1=1";
		List<ItemGroup> igsByName = itemGroupService.search(sqlInjection);
		igsByName.forEach(System.out::println);
		System.out.println(igsByName);
		System.out.println("\n\n");
		
		System.out.println("------4. Get IG(s) detail ----------");
		itemGroupService.getItemsDetail().forEach(System.out::println);
		System.out.println("\n\n");
		
		System.out.println("------- 5. Get IG-DTO(s) ----------");
		itemGroupService.getItemGroups().forEach(System.out::println);
		System.out.println("\n\n");
		
		
	}
}
