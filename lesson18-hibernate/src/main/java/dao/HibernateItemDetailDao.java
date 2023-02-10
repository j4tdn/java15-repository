package dao;

import java.util.List;

import persistence.ItemDetail;

public class HibernateItemDetailDao  extends AbstractHibernateDao implements ItemDetailDao {
	@Override
	public List<ItemDetail> getAll() {
		return openSession().createNativeQuery("SELECT * FROM ChiTietMatHang ctdh WHERE ctdh.MaMH =1", ItemDetail.class)
				            .getResultList();
	}

}
