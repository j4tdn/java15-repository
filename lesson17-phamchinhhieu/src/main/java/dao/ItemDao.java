package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;
import persistence.ItemDtoByIG;

public interface ItemDao {

	List<ItemDto> getItemsbyDate(LocalDate deliveryOrder);
	List<ItemDto> getTop3Items(Integer year);
	List<ItemDtoByIG> getItemsByIG();
}
