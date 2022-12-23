package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	ItemGroup get(int id);
	List<ItemGroupDto> getItemGroups();
	List<ItemGroup> search(String name);
	
	
	void save(ItemGroup itemGroup);
	void update(ItemGroup itemGroup);
	
}
