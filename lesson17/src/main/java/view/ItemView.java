package view;

import java.time.LocalDate;
import java.util.Calendar;

import service.ItemService;
import service.ItemServiceImp;

public class ItemView {
	public static ItemService itemService;

	static {
		itemService = new ItemServiceImp();
	}

	public static void main(String[] args) {
		LocalDate deliveryDate = LocalDate.of(2020,12,18);
   //     itemService.getItems(deliveryDate).forEach(System.out::println);
  //     itemService.getItemWithHighestPrice().forEach(System.out::println);
  //	itemService.getHotItems(2020).forEach(System.out::println);
	}
}
