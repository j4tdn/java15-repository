package service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	
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
	
	@Override
	public List<ItemGroup> getItemGroupDetails() {
		List<Item> items = itemDao.getAll();
		
		// items
		// idA1, nameA1, colorA1, itemGroupA
		// idA2, nameA2, colorA2, itemGroupA
		// idB1, nameB1, colorB1, itemGroupB
		// idB2, nameB2, colorB2, itemGroupB
		
		// item_group(s)
		// itemGroupA, List<Item> --> idA1.., idA2..
		// itemGroupB, List<Item> --> idB1.., idB2..
		
		// Entry<K, V>
		return items.stream()
			.collect(Collectors.groupingBy(Item::getItemGroup)) // map
			.entrySet()
			.stream()
			.map(ItemGroup::new)
			.collect(Collectors.toList());
	}
	
	@Override
	public List<ItemGroupDto> getItemGroups() {
		return itemGroupDao.getItemGroups();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public List<ItemGroup> search(String name) {
		Objects.requireNonNull(name, "ig name cannot be null");
		return itemGroupDao.search(name);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		if (Optional.ofNullable(itemGroupDao.get(itemGroup.getId())).isPresent()) {
			System.out.println("ig is existed --> executing update ...");
			itemGroupDao.update(itemGroup);
		} else {
			System.out.println("ig is not exist --> executing save ...");
			itemGroupDao.save(itemGroup);
		}
	}
	
	@Override
	public void save(List<ItemGroup> itemGroups) {
		itemGroupDao.save(itemGroups);
	}
}
