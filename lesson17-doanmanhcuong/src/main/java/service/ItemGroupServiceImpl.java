package service;

import java.util.List;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;
	
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	

	@Override
	public List<ItemGroupDto> getItemsByItemGroup() {
		return itemGroupDao.getItemsByItemGroup();
	}

}