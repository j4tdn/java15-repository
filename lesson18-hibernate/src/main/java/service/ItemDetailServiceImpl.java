package service;

import java.util.List;

import dao.HibernateItemDetailDao;
import dao.HibernateItemGroupDao;
import dao.ItemDetailDao;
import dao.ItemGroupDao;
import persistence.ItemDetail;
import persistence.ItemGroup;

public class ItemDetailServiceImpl implements ItemDetailService {
	private ItemDetailDao itemDetailDao;
	
	public ItemDetailServiceImpl() {
		itemDetailDao = new HibernateItemDetailDao();
	}
	
	@Override
	public List<ItemDetail> getAll() {
		return itemDetailDao.getAll();
	}

}
