package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto;

public interface ItemDao {
	List<ItemDto> listOrderInDay(LocalDate date);
	List<String> topItemInYear(int year);
}
