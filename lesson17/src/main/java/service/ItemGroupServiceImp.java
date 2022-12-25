package service;

import java.util.List;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroupDto;

public class ItemGroupServiceImp implements ItemGroupService {
  
    private ItemGroupDao itemGroupDao;
    
    public ItemGroupServiceImp() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	@Override
	public List<ItemGroupDto> getAll() {
		
		return itemGroupDao.getAll();
	}

}
