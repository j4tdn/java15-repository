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
	
		System.out.println("--------1. Save Or Update---------------");
		//	itemGroupService.save(new ItemGroup(1234,));
		itemGroupService.saveOrUpdate(new ItemGroup(1235, "LoaiHang 1523"));
		System.out.println("\n\n");
//		List<ItemGroup> GET_ALL_IGS = itemGroupService.getAll();
//		GET_ALL_IGS.forEach(System.out::println);
		System.out.println("--------2. Get IG by id------------");
		ItemGroup GET_IG_BY_ID = itemGroupService.get(1);
		System.out.println("--->" + GET_IG_BY_ID);
		System.out.println("\n\n");
		
		
		System.out.println("--------3. Search IG by name---------------");
		String sqlName = "Thắt lưng";
		String sqlInjection = "...' OR ' 1=1";
		List<ItemGroup> igByName = itemGroupService.search(sqlInjection);
		igByName.forEach(System.out::println);
		System.out.println("\n\n");
		
		
		System.out.println("----4 Get(IG) details----");
		itemGroupService.getItemGroupDetails().forEach(System.out::println);
		
		
		System.out.println("-----5. Get IG-DTO----");
		
		itemGroupService.getItemGroups().forEach(System.out::println);


	}
}
