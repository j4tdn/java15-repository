package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<Item> getItems(LocalDate orderDate) {
		return itemDao.getItems(orderDate);
	}

	@Override
	public List<Item> getTop3(LocalDate orderYear) {
		return itemDao.getTop3(orderYear);
	}
}
