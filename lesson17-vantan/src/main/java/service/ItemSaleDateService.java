package service;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemSaleDate;

public interface ItemSaleDateService {
	List<ItemSaleDate> get(LocalDate date);
}
