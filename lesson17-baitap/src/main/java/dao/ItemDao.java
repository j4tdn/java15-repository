package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDao {
	List<Item> getItems(LocalDate orderDate);
	List<Item> getTop3(LocalDate orderDate);
}
