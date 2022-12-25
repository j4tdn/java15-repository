package dao;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDto;
import dto.ItemDtoByIG;

public interface ItemDao {
	List<ItemDto> getItems(LocalDate lDate);
	List<ItemDto> getTopThreeItemByYear(int year);
	List<ItemDtoByIG> getItemsGroupByItemGroup(); 
}
