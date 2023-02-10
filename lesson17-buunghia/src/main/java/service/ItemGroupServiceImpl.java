package service;

import java.util.List;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	@Override
	public List<ItemGroupDto> getAmount() {
		return itemGroupDao.getAmount();
	}
}
