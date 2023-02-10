package service;

import java.util.List;

import org.hibernate.Session;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
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
	public void saveOrUpdate(ItemGroup itemGroup) {
		itemGroupDao.saveOrUpdate(itemGroup);
	}

	@Override
	public void demo1stCacheLevel() {
		// TODO Auto-generated method stub
		itemGroupDao.demo1stCacheLevel();
	}

	
}
