package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemSaleDateDao;
import dao.JdbcItemSaleDateDao;
import persistence.ItemSaleDate;

public class ItemSaleDateIplm implements ItemSaleDateService{
	private ItemSaleDateDao itemSaleDateDao;
	
	public ItemSaleDateIplm() {
		itemSaleDateDao = new JdbcItemSaleDateDao();
	}

	@Override
	public List<ItemSaleDate> get(LocalDate date) {
		
		return itemSaleDateDao.get(date);
	}
	
	
}
