package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {
	List<Item> getItems(String name);
	List<Item> getAll();
}
