package service;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDto;
import dto.ItemDtoByIG;

public interface ItemService {
	List<ItemDto> getItems(LocalDate lDate);
	List<String> getTop3ItemsToSring(int year);
	List<ItemDtoByIG> getItemsGroupByIG();
}
