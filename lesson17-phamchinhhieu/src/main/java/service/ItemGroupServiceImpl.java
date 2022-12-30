package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}

	
	public List<ItemGroupDto> getItemGroups() {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemsGroups();
	}


	@Override
	public void save(List<ItemGroup> itemGroups) {
		// TODO Auto-generated method stub
		
	}
}
