package service;

import java.util.List;

import dao.HibernateItemDetailDao;
import dao.ItemDetailDao;
import persistence.ItemDetail;

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
