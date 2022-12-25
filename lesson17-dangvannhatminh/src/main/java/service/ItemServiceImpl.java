package service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import dao.ItemDao;
import dao.JdbcItemDao;
import dto.ItemDto;
import dto.ItemDtoByIG;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	@Override
	public List<ItemDto> getItems(LocalDate deliveryDate) {
		return itemDao.getItems(deliveryDate);
	}
	@Override
	public List<String> getTop3ItemsToSring(int year) {
		return itemDao.getTopThreeItemByYear(year).stream()
												  .map(ItemDto::getName)
												  .collect(Collectors.toList());
	}
	@Override
	public List<ItemDtoByIG> getItemsGroupByIG() {
		return itemDao.getItemsGroupByItemGroup();
	}
}
