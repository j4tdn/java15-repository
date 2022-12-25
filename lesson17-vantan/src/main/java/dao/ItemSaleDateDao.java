package dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import persistence.ItemSaleDate;

public interface ItemSaleDateDao {
	List<ItemSaleDate> get(LocalDate date);
}
