package service;

import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;

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
	@Override
	public List<ItemGroup> getAllItemGroupDetails() {
		List<Item> items = itemDao.getAll();
		return items.stream()
					.collect(Collectors.groupingBy(Item::getItemGroup))
					.entrySet()
					.stream()
//					.map(t -> new ItemGroup(t))
					.map(ItemGroup::new)
					.collect(Collectors.toList());
	}
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	@Override
	public List<ItemGroup> search(String name) {
		Objects.requireNonNull(name,"ig name can't be null");
		return itemGroupDao.search(name);
	}
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		//itemGroupDao.get(itemGroup.getId()) == null
		if (!Optional.ofNullable(itemGroupDao.get(itemGroup.getId())).isPresent())
		{
			System.out.println("ig is existed --> executing save ...");
			itemGroupDao.save(itemGroup);
		}else 
		{
			System.out.println("ig is not existed --> executing update ...");
			itemGroupDao.update(itemGroup);
		}
	}
	@Override
	public void save(List<ItemGroup> itemGroups) {
		itemGroupDao.save(itemGroups);
		
	}
}
