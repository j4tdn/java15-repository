package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemDtoByIG;

public interface ItemService {
	List<ItemDto> getItemsbyDate(LocalDate deliveryOrder);
	List<String> getTop3Items(Integer year);
	List<ItemDtoByIG> getItemsByIG();
}
