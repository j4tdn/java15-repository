package dao;

import java.util.List;

import persistence.Item;
import persistence.ItemDetail;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroupDto> getItemGroups();

	List<ItemGroup> getAll();

	ItemGroup get(int id);

	List<ItemGroup> search(String name);

	void save(ItemGroup itemGroup);

	void update(ItemGroup itemGroup);

	void store(ItemDetail itemDetail);

}
