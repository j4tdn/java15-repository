package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroups() {
		return itemGroupDao.getItemGroups();
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		itemGroupDao.saveOrUpate(itemGroup);
	}
	
	@Override
	public void demo1stLevelCache() {
		itemGroupDao.demo1stLevelCache();
	}
}
