package service;

import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;

public class ItemServiceImp implements ItemService {
    private ItemDao itemDao;
    
    public ItemServiceImp() {
		itemDao = new JdbcItemDao();
	}

	@Override
	public List<Item> getItems(String igName) {
		// TODO Auto-generated method stub
		return itemDao.getItems(igName);
	}
    
	
}
