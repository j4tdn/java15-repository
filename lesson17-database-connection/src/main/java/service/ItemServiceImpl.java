package service;

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
	public List<Item> getItems(String igName) {
		return itemDao.getAll();
	}

}
