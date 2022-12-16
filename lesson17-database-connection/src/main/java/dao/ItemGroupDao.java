package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupRawData;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	List<ItemGroupRawData> getItemGroups();

	ItemGroup get(int id);

	List<ItemGroup> search(String name);

	void save(ItemGroup itemGroup);

	void update(ItemGroup itemGroup);
}
