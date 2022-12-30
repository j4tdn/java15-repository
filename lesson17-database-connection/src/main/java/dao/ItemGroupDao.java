package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> getItemGroups();
	
	ItemGroup get(int id);

	List<ItemGroup> search(String name);

	void save(ItemGroup itemGroup);

	void save(List<ItemGroup> itemGroups);

	void update(ItemGroup itemGroup);
	
}
