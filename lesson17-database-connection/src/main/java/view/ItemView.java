package view;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import persistence.Item;
import persistence.ItemGroup;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService ;
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("1. Get items by ig name --------");
		itemService.getItems("áo").forEach(System.out::println);
		Map<ItemGroup, List<Item>> items = itemService.getItems("áo")
													 .stream()
													 .collect(Collectors.groupingBy(t -> t.getItemGroup()));
		System.out.println(items);
		System.out.println("\n\n");
	}
}
