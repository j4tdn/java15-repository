package view;

import java.util.List;

import persistence.Item;
import persistence.ItemDetail;
import persistence.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImp;

// view -> service -> dao
// luc compile chi vao interface
// luc run time chay vao service
public class ItemGroupView {
	private static ItemGroupService itemGroupService;

	static {
		itemGroupService = new ItemGroupServiceImp();
	}

	public static void main(String[] args) {
		// itemGroupService.store(new ItemDetail(10, 3, "XXL", 1));
		System.out.println("1.Save Or Update");
		itemGroupService.saveOrUpdate(new ItemGroup(1234, "Loai Hang 1423"));
		System.out.println("\n\n");

		/*
		 * List<ItemGroup> GET_ALL_IGS = itemGroupService.getAll();
		 * System.out.println("GET_ALL_IGS -->");
		 * GET_ALL_IGS.forEach(System.out::println);
		 */
		System.out.println("2.Get IG By ID");
		ItemGroup GET_IG_BY_ID = itemGroupService.get(4);
		System.out.println("GET_IG_BY_ID -->" + GET_IG_BY_ID);
		System.out.println("\n\n");
		System.out.println("3.Get IG By Name");
		String sqlName = "Item Group 2";
		String sqlInjection = "...' OR '1=1";
		List<ItemGroup> igByName = itemGroupService.search(sqlInjection);
		igByName.forEach(System.out::println);
		System.out.println("\n\n");
		System.out.println("4.");
		List<ItemGroup> list = itemGroupService.getIg();
		list.forEach(System.out::println);
		/*
		 * List<Item> GET_ALL_ITEMS = itemGroupService.getItems();
		 * GET_ALL_ITEMS.forEach(System.out::println); Item GET_ITEM_BY_ID =
		 * itemGroupService.getItem(102); System.out.println("GET_ITEM_BY_ID" +
		 * GET_ITEM_BY_ID);
		 */
		System.out.println("-------------------------5. Get IG-DTO(s)");
		itemGroupService.getItemgroups().forEach(System.out::println);
		System.out.println("\n\n");
	}
}
