package service;

import java.util.List;

import connection.HibernateProvider;
import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroups() {
		return itemGroupDao.getItemGroups();
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		itemGroupDao.saveOrUpdate(itemGroup);
	}
	
	@Override
	public void demo1stLevelCache() {
		itemGroupDao.demo1stLevelCache();
	}
}
