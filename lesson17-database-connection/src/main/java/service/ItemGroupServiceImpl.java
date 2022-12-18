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
	@Override
	public List<ItemGroup> getAll() {
		
		return itemGroupDao.getAll();
	}
	
	public List<ItemGroupDto> getItemGroups() {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemsGroups();
	}
	
	@Override
	public List<ItemGroup> getItemGroupDetails() {
		List<Item> items= itemDao.getAll();
		return items.stream()
				.collect(Collectors.groupingBy(Item::getItemGroup)) //map
				.entrySet()
				.stream()
				.map(ItemGroup::new)
				.collect(Collectors.toList());
	}
	
	@Override
	public ItemGroup get(int id) {
		// TODO Auto-generated method stub
		return itemGroupDao.get(id);
	}
	
	@Override
	public List<ItemGroup> search(String name) {
	//	Objects.requireNonNull(null)
		return itemGroupDao.search(name);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
//		if(itemGroupDao.get(itemGroup.getId()) == null) {
//			itemGroupDao.save(itemGroup);
//		}
//		else {
//			itemGroupDao.update(itemGroup);
//		}
//		itemGroupDao.save(itemGroup);
		if(Optional.ofNullable(itemGroupDao.get(itemGroup.getId())).isPresent()) {
			System.out.println("ig is existed --> update");
			itemGroupDao.update(itemGroup);
		}
		else {
			System.out.println("ig is existed --> save");

			itemGroupDao.save(itemGroup);
		}
	}
	

	

}
