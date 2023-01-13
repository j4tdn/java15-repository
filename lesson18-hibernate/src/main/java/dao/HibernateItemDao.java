package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Item;

public class HibernateItemDao extends AbstractHibernateDao 
	implements ItemDao  {
	
	private static String GET_ALL_ITEMS = ""
			+ "SELECT * FROM MatHang";
	
	@Override
	public List<Item> getAll() {
		Session session = openSession();
		NativeQuery<Item> query = session.createNativeQuery(
				GET_ALL_ITEMS, Item.class);
		List<Item> result = query.getResultList();
		return result;
	}
	
}
