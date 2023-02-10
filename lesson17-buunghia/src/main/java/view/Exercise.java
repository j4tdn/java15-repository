package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import dto.ItemGroupDto;
import persistence.Item;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class Exercise {
	private static ItemService itemService ;
	private static ItemGroupService itemGroupService;
	
	static {
		itemService = new ItemServiceImpl();
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Item> ex01 = itemService.getItemWithOrderTime(LocalDate.parse("18/12/2020",formatter));
		ex01.forEach(System.out::println);
		List<ItemGroupDto> ex02 = itemGroupService.getAmount();
		ex02.forEach(System.out::println);
		
	}
}
