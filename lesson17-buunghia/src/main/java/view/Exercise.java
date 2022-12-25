package view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import persistence.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class Exercise {
	private static ItemService itemService ;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Item> ex01 = itemService.getItemWithOrderDate(LocalDate.parse("18/12/2020",formatter));
		ex01.forEach(System.out::println);
	}
}
