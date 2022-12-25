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
import persistence.ItemDetail;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImp implements ItemGroupService {
	private ItemGroupDao itemGroupDao;
    private ItemDao itemDao;
	public ItemGroupServiceImp() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	
	public List<ItemGroup> getIg(){
		List<Item> items = itemDao.getAll();
		 // Item : id , name , color , itemGroup
		// idA1 , nameA1 , colorA1 , itemGroupA
		// idA2 , nameA2 , colorA2, itemGroupA
		// idB1 , nameB1 , colorB1, itemGroupB
		// idB2 , nameB2 , colorB2, itemGroupB
		
		// 	result : itemGroup , itemList
		// 	itemGroupA, listItem --> itemA1 , itemA2 , ...
		// 	itemGroupB, listItem --> itemB1 , itemB2 , ...
		return items.stream()
				.collect(Collectors.groupingBy(Item::getItemGroup)) //map
				.entrySet() // set<entry<k,v>>
				.stream() //stream<entry>
				.map(ItemGroup::new) 
				.collect(Collectors.toList());
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}

	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		if (Optional.ofNullable(itemGroupDao.get(itemGroup.getId())).isPresent()) {
			System.out.println("ig is existed --> executing update ...");
			itemGroupDao.update(itemGroup);
		} else {
			System.out.println("ig is not existed --> executing save ...");
			itemGroupDao.update(itemGroup);
		}
	}
	@Override
	public List<ItemGroup> search(String name) {
		// TODO Auto-generated method stub
		Objects.requireNonNull(name, "ig name cannot be null");
		return itemGroupDao.search(name);
	}
	



	@Override
	public void store(ItemDetail itemDetail) {
		
			itemGroupDao.store(itemDetail);
		
	}

	@Override
	public List<ItemGroupDto> getItemgroups() {
		// TODO Auto-generated method stub
		return itemGroupDao.getItemGroups();
	}

	@Override
	public void save(List<ItemGroup> itemGroups) {
		itemGroupDao.save(itemGroups);
		
	}

	
}
