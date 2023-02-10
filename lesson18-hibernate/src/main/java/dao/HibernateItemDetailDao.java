package dao;

import java.util.List;

import persistence.ItemDetail;

public class HibernateItemDetailDao extends AbstractHibernateDao implements ItemDetailDao{

	@Override
	public List<ItemDetail> getAll() {
		
		return openSession().createQuery("SELECT itd FROM ItemDetail itd WHERE itd.id.itemId = 1", ItemDetail.class)
				.getResultList();
	}

}
