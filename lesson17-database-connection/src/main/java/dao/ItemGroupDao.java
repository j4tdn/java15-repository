package dao;

import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();

	ItemGroup get(int id);

	List<ItemGroup> search(String name);

	void save(ItemGroup itemGroup);

	void update(ItemGroup itemGroup);
}
