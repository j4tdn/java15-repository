package dao;

import java.util.List;

import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao implements ItemDao {
	
	private static String GET_ALL_ITEMS = ""
			+ "SELECT * FROM MatHang";
	
	@Override
	public List<Item> getAll() {
		return openSession().createNativeQuery(GET_ALL_ITEMS, Item.class).getResultList();
	}

}
