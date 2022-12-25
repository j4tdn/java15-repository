package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.ItemDto;

public class ItemServiceImpl implements ItemService{
	
	private static ItemDao itemDao;
	
	static {
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<ItemDto> listItemInDay(LocalDate date) {
		return itemDao.listOrderInDay(date);
	}
}
